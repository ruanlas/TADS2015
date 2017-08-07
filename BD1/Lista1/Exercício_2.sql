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
insert into funcionario values ('Antônio dos Santos', 32, 'Administração', 1200, '555-1117');
insert into funcionario values ('Fabiana Rossi', 40, 'Administração', 2000, '555-8929');
insert into funcionario values ('Horácio Almeida', 31, 'Recursos Humanos', 1350, '555-8907');
insert into funcionario values ('João Pereira', 35, 'Vendas', 1500, '555-7814');
insert into funcionario values ('Márcia Souza', 26, 'Vendas', 600, '555-9800');
insert into funcionario values ('Maria José Costa', 22, 'Vendas', 600, '555-6629');
insert into funcionario values ('Mário Oliveira', 54, 'Diretoria', 4500, '555-1237');
insert into funcionario values ('Roberto Albuquerque', 29, 'Administração',1200, '555-8273');
insert into funcionario values ('Silvia Pires', 23, 'Vendas', 600, '555-8664');
go
select * from funcionario