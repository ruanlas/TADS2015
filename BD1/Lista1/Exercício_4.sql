create database UNIAO
go
use UNIAO
go
create table TBPAIS
(
cod_pais int not null identity(1,1) primary key,
sgl_pais varchar(10) not null,
nom_pais varchar(30) not null
)
go
create table TBESTADO
(
cod_estado int not null identity(1,1) primary key,
cod_pais int not null foreign key references TBPAIS(cod_pais),
sgl_estado varchar(10) not null,
nome_estado varchar(30) not null
)
go
create table TBCIDADE
(
cod_cidade int not null identity(1,1) primary key,
cod_estado int not null foreign key references TBESTADO(cod_estado),
nome_cidade varchar(30) not null
)
