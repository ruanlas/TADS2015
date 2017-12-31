create database RH
go
use RH
go
create table funcionario
(
Nome varchar(50) not null,
Idade int not null,
Departamento varchar(30) not null,
Salario money not null,
Telefone varchar(15) not null
)
go
insert into funcionario values ('Alberto da Silva', 25, 'Vendas', 850, '555-1902');
insert into funcionario values ('Ant�nio dos Santos', 32, 'Administra��o', 1200, '555-1117');
insert into funcionario values ('Fabiana Rossi', 40, 'Administra��o', 2000, '555-8929');
insert into funcionario values ('Hor�cio Almeida', 31, 'Recursos Humanos', 1350, '555-8907');
insert into funcionario values ('Jo�o Pereira', 35, 'Vendas', 1500, '555-7814');
insert into funcionario values ('M�rcia Souza', 26, 'Vendas', 600, '555-9800');
insert into funcionario values ('Maria Jos� Costa', 22, 'Vendas', 600, '555-6629');
insert into funcionario values ('M�rio Oliveira', 54, 'Diretoria', 4500, '555-1237');
insert into funcionario values ('Roberto Albuquerque', 29, 'Administra��o',1200, '555-8273');
insert into funcionario values ('Silvia Pires', 23, 'Vendas', 600, '555-8664');
go
select * from funcionario