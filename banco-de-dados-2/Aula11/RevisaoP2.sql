--Criação do Banco para receber os arquivos .csv
create database RevisaoP2
go
use RevisaoP2
go
--alteração dos tipos da tabela importada
select * from customer
select * from orders

alter table customer alter column customerid int not null
alter table customer add primary key(customerid)

alter table orders alter column customerid int
alter table orders add foreign key(customerid) references customer(customerid)
alter table orders alter column order_date date
alter table orders alter column quantity int
alter table orders alter column price decimal(7,2)

--Exercício 1)
go
create view vwCustomersOrders as
	select customer.firstname, customer.lastname, orders.order_date, orders.item, orders.price
	from customer inner join orders
	on customer.customerid = orders.customerid
	order by lastname offset 0 rows --offset 0 rows => ignora as 0 primeiras linhas e retorna as restantes
go
    ---testando a view
select * from vwCustomersOrders

--Exercício 2)
go
USE [master]
GO
CREATE LOGIN [restrito] WITH PASSWORD=N'123', DEFAULT_DATABASE=[RevisaoP2], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [RevisaoP2]
GO
CREATE USER [restrito] FOR LOGIN [restrito] -- adicionando usuário 'restrito' ao banco RevisaoP2
GO
GRANT SELECT ON [dbo].[vwCustomersOrders] TO [restrito] --atribuindo permissão ao comando select à view ao usuário 'restrito'
GO
--Exercício 3)
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
	if exists (select customerid from customer where customerid = @customerid) --verifica se o @customerid em questão já existe na tabela customer
	--caso o @customerid já exista na tabela customer, é inserido os valores apenas na tabela orders
		insert into orders (customerid, order_date, item, quantity, price) values (@customerid, @order_date, @item, @quantity, @price)
	else
	begin
	--caso o @customerid nao exista na tabela customer, ele é adicionado na tabela customer, e após, inserido os valores na tabela orders
		insert into customer (customerid, firstname, lastname, city, state) values (@customerid, @firstname, @lastname, @city, @state)
		insert into orders (customerid, order_date, item, quantity, price) values (@customerid, @order_date, @item, @quantity, @price)
	end
end
go
--Exercício 4)
/*
		Planejamento de Backup:
Backup completo: Todo domingo às 00:00 até as 18:00
Backup de log de transações: toda segunda, terça, quinta, sexta e sábado das 3:00 as 5:00
Backup incremental: toda quarta feira das 3:00 as 5:00
*/
--Exercício 5)
select getdate() --retorna a hora e dia atual
select DATEDIFF(DAY, '02/01/2004', getdate()) as 'total dias' --retorna a diferença entre duas datas
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