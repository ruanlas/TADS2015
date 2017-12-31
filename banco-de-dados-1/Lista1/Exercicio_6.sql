create database EMPRESA
go
use EMPRESA
go
create table departamento
(
numDept int not null primary key,
nomeDept varchar(20) not null,
ramal int not null,
)
go
create table empregado
(
numEmp int not null primary key,
nomeEmp varchar(50) not null,
salario money not null,
dept int not null foreign key references departamento(numDept)
)
go
insert into departamento values (21, 'Pessoal', 142);
insert into departamento values (25, 'Financeiro', 143);
insert into departamento values (28, 'Técnico', 144);
go
insert into empregado values (032, 'J Silva', 380, 21);
insert into empregado values (074, 'M Reis', 400, 25);
insert into empregado values (089, 'C Melo', 520, 28);
insert into empregado values (092, 'R Silva', 480, 25);
insert into empregado values (112, 'R Pinto', 390, 21);
insert into empregado values (121, 'V Simão', 905, 28);
insert into empregado values (130, 'J Neves', 640, 28);
