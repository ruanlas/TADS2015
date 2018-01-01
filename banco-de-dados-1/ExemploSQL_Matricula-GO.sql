-- excluir o banco MATRICULA
drop database MATRICULA;
go
-- criar o banco MATRICULA
create database MATRICULA;
go
-- executar comandos no banco de dados MATRICULA
use matricula;
go
-- criar a tabela DISCIPLINA
create table DISCIPLINA
(
	id_disciplina int not null,
	cod_disciplina varchar(10) not null,
	nome_disciplina varchar(50) not null,
	primary key (id_disciplina) 
);
go
-- criar a tabela ALUNO
create table ALUNO
(
	cod_aluno int not null identity(1,1),
	prontuario_aluno varchar(10) not null,
	nome_aluno varchar(75) not null,
	email_aluno varchar(50) not null,
	telefone_aluno varchar(10),
	endereco_aluno varchar(100),
	primary key (cod_aluno)
);
go
-- criar a tabela MATRICULA
create table MATRICULA
(
	id_matricula int not null identity(1,1) primary key,
	id_disciplina_mat integer not null,
	cod_aluno_mat int not null,
);
go
-- alterar a tabela MATRICULA (inserir FKs na tabela para criar relacionamento)
alter table MATRICULA add foreign key (id_disciplina_mat) 
references disciplina (id_disciplina);
go
alter table MATRICULA add foreign key (cod_aluno_mat) 
references aluno (cod_aluno);
go
-- inserir dados na tabela DISCIPLINA
insert into DISCIPLINA values (101,'AG1','Algoritmos');
insert into DISCIPLINA values (105,'LP2','Linguagem de Programação');
insert into DISCIPLINA values (201,'BD1','Banco de Dados 1');
insert into DISCIPLINA values (204,'AD1','Administração');
insert into DISCIPLINA values (305,'BD2','Banco de Dados 1');
go
-- inserir dados na tabela ALUNO
insert into ALUNO values ('1001-X','João Silva','joao@ifsp','3254-1111','Rua X');
insert into ALUNO values ('1002-A','Maria Souza','maria@ifsp','3254-2222','Rua Y');
insert into ALUNO values ('1005-3','Ana Cunha','ana@ifsp','3254-3333','Rua Z');
insert into ALUNO values ('1006-2','José Oliveira','jose@ifsp','3254-4444','Rua W');
insert into ALUNO values ('1009-7','Silvia Mendonça','silvia@ifsp','3254-5555','Rua K');
go
-- inserir dados na tabela MATRICULA
insert into MATRICULA values (101,1);
insert into MATRICULA values (201,3);
insert into MATRICULA values (201,5);
insert into MATRICULA values (204,1);
insert into MATRICULA values (204,3);
go
-- inserir dados para exclusão e alteração
insert into MATRICULA values (101,5);
insert into MATRICULA values (201,5);
insert into MATRICULA values (204,5);
insert into ALUNO values ('987-X','Rodrigo','rodrigo@ifsp','555-1111','Rua A');
insert into ALUNO values ('456-X','Amanda','amanda@ifsp','555-2222','Rua D');
insert into ALUNO values ('159-X','Flavio','flavio@ifsp','555-3333','Rua F');
go
-- verificar as três tabelas
select * from ALUNO;
select * from DISCIPLINA;
select * from MATRICULA;
