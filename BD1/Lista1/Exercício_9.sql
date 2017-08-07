create database TABELASREF
go
use TABELASREF
go
create table cds
(
codigo int not null identity(1,1) primary key,
nome varchar(50) not null,
dataCompra date not null,
valorPago money not null,
localCompra varchar(50) not null,
album varchar(50) not null
)
go
create table Musicas
(
codigoCd int not null,
numero int not null identity(1,1) primary key,
nome varchar(50) not null,
artista varchar(50) not null,
tempo varchar(50) not null
)
go
alter table Musicas add foreign key (codigoCd) references cds(codigo);