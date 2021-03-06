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
--Exerc�cio 1)
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
--Exerc�cio 2)
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
/*o campo orders.OrderID � do tipo int, para isto, � esperado um retorno int. Assim � necess�rio fazer
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
--Exerc�cio 6)
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
--caminho quase certo
select count(*) from (select * from orders) as r
select 'Quantidade de Pedidos',
		0_pedidos = select count(*) from
					(select customer.CustomerName, count(orders.OrderID)
					from customer inner join orders 
					on customer.CustomerID = orders.CustomerID
					group by customer.CustomerName having count(orders.OrderID) = 1)


					select count(*) from orders inner join customer
					on orders.CustomerID = customer.CustomerID
					having COUNT(*) = (select customer.CustomerName, count(orders.OrderID)
					from customer inner join orders 
					on customer.CustomerID = orders.CustomerID
					group by customer.CustomerName having count(orders.OrderID) = 1)

					select count(select customer.CustomerName, count(orders.OrderID)
					from customer inner join orders 
					on customer.CustomerID = orders.CustomerID
					group by customer.CustomerName having count(orders.OrderID) = 1)

select ISNULL(null,	'Ola') as fdf,  
[Janeiro] = count(case when count(orders.OrderID)=1 then orders.OrderID end)
		
		from orders inner join customer on customer.CustomerID = orders.CustomerID
		order by fdf
		select isnull(null, 'sadd') as fdf

select isnull(null, 'Quantidade de Pedidos')
	, 1_pedido = count(case when count(OrderID)=1 group by CustomerID then CustomerID end)
	, 2_pedido = count(case when count(orders.OrderID)=2 group by orders.CustomerID then orders.CustomerID end)
	from orders
	order by isnull(null, 'Quantidade de Pedidos')

	select ano = 'ola'
			,1_pedido = (select orders.OrderID from orders where OrderID = 1)

			from orders
			group by ano
			order by ano

use RevisaoBD2_P1
select * from orders
go
	select 
	 [1] as _pedido1,
	 [2] as _pedido2,
	 [3] as _pedido3
	from orders pivot (count(OrderID) for OrderID in ([1], [2], [3])) 
	group by [1]

	select count(OrderID), CustomerID from orders group by CustomerID

	select 32*3
	select 'hjh'

--Exerc�cio 10)
select * from customer
select * from orders
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
