/*
Nosso código do lado do cliente detecta deadlock, espera por um intervalo, em seguida, repete o pedido até 5 vezes. A lógica de
repetição detecta os deadlocks com base no numero de erro 1205.

Meu objetivo é testar tanto a lógica de repetição do deadlock quanto o deadlock da manipulação interna de vários procedimentos
armazenados. Posso criar um deadlock usando duas conexões diferentes. No entanto, gostaria de simular um deadlock dentro de um
unico procedimento armazenado em si.
Um deadlock levanta a seguinte mensagem de erro:
**Msg 1205, Level 13, State 51, Line 1
Transaction (Process ID 66) was deadlocked on lock resources with another process and has been chosen as the deadlock victim. Rerun the transaction.
**Msg 1205, Nível 13 , estado 51 , ​​linha 1 
Transação ( ID do processo 66 ) foi travada em recursos de bloqueio com outro processo e foi escolhido como vítima de deadlock . Execute novamente a transação

Eu vejo esta mensagem de erro em sys.messages:
select * from sys.messages where message_id = 1205 and language_id = 1033

Eu não posso levantar esse erro usando RAISERROR:
raiserror(1205, 13, 51)
**Msg 2732, Level 16, State 1, Line 1
Error number 1205 is invalid. The number must be from 13000 through 2147483647 and it cannot be 50000.
**Msg 2732 , nível 16, estado 1, linha 1
Número de erro 1205 é inválido. O número deve ser de 13000 a 2147483647 e não pode ser 50000 .
 
Nossas lógicas de repetição de deadlock verifica se o numero de erro é 1205. O deadlock precisa ter o mesmo message ID, nível e estado como um deadlock normal

Existe uma maneira de simular um deadlock (com RAISERROR ou qualquer outro meio ) e obter o mesmo número de mensagens com apenas um processo?

Nossos bancos de dados estão usando a compatibilidade SQL 2005 , embora os nossos servidores variam de 2005 a 2008 R2

Como muitos têm apontado, a resposta é não, um único processo de deadlock não pode ser confiável em si. Eu vi com a seguinte solução para simular um deadlock sobre
um sistema de desenvolvimento ou teste.

Execute o script a seguir em uma janela SQL Server Management Studio. ( Testado em 2008 R2 somente.) Você pode deixá-lo rodando enquanto for necessário .

No lugar que você deseja simular um deadlock , inserir uma chamada para sp_simulatedeadlock . Executar o seu processo e o deadlock deve ocorrer.

Quando terminar o teste , pare a consulta SSMS e execute o código de limpeza na parte inferior.

*/

/*
Este script ajuda simular deadlocks . Executar todo o script em uma janela de consulta SQL. Ele vai continuar em execução até ser parado .
No script de destino , insira uma chamada para sp_simulatedeadlock onde deseja que o impasse a ocorrer.
Este procedimento armazenado, também criou a seguir, as causas do deadlock .
Quando você terminar , pare a execução desta janela e execute o código na seção de limpeza na parte inferior.
*/
set nocount on

if object_id('DeadlockTest') is not null
    drop table DeadlockTest

create table DeadlockTest
(
    Deadlock_Key int primary key clustered,
    Deadlock_Count int
)
go

if exists (select * from sysobjects where id = object_id(N'sp_simulatedeadlock')
           AND objectproperty(id, N'IsProcedure') = 1)
drop procedure sp_simulatedeadlock
GO

create procedure sp_simulatedeadlock
(
    @MaxDeadlocks int = -1 -- especificar o número de deadlocks que você quer; -1 = constant deadlocking
)
as begin

    set nocount on

    if object_id('DeadlockTest') is null
        return

    -- Voluntário para ser uma vítima de deadlock.
    set deadlock_priority low

    declare @DeadlockCount int

    select @DeadlockCount = Deadlock_Count -- este começa em 0
    from DeadlockTest
    where Deadlock_Key = 2

    -- Trace o início de cada evento de deadlock.
    -- Para ouvir o evento de rastreamento, configurar um rastreamento do SQL Server Profiler com classe de evento "UserConfigurable:0".
    -- Observe que o usuário que executa este procedimento deve ter permissão ALTER TRACE.
    -- Além disso, note que existem apenas 128 caracteres permitidos no texto trace.
    declare @trace nvarchar(128)

    if @MaxDeadlocks > 0 AND @DeadlockCount > @MaxDeadlocks
    begin

        set @trace = N'Deadlock Test @MaxDeadlocks: ' + cast(@MaxDeadlocks as nvarchar) + N' @DeadlockCount: ' + cast(@DeadlockCount as nvarchar) + N' Resetting deadlock count.  Will not cause deadlock.'
        exec sp_trace_generateevent
            @eventid = 82,  -- 82 = UserConfigurable:0 a 91 = UserConfigurable:9
            @userinfo = @trace

        -- Redefinir o número de deadlocks.
        -- Esperamos que se houver uma operação externa, ele irá completar e persistir essa mudança.
        update DeadlockTest
        set Deadlock_Count = 0
        where Deadlock_Key = 2
        return
    end

    set @trace = N'Deadlock Test @MaxDeadlocks: ' + cast(@MaxDeadlocks as nvarchar) + N' @DeadlockCount: ' + cast(@DeadlockCount as nvarchar) + N' Simulating deadlock.'
    exec sp_trace_generateevent
        @eventid = 82,  -- 82 = UserConfigurable:0 a 91 = UserConfigurable:9
        @userinfo = @trace

    declare @StartedTransaction bit
    set @StartedTransaction = 0
    if @@trancount = 0
    begin
        set @StartedTransaction = 1
        begin transaction
    end

    -- Bloquear Segundo registro
    update DeadlockTest
    set Deadlock_Count = Deadlock_Count
    from DeadlockTest
    where Deadlock_Key = 2

    -- Bloquear Primeiro registro para causar o deadlock
    update DeadlockTest
    set Deadlock_Count = Deadlock_Count
    from DeadlockTest
    where Deadlock_Key = 1

    if @StartedTransaction = 1
        rollback    
end
go

insert into DeadlockTest(Deadlock_Key, Deadlock_Count)
select 1, 0
union select 2, 0

-- Força outros processos para ser vítima de deadlock.
set deadlock_priority high

begin transaction

while 1 = 1
begin

    begin try

        begin transaction

        -- bloqueia primeiro registro
        update DeadlockTest
        set Deadlock_Count = Deadlock_Count
        from DeadlockTest
        where Deadlock_Key = 1

        waitfor delay '00:00:10'

        -- bloqueia segundo registro (que será bloqueado quando o proc. alvo chamar sp_simulatedeadlock)
        update DeadlockTest
        set Deadlock_Count = Deadlock_Count
        from DeadlockTest
        where Deadlock_Key = 2

        rollback

    end try
    begin catch
        print 'Error ' + convert(varchar(20), ERROR_NUMBER()) + ': ' + ERROR_MESSAGE()
        goto cleanup
    end catch

end

cleanup:

if @@trancount > 0
    rollback

drop procedure sp_simulatedeadlock
drop table DeadlockTest