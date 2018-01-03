/* Ruan Luiz Alves da Silva 150051-1
*/
--Exercício 1)
create database escola
go
use escola
go
create table Disciplinas
(
codigo int not null identity(1,1) primary key,
descricao varchar(50)
)
go
create table Professores
(
codigo int not null identity(1,1) primary key,
nome varchar(50)
)
go
create table Sala
(
codigo int not null identity(1,1) primary key,
localizacao varchar(50)
)
go
create table Turma
(
codigo int not null identity(1,1) primary key,
periodo varchar(30),
turno varchar(30),
codSala int foreign key references Sala(codigo)
)
go
create table Aulas_Turma
(
id int not null identity(1,1) primary key,
codDisciplina int foreign key references Disciplinas(codigo),
codTurma int foreign key references Turma(codigo)
)
go
create table Turma_Professores
(
id int not null identity(1,1) primary key,
codProfessor int foreign key references Professores(codigo),
codTurma int foreign key references Turma(codigo)
)
go
insert into Disciplinas values
('Ed. Física'),
('Anatomia Animal'),
('Fisica Aplicada'),
('Matemática')
go
insert into Sala values
('Térreo A1'),
('Térreo B2')
go
insert into Turma values
('1º Semestre', 'Integral', 1),
('3º Semestre', 'Noturno',2)
go
insert into Professores values
('Marcos Nobre'),
('Cristiano Rezende')
go
insert into Aulas_Turma values
(1, 1),
(2, 1),
(4, 1),
(3, 2),
(4, 2)
go
insert into Turma_Professores values
(1, 1),
(1, 2),
(2, 1),
(2, 2)

--Exercício 2)
--banco que irá armazenar as tabelas customer e orders
create database Prova_P1
go
use Prova_P1
go
select * from orders
select * from customer
alter table orders alter column customerid int

set dateformat dmy
alter table orders
alter column order_date smalldatetime
--alter table orders alter column order_date date
alter table orders alter column quantity int
alter table orders alter column price decimal(6,2)

alter table customer alter column customerid int

--Exercício 2a)
select customer.firstname, customer.lastname, orders.order_date, orders.item, orders.price
from customer inner join orders on customer.customerid = orders.customerid
order by customer.lastname, orders.order_date
--Exercício 2b)
select customer.state, count(customer.customerid) as [Total itens], sum(orders.price) as [Total Price]
from customer inner join orders on customer.customerid = orders.customerid
group by customer.state
--Exercício 2c)
select concat(customer.firstname,' ',customer.lastname) as [Full name], count(orders.customerid) as [Total items], sum(orders.price) as [Total price]
from customer inner join orders on customer.customerid = orders.customerid
group by concat(customer.firstname,' ',customer.lastname)
order by [Total price] desc
--Exercício 2d)
select concat(customer.firstname,' ',customer.lastname) as [Full name], count(orders.customerid) as [Total items], isnull(sum(orders.price), 0) as [Total price]
from customer left join orders on customer.customerid = orders.customerid
group by concat(customer.firstname,' ',customer.lastname)
order by [Total price] desc
--Exercício 2e)
-----Para o ano de 1999
select concat(customer.firstname,' ',customer.lastname) as [Full name],
	   month_1 = sum(case when datepart(month, orders.order_date) = 1 then orders.price end),
	   month_2 = sum(case when datepart(month, orders.order_date) = 2 then orders.price end),
	   month_3 = sum(case when datepart(month, orders.order_date) = 3 then orders.price end),
	   month_4 = sum(case when datepart(month, orders.order_date) = 4 then orders.price end),
	   month_5 = sum(case when datepart(month, orders.order_date) = 5 then orders.price end),
	   month_6 = sum(case when datepart(month, orders.order_date) = 6 then orders.price end),
	   month_7 = sum(case when datepart(month, orders.order_date) = 7 then orders.price end),
	   month_8 = sum(case when datepart(month, orders.order_date) = 8 then orders.price end),
	   month_9 = sum(case when datepart(month, orders.order_date) = 9 then orders.price end),
	   month_10 = sum(case when datepart(month, orders.order_date) = 10 then orders.price end),
	   month_11 = sum(case when datepart(month, orders.order_date) = 11 then orders.price end),
	   month_12 = sum(case when datepart(month, orders.order_date) = 12 then orders.price end)
from customer left outer join orders
	on customer.customerid = orders.customerid where datepart(year, orders.order_date) = 1999
group by concat(customer.firstname,' ',customer.lastname)
order by concat(customer.firstname,' ',customer.lastname)
-----Para o ano de 2000
select concat(customer.firstname,' ',customer.lastname) as [Full name],
	   month_1 = sum(case when datepart(month, orders.order_date) = 1 then orders.price end),
	   month_2 = sum(case when datepart(month, orders.order_date) = 2 then orders.price end),
	   month_3 = sum(case when datepart(month, orders.order_date) = 3 then orders.price end),
	   month_4 = sum(case when datepart(month, orders.order_date) = 4 then orders.price end),
	   month_5 = sum(case when datepart(month, orders.order_date) = 5 then orders.price end),
	   month_6 = sum(case when datepart(month, orders.order_date) = 6 then orders.price end),
	   month_7 = sum(case when datepart(month, orders.order_date) = 7 then orders.price end),
	   month_8 = sum(case when datepart(month, orders.order_date) = 8 then orders.price end),
	   month_9 = sum(case when datepart(month, orders.order_date) = 9 then orders.price end),
	   month_10 = sum(case when datepart(month, orders.order_date) = 10 then orders.price end),
	   month_11 = sum(case when datepart(month, orders.order_date) = 11 then orders.price end),
	   month_12 = sum(case when datepart(month, orders.order_date) = 12 then orders.price end)
from customer left outer join orders
	on customer.customerid = orders.customerid where datepart(year, orders.order_date) = 2000
group by concat(customer.firstname,' ',customer.lastname)
order by concat(customer.firstname,' ',customer.lastname)
--Exercício 2f)
select concat(customer.firstname,' ',customer.lastname) as [Full name],
	   Y1999S1 = sum(case when datepart(month, orders.order_date) <= 6 and datepart(year, orders.order_date) = 1999 then orders.price end),
	   Y1999S2 = sum(case when datepart(month, orders.order_date) >= 7 and datepart(year, orders.order_date) = 1999 then orders.price end),
	   Y2000S1 = sum(case when datepart(month, orders.order_date) <= 6 and datepart(year, orders.order_date) = 2000 then orders.price end),
	   Y2000S2 = sum(case when datepart(month, orders.order_date) >= 7 and datepart(year, orders.order_date) = 2000 then orders.price end)
from customer inner join orders
	on customer.customerid = orders.customerid
group by concat(customer.firstname,' ',customer.lastname)
order by concat(customer.firstname,' ',customer.lastname)