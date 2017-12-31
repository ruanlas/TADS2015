create database LOCADORA
go
use LOCADORA
go
create table categoria
(
idcategoria int not null identity(1,1) primary key,
nome varchar(50) not null
)
go
create table filme
(
idfilme int not null identity(1,1) primary key,
idcategoria int not null,
titulo varchar(50) not null
)
go
create table estrela
(
idcategoria int not null,
idfilme int not null,
idator int not null,
idestrela int not null identity(1,1) primary key
)
go
create table ator
(
idator int not null identity(1,1) primary key,
nome varchar(50) not null
)
go
create table DVD
(
numero int not null identity(1,1) primary key,
idcategoria int not null,
idfilme int not null
)
go
create table cliente
(
idcliente int not null identity(1,1) primary key,
nome varchar(50) not null,
telefone varchar(15) not null,
endereco varchar(70) not null
)
go
create table locacao
(
idlocacao int not null identity(1,1) primary key,
cliente_idcliente int not null,
dvd_numero int not null,
data_retirada date not null,
data_devolucao date not null
)
go
alter table filme add foreign key (idcategoria) references categoria(idcategoria);
alter table estrela add foreign key (idcategoria) references categoria(idcategoria);
alter table estrela add foreign key (idfilme) references filme(idfilme);
alter table estrela add foreign key (idator) references ator(idator);
alter table dvd add foreign key (idcategoria) references categoria(idcategoria);
alter table dvd add foreign key (idfilme) references filme(idfilme);
alter table locacao add foreign key (cliente_idcliente) references cliente(idcliente);
alter table locacao add foreign key (dvd_numero) references dvd(numero);
