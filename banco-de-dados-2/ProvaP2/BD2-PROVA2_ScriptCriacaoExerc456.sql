/*************** BD2-PROVA2 **************
SCRIPT DE CRIAÇÃO DO BANCO DE DADOS PARA
OS EXERCÍCIOS 4, 5 E 6
=========================================== */

use master
go

create database Clinica
go

use Clinica;

SET DATEFORMAT YMD

create table Ambulatorios
(
nroa int PRIMARY KEY IDENTITY(1,1) not null,
andar int not null,
capacidade int not null,
);

create table Medicos
(
codm int PRIMARY KEY IDENTITY(1,1) not null,
nome varchar(50) not null,
idade int not null,
especialidade varchar(100) not null,
CPF varchar(100) not null,
cidade varchar(100) not null,
nroa int,
);

create table Pacientes
(
codp int PRIMARY KEY IDENTITY(1,1) not null,
idade int not null,
nome varchar(100) not null,
CPF varchar(100) not null,
cidade varchar(100) not null,
doenca varchar(100) not null,
);

create table Funcionarios
(
codf int PRIMARY KEY IDENTITY(1,1) not null,
idade int not null,
nome varchar(100) not null,
salario float not null,
CPF varchar(100) not null,
cidade varchar(100) not null,
);

create table Consultas
(
codm int not null,
codp int not null,
data date not null,
hora time not null,
);

insert into Ambulatorios values
(1,30),
(1,50),
(2,40),
(2,25),
(2,55);
GO

insert into Medicos(nome,idade,especialidade,cpf,cidade,nroa) values
('Joao',40,'ortopedia','10000100000','Florianopolis',1),
('Maria',42,'traumatologia','10000110000','Blumenau',2),
('Pedro',51,'pediatra','11000100000','São José',2),
('Carlos',28,'ortopedia','11000110000','Joinvile',null),
('Marcia',33,'neurologia','11000111000','Biguacu',3);

insert into Pacientes(nome,idade,cidade,cpf,doenca) values
('Ana',20,'Florianopolis','20000200000','gripe'),
('Paulo',24,'Palhoca','20000220000','fratura'),
('Lucia',30,'Biguacu','22000200000','tendinite'),
('Carlos',28,'Joinvile','11000110000','sarampo');

insert into Funcionarios(nome,idade,cidade,salario,cpf) values
('Rita',32,'Sao Jose',1200,'20000100000'),
('Maria',55,'Palhoca',1220,	'300001100001'),
('Caio',45,'Florianopolis',1100,'41000100000'),
('Carlos',44,'Florianopolis',1200,'51000110000'),
('Paula',33,'Florianopolis',2500,'61000111000');

insert into Consultas(codm,codp,data,hora) values
(1,1,'2006-06-12','14:00'),
(1,4,'2006-06-13','10:00'),
(2,1,'2006-06-13','09:00'),
(2,2,'2006-06-13','11:00'),
(2,3,'2006-06-14','14:00'),
(2,4,'2006-06-14','17:00'),
(3,1,'2006-06-19','18:00'),
(3,3,'2006-06-12','10:00'),
(3,4,'2006-06-19','13:00'),
(4,4,'2006-06-20','13:00'),
(4,4,'2006-06-22','19:30');
GO