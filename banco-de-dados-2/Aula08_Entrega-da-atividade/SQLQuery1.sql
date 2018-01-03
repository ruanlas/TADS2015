--Exercício 1)

create procedure calculo_IMC
	@peso float,
	@altura float
as
declare @Resultado varchar(30)
declare @IMC float
	set @IMC = @peso/(@altura*@altura)
	if @IMC <= 19 
		set @Resultado = 'Subpeso'
	else if @IMC >19 and @IMC <= 25
		set @Resultado = 'Peso normal'
	else if @IMC > 25 and @IMC <= 29.9
		set @Resultado = 'Sobrepeso'
	else if @IMC >=30
		set @Resultado = 'Obesidade'

select @Resultado as Resultado, @IMC as IMC

execute calculo_IMC 150, 1.87

--Exercício 2)
go
create procedure soma_par
	@numero1 int,
	@numero2 int
as
	declare @soma int
	set @soma = 0
	declare @cont int
	if @numero1 < @numero2
	begin
		set @cont = @numero1
		while @cont <= @numero2
		begin
			if @cont% 2 = 0
			begin
				set @soma = @soma + @cont
			end
				set @cont = @cont + 1
		end
	end
	else
	begin
		set @cont = @numero2
		while @cont <= @numero1
		begin
			if @cont% 2 = 0
			begin
				set @soma = @soma + @cont
			end
				set @cont = @cont + 1
		end
	end
select @soma as Resultado

execute soma_par 0, 100

--Exercício 3)

create table tempo(
id int primary key identity(1,1),
dia int,
mes int,
ano int,
data int)
go
insert into tempo (dia, mes, ano) values
(15, 1, 1999),
(15, 2, 1999),
(15, 3, 1999),
(15, 4, 1999),
(15, 5, 1999),
(15, 6, 1999),
(15, 7, 1999),
(15, 8, 1999),
(15, 9, 1999),
(15, 10, 1999)
select * from tempo
go

create procedure soma_tempo
	@numero int
as
	update tempo set data = (dia + mes + ano + @numero)

execute soma_tempo 10

--Exercício 4)
--sem tratamento para anos bissextos
go
create function dia_semana (@dia int, @mes int, @ano int) returns varchar(30)
as
begin
 declare @a int
 declare @b int
 declare @c int
 declare @d int
 declare @resto int
 declare @string varchar(30)

	set @a = @ano - 1900
	set @b = @a/4
	if @mes = 1 or @mes = 10
		set @c = 0
	else if @mes = 2 or @mes = 3 or @mes = 11
		set @c = 3
	else if @mes = 4 or @mes = 7
		set @c = 6
	else if @mes = 5
		set @c = 1
	else if @mes = 6
		set @c = 4
	else if @mes = 8
		set @c = 2
	else if @mes = 9 or @mes = 12
		set @c = 5
	set @d = @dia - 1
	set @resto = (@a + @b + @c + @d)%7

	if @resto = 0
		set @string = 'Segunda'
	else if @resto = 1
		set @string = 'Terça'
	else if @resto = 2
		set @string = 'Quarta'
	else if @resto = 3
		set @string = 'Quinta'
	else if @resto = 4
		set @string = 'Sexta'
	else if @resto = 5
		set @string = 'Sabado'
	else if @resto = 6
		set @string = 'Domingo'

	return @string
end
go

select dbo.dia_semana(01, 12, 1993)
select dbo.dia_semana(17, 05, 2016)

--Exercício 5)
create table saldoCliente(
id int not null primary key identity(1,1),
idCliente int,
saldo money)
go
create table movimentacaoCliente(
id int not null primary key identity(1,1),
idCliente int,
tipoMovimentacao varchar(30),
valor money)
go
insert into saldoCliente values
(2, 8000),
(4, 2883),
(5, 6540),
(6, 2000)
go
create trigger atualiza_saldo
	on movimentacaoCliente
	for insert
	as
	begin
		declare @idCliente int
		declare @tipoMovimentacao varchar(30)
		declare @valor money
	
		select @idCliente = idCliente, @tipoMovimentacao = tipoMovimentacao, @valor = valor from inserted
		if @tipoMovimentacao like 'debito'
			update saldoCliente set saldo = saldo - @valor where idCliente = @idCliente
		else if @tipoMovimentacao like 'credito'
			update saldoCliente set saldo = saldo + @valor where idCliente = @idCliente
	end
insert into movimentacaoCliente values (2, 'credito', 500)
insert into movimentacaoCliente values (2, 'debito', 1000)
select * from saldoCliente