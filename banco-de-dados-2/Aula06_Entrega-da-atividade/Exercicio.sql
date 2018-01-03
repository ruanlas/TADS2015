create database RevisaoBD2_P1
go
use RevisaoBD2_P1
go
select * from customer
select * from orders
go
--alterando o tipo de dados da tabela customer
alter table customer alter column CustomerID int not null
--alterando o tipo de dados da tabela orders
alter table orders alter column OrderID int
alter table orders alter column CustomerID int
alter table orders alter column EmployeeID int
alter table orders alter column OrderDate date
alter table orders alter column ShipperID int
--Exercício 1)
/*
Cliente([numero], preNome, sobreNome, endereco, telefone)
Locadora([CGC], nome)
Categoria([cod], nome)
Ator([cod], nomePopular, nomeArtistico, dataNascimento)
Filme([id], titulo, CodCategoria)
		CodCategoria referencia Categoria
FilmeAtor([cod], codFilme, codAtor)
		codFilme referencia Filme
		codAtor referencia Ator
DVD([numero], rolo, codFilme)
		codFilme referencia Filme
Emprestimo([cod], codLocadora, codDVD, codCliente)
		codLocadora referencia Locadora
		codDVD referencia DVD
		codCliente referencia Cliente
*/
create database revisaoP1_ex1
go
use revisaoP1_ex1
go
create table Cliente
(
numero int not null identity(1,1) primary key,
preNome varchar(30),
sobreNome varchar(30),
endereco varchar(50),
telefone varchar(15)
)
go
create table Locadora
(
CGC int not null primary key,
nome varchar(30)
)
go
create table Categoria
(
cod int not null identity(1,1) primary key,
nome varchar(30)
)
go
create table Ator
(
cod int not null identity(1,1) primary key,
nomePopular varchar(50),
nomeArtistico varchar(50),
dataNascimento date
)
go
create table Filme
(
id int not null identity(1,1) primary key,
titulo varchar(50),
codCategoria int
)
go
create table FilmeAtor
(
cod int not null identity(1,1) primary key,
codFilme int,
codAtor int
)
go
create table DVD
(
numero int not null identity(1,1) primary key,
rolo varchar(50),
codFilme int
)
go
create table Emprestimo
(
cod int not null identity(1,1) primary key,
codLocadora int,
codDVD int,
codCliente int
)
go
alter table Filme add foreign key(CodCategoria) references Categoria(cod)
alter table FilmeAtor add foreign key(codFilme) references Filme(id)
alter table FilmeAtor add foreign key(codAtor) references Ator(cod)
alter table DVD add foreign key(codFilme) references Filme(id)
alter table Emprestimo add foreign key(codLocadora) references Locadora(CGC)
alter table Emprestimo add foreign key(codDVD) references DVD(numero)
alter table Emprestimo add foreign key(codCliente) references Cliente(numero)
go
--Exercício 2)
use RevisaoBD2_P1
go
select customer.CustomerName, orders.OrderID 
from customer inner join orders 
	on customer.CustomerID = orders.CustomerID
order by customer.CustomerName
--Exercicio 3)
select customer.CustomerName, orders.OrderID 
from customer left join orders 
	on customer.CustomerID = orders.CustomerID
order by customer.CustomerName
--Exercicio 4)
/*o campo orders.OrderID é do tipo int, para isto, é esperado um retorno int. Assim é necessário fazer
um 'cast' para converter o campo para varchar e desta forma poder exibir o texto proposto*/
select customer.CustomerName, ISNULL(cast(orders.OrderID as varchar), 'SEM PEDIDO RELACIONADO') as OrderID
from customer left join orders 
	on customer.CustomerID = orders.CustomerID
order by customer.CustomerName
--Exercicio 5)
select customer.CustomerName, count(orders.OrderID) as Total_OrdersID
from customer inner join orders 
	on customer.CustomerID = orders.CustomerID
group by customer.CustomerName
order by Total_OrdersID desc
--Exercício 6)
select top 10 customer.CustomerName, count(orders.OrderID) as Total_OrdersID
from customer inner join orders 
	on customer.CustomerID = orders.CustomerID
group by customer.CustomerName
order by Total_OrdersID desc
--Exercicio 7)
select customer.CustomerName, count(orders.OrderID) as Total_OrdersID
from customer left join orders 
	on customer.CustomerID = orders.CustomerID
group by customer.CustomerName
order by Total_OrdersID
--Exercicio 8)
select  'Quantidade de pedidos',
		[0_pedido] = count(case when sub_query.Total_OrdersID = 0 then sub_query.Total_OrdersID end),
		[1_pedido] = count(case when sub_query.Total_OrdersID = 1 then sub_query.Total_OrdersID end),
		[2_pedidos] = count(case when sub_query.Total_OrdersID = 2 then sub_query.Total_OrdersID end),
		[3_pedidos] = count(case when sub_query.Total_OrdersID = 3 then sub_query.Total_OrdersID end),
		[4_pedidos] = count(case when sub_query.Total_OrdersID = 4 then sub_query.Total_OrdersID end),
		[5_pedidos] = count(case when sub_query.Total_OrdersID = 5 then sub_query.Total_OrdersID end),
		[6_pedidos] = count(case when sub_query.Total_OrdersID = 6 then sub_query.Total_OrdersID end),
		[7_pedidos] = count(case when sub_query.Total_OrdersID = 7 then sub_query.Total_OrdersID end),
		[8_pedidos] = count(case when sub_query.Total_OrdersID = 8 then sub_query.Total_OrdersID end),
		[9_pedidos] = count(case when sub_query.Total_OrdersID = 9 then sub_query.Total_OrdersID end),
		[10_pedidos] = count(case when sub_query.Total_OrdersID = 10 then sub_query.Total_OrdersID end)
from ( 
		select customer.CustomerName,
			   count(Orders.OrderID) as Total_OrdersID
		from customer left outer join orders
			on customer.CustomerID = orders.CustomerID
		group by customer.CustomerName
	 ) as sub_query

--Exercício 10)
--para o ano de 1996
select distinct customer.CustomerName,
	   month_1 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 1 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_2 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 2 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_3 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 3 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_4 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 4 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_5 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 5 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_6 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 6 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_7 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 7 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_8 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 8 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_9 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 9 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_10 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 10 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_11 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 11 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0),
	   month_12 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 12 and DATEPART(YEAR, OrderDate) = 1996 group by orders.CustomerID), 0)
	   from customer inner join orders on customer.CustomerID = orders.CustomerID
--para o ano de 1997
select distinct customer.CustomerName,
	   month_1 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 1 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_2 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 2 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_3 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 3 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_4 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 4 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_5 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 5 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_6 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 6 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_7 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 7 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_8 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 8 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_9 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 9 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_10 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 10 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_11 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 11 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0),
	   month_12 = ISNULL((select count(orders.OrderID) from orders where orders.CustomerID = customer.CustomerID and DATEPART(MONTH,OrderDate) = 12 and DATEPART(YEAR, OrderDate) = 1997 group by orders.CustomerID), 0)
	   from customer inner join orders on customer.CustomerID = orders.CustomerID
