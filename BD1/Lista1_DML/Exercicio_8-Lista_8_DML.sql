drop database EMPRESA2
go
create database EMPRESA2
go
use EMPRESA2
go
create table EMPR
(
matr int not null primary key,
nome varchar(12) not null,
sobrenome varchar(35) not null,
dept int,
fone varchar(14),
dinamin date,
cargo varchar(50),
niveled int,
sexo varchar(1),
datanas date,
salario money,
bonus money,
comis money
)
go
create table DEPT
(
dcodigo int not null primary key,
dnome varchar(55) not null,
gerente int,
dsuper char(3)
)
go
create table PROJETO
(
pcodigo int not null primary key,
pnome varchar(30) not null,
dcodigo int not null,
resp int not null,
equipe int,
dataini date,
datafim date,
psuper char(6)
)
go
alter table EMPR add foreign key (dept) references DEPT(dcodigo);
alter table PROJETO add foreign key (dcodigo) references DEPT(dcodigo);
alter table PROJETO add foreign key (resp) references EMPR(matr);
go
insert into EMPR (matr, nome, sobrenome, fone, dinamin, cargo, sexo, datanas, salario) values (01501, 'Fábio', 'Pedreira Nascimento', '555-2354', '12/5/2000', 'Gerente', 'M', '1/3/1989', 3800);
insert into EMPR (matr, nome, sobrenome, fone, dinamin, cargo, sexo, datanas, salario) values (01503, 'José', 'dos Sanros', '555-5477', '23/7/2013', 'Promotor', 'M', '14/8/1990', 2100);
insert into EMPR (matr, nome, sobrenome, fone, dinamin, cargo, sexo, datanas, salario) values (21503, 'Mariana', 'Oliveira', '555-2145', '27/10/2014', 'Vendedora', 'F', '13/9/1995', 1800);
insert into EMPR (matr, nome, sobrenome, fone, dinamin, cargo, sexo, datanas, salario) values (21509, 'Marcia', 'Yakumy', '555-1200', '26/7/2012', 'Desenvolvedora de Sistemas', 'F', '2/7/1996', 2500);
insert into EMPR (matr, nome, sobrenome, fone, dinamin, cargo, sexo, datanas, salario) values (01512, 'Osvaldo', 'Cândido', '555-4531', '28/12/2014', 'Analista de Processos', 'M', '13/4/1986', 2100);
go
insert into DEPT (dcodigo, dnome, gerente) values (101, 'Diretoria', 01501);
insert into DEPT (dcodigo, dnome, gerente) values (104, 'Promotoria', null);
insert into DEPT (dcodigo, dnome, gerente) values (105, 'Vendas', null);
insert into DEPT (dcodigo, dnome, gerente) values (108, 'Departamento de Tecnologia da Informação', null);
go
update EMPR set dept = 101
where matr = 01501
go
update EMPR set dept = 104
where cargo = 'Promotor' or cargo = 'Promotora'
go
update EMPR set dept = 105
where cargo = 'Vendedora' or cargo = 'Vendedor'
go
update EMPR set dept = 108
where cargo = 'Desenvolvedora de Sistemas' or cargo = 'Desenvolvedor de Sistemas' or cargo = 'Analista de Processos'
go
update EMPR set comis = 300
where dept = 105
go
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe, dataini) values (001, 'Divulgação de Produtos', 105, 21503, 6, '13/9/2015');
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe, dataini) values (002, 'Processos e Métodos', 108, 01512, 3, null);
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe, dataini) values (003, 'Banco de Dados Online', 108, 21509, 4, '14/12/2014');
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe, dataini) values (004, 'Expansão de Mercado', 101, 01501, 7, null);
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe, dataini) values (005, 'Cotação de Materiais', 101, 01501, 3, null);