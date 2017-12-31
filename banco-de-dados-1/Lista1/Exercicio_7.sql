create database ESCOLA
go
use ESCOLA
go
create table alunos
(
nome varchar(75) not null,
email varchar(75) not null,
senha varchar(10) not null,
cpf varchar(11) not null,
idpessoa int not null identity(1,1) primary key
)
go
create table matriculas
(
idmatricula int not null identity(1,1) primary key,
ativa bit not null,
data_cadastro date not null,
idpessoa int not null,
idcurso int not null
)
go
create table cursos
(
idcurso int not null identity(1,1) primary key,
nome varchar(25) not null
)
go
create table professores
(
idprofessor int not null identity(1,1) primary key,
nome varchar(75) not null,
email varchar(75) not null,
senha varchar(10) not null
)
go
create table disciplinas
(
iddisciplina int not null identity(1,1) primary key,
nome varchar(75) not null,
idprofessor int not null
)
go
create table disciplinas_cursos
(
iddisciplina_cursos int not null identity(1,1) primary key,
idcurso int not null,
iddisciplina int not null
)
go
alter table disciplinas_cursos add foreign key(iddisciplina) references disciplinas(iddisciplina);
alter table disciplinas_cursos add foreign key (idcurso) references cursos(idcurso);
alter table matriculas add foreign key (idpessoa) references alunos(idpessoa);
alter table matriculas add foreign key (idcurso) references cursos(idcurso);
alter table disciplinas add foreign key (idprofessor) references professores(idprofessor);
