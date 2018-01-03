create database aula7
go
use aula7
go
create table departamento(
id int not null primary key identity(1,1),
nome varchar(30),
andar int,
orcamento decimal(10,2)
)
go
create table empregado(
id int not null identity(1,1) primary key,
nome varchar(50),
rg int,
idade int,
estadoCivil char(10),
salario decimal(7,2),
tempoServico int,
departamento_id int foreign key references departamento(id)
)
go
insert into departamento values
('Contabilidade', 2, 1900.90),
('Financeiro', 2, 2900.79),
('Administração', 1, 1500.90)
go
insert into empregado values
('Paulo R.', 643451, 32, 'Solteiro', 900.00, 1, 2),
('Ricardo O.', 23523, 43, 'Casado', 1200.00, 2, 2),
('Marcelo A.', 93423, 24, 'Casado', 850.88, 1, 1),
('João T.', 64733, 26, 'Solteiro', 900.00, 1, 3),
('Rosana A.', 56543, 22, 'Casado', 900.90, 1, 1)