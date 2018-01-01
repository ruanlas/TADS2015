create database Exercicio_2
go
use Exercicio_2
go
create table almoxarifado
(
codigo int not null identity(0001,1) primary key,
nome varchar(30) not null,
endereco varchar(60) not null
)
go
create table estoque
(
codigo int not null identity(1,1) primary key,
codalmoxarifado int not null foreign key references almoxarifado(codigo),
codproduto varchar(3) not null,
saldo int not null
)
go
create table produto
(
id int identity(1,1),
codigo as 'P' + right ('00' + cast(id as varchar(2)), 2) persisted,
nome varchar(30) not null,
estoqueminimo int not null,
constraint PK_produto primary key (codigo)
)
go
alter table estoque add foreign key (codproduto) references produto(codigo)
go
insert into almoxarifado (nome, endereco) values ('São Jorge', 'Rua 15 Centro');
insert into almoxarifado (nome, endereco) values ('Vaca Brava', 'Rua T-10');
go
insert into produto (nome, estoqueminimo) values ('Sofá', 10);
insert into produto (nome, estoqueminimo) values ('Mesa de Mármore', 20);
go
insert into estoque (codalmoxarifado, codproduto, saldo) values (0001, 'P01', 15);
insert into estoque (codalmoxarifado, codproduto, saldo) values (0001, 'P02', 20);
-- a)
 go
select * from estoque
-- b)
go
select * from almoxarifado
-- c)
go
select * from produto
-- d)
go
select * from produto
where Codigo = 'P01'
-- e)
go
select * from estoque
where saldo >= 10
-- f)
go
select * from estoque
where codalmoxarifado = 0001