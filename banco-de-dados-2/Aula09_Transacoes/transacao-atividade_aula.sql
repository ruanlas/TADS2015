create database MeuBanco
go
use MeuBanco
go
create table conta(
id int primary key identity(1,1),
numero int not null,
agencia int not null,
saldo decimal(20,2) not null
--unique index idx_numero_agencia(numero, agencia)
);
go
 create unique index idx_numero_agencia on conta (numero, agencia)
go

create procedure transferir(@idd int, @idc int, @valor decimal(20,2))
as
	begin transaction
	update conta set saldo = saldo - @valor where id = @idd --cconta de débito
	update conta set saldo = saldo + @valor where id = @idc --conta de crédito

	if(select id from conta where id = @idd) is null or(select id from conta where id = @idc) is null 
	begin
		rollback
	end
	else
	begin
		commit transaction
	end

go

select * from conta

insert into conta(numero, agencia, saldo) values (1,1,10)
insert into conta(numero, agencia, saldo) values (2,1,10)
go

execute transferir 2, 1, 15

execute transferir 1, 2, 5

execute transferir 2, 3, 20

--
begin transaction
	update conta set saldo = saldo - 50 where saldo > 0
	update conta set saldo = saldo + 50 where saldo <=0
commit transaction

begin transaction
	update conta set saldo = saldo - 50 where saldo > 0
	update conta set saldo = saldo + 50 where saldo <=0
rollback transaction

select * from conta

