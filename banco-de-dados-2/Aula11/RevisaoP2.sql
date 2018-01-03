--Cria��o do Banco para receber os arquivos .csv
create database RevisaoP2
go
use RevisaoP2
go
--altera��o dos tipos da tabela importada
select * from customer
select * from orders

alter table customer alter column customerid int not null
alter table customer add primary key(customerid)

alter table orders alter column customerid int
alter table orders add foreign key(customerid) references customer(customerid)
alter table orders alter column order_date date
alter table orders alter column quantity int
alter table orders alter column price decimal(7,2)

--Exerc�cio 1)
go
create view vwCustomersOrders as
	select customer.firstname, customer.lastname, orders.order_date, orders.item, orders.price
	from customer inner join orders
	on customer.customerid = orders.customerid
	order by lastname offset 0 rows --offset 0 rows => ignora as 0 primeiras linhas e retorna as restantes
go
    ---testando a view
select * from vwCustomersOrders

--Exerc�cio 2)
go
USE [master]
GO
CREATE LOGIN [restrito] WITH PASSWORD=N'123', DEFAULT_DATABASE=[RevisaoP2], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [RevisaoP2]
GO
CREATE USER [restrito] FOR LOGIN [restrito] -- adicionando usu�rio 'restrito' ao banco RevisaoP2
GO
GRANT SELECT ON [dbo].[vwCustomersOrders] TO [restrito] --atribuindo permiss�o ao comando select � view ao usu�rio 'restrito'
GO
--Exerc�cio 3)
create procedure spInsereOrders
	@customerid int,
	@firstname varchar(50),
	@lastname varchar(50),
	@city varchar(50),
	@state varchar(50),
	@order_date date,
	@item varchar(50),
	@quantity int,
	@price decimal(7,2)
as
begin
	if exists (select customerid from customer where customerid = @customerid) --verifica se o @customerid em quest�o j� existe na tabela customer
	--caso o @customerid j� exista na tabela customer, � inserido os valores apenas na tabela orders
		insert into orders (customerid, order_date, item, quantity, price) values (@customerid, @order_date, @item, @quantity, @price)
	else
	begin
	--caso o @customerid nao exista na tabela customer, ele � adicionado na tabela customer, e ap�s, inserido os valores na tabela orders
		insert into customer (customerid, firstname, lastname, city, state) values (@customerid, @firstname, @lastname, @city, @state)
		insert into orders (customerid, order_date, item, quantity, price) values (@customerid, @order_date, @item, @quantity, @price)
	end
end
go
--Exerc�cio 4)
/*
		Planejamento de Backup:
Backup completo: Todo domingo �s 00:00 at� as 18:00
Backup de log de transa��es: toda segunda, ter�a, quinta, sexta e s�bado das 3:00 as 5:00
Backup incremental: toda quarta feira das 3:00 as 5:00
*/
--Exerc�cio 5)
select getdate() --retorna a hora e dia atual
select DATEDIFF(DAY, '02/01/2004', getdate()) as 'total dias' --retorna a diferen�a entre duas datas
go
create function fncTempoUltimoPedido(@data date) returns int
as
begin
	return datediff(day, @data, getdate())
end
go
--testando
select customer.firstname, customer.lastname, orders.order_date, orders.item, orders.price, dbo.fncTempoUltimoPedido(orders.order_date) as totalDias
	from customer inner join orders
	on customer.customerid = orders.customerid
	order by lastname