--cria o banco de dados com o nome "clientes"
create database clientes
go
--"seleciona" o banco de dados "cliente" criado
use clientes
go
--criação da tabela no banco de dados cliente com o nome "cliente"
create table cliente
(
--identity(x,Y) => "auto-incremento", onde x é a primeira posição do registro
-- e o y é o incremento
Codigo int not null identity(1,1) primary key,
Nome varchar(50) not null,
DataNascimento date not null
)
go

create table telefones
(
--indica que "CodigoTelefone" é chave primária
CodigoTelefone int not null identity(1,1) primary key,
--indica que "CodigoCliente" é chave estrangeira e referencia a tabela cliente
--com o campo Codigo
CodigoCliente int not null foreign key references cliente(Codigo),
Fone varchar(15) not null,
Tipo varchar(30) not null
)
go
--inserir dados da tabela "cliente"
insert into cliente values ('Marcio', '1/6/1975');
insert into cliente values ('Marlos', '5/8/1980');
insert into cliente values ('Luciane', '10/5/1970');
insert into cliente values ('Wilkie', '12/3/1974');
go
--inserir dados da tabela "telefones"
insert into telefones values (1, '22548954', 'Residencial');
insert into telefones values (1, '88512547', 'Celular');
insert into telefones values (3, '89665485', 'Celular');
insert into telefones values (4, '26539955', 'Residencial');
go
--verificar as tabelas
select * from cliente
select * from telefones