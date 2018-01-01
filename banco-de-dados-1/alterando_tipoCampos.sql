create database olokomeu
go
use olokomeu
go
create table oloko(
id int not null identity(1,1) primary key,
nome varchar(50),
idade float)
go
--alterando tipo de dados de uma coluna
alter table oloko alter column idade int