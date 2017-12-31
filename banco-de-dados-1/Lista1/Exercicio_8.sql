create database EMPRESA2
go
use EMPRESA2
go
create table EMPR
(
matr char(6) not null primary key,
nome varchar(12) not null,
sobrenome varchar(15) not null,
dept char(3),
fone char(14),
dinamin date,
cargo char(10),
niveled int,
sexo char(1),
datanas date,
salario money,
bonus money,
comis money
)
go
create table DEPT
(
dcodigo char(3) not null primary key,
dnome varchar(30) not null,
gerente char(6),
dsuper char(3)
)
go
create table PROJETO
(
pcodigo char(6) not null primary key,
pnome varchar(24) not null,
dcodigo char(3) not null,
resp char(6) not null,
equipe int,
dataini date,
datafim date,
psuper char(6)
)
go
alter table EMPR add foreign key (dept) references DEPT(dcodigo);
alter table PROJETO add foreign key (dcodigo) references DEPT(dcodigo);
alter table PROJETO add foreign key (resp) references EMPR(matr);