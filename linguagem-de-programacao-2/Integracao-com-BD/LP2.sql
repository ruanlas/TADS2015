create database BDLP2
go
use BDLP2
go
create table alunos
(
matricula int not null identity(1,1) primary key,
nome varchar(70) not null,
idade int not null,
data_nasc date
)
go
create table telefones
(
idTelefone int not null identity(1,1) primary key,
telefone varchar(15) not null,
id_aluno int not null foreign key references alunos(matricula)
)
go
create table materias
(
idMateria int not null identity(1,1) primary key,
materia varchar(30) not null,
professor varchar(30) not null
)
go
create table inscricao
(
idInscricao int not null identity(1,1) primary key,
idAluno int not null foreign key references alunos(matricula),
idMateria int not null foreign key references materias(idMateria)
)