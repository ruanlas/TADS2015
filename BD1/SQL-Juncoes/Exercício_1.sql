create database SQLJUNCOES_ex
go
use SQLJUNCOES_ex
go
create table ramo_atividade(
cd_ramo int not null identity(1,1) primary key,
ds_ramo varchar(30) not null)
go
create table tipo_assinante(
cd_tipo int not null identity(1,1) primary key,
ds_tipo varchar(30) not null)
go
create table municipio(
cd_municipio int not null primary key identity(1,1),
ds_municipio varchar(30) not null)
go
create table assinante(
cd_assinante int not null primary key identity(1,1),
nm_assinante varchar(30) not null,
cd_ramo int not null foreign key references ramo_atividade(cd_ramo),
cd_tipo int not null foreign key references tipo_assinante(cd_tipo))
go
create table endereco(
cd_endereco int not null identity(1,1) primary key,
ds_endereco varchar(30) not null,
complemento varchar(30) not null,
bairro varchar(30) not null,
cep varchar(15) not null,
cd_municipio int not null foreign key references municipio(cd_municipio),
cd_assinante int not null foreign key references assinante(cd_assinante))
go
create table telefone(
cd_fone int not null identity(1,1) primary key,
ddd int not null,
n_fone varchar(10) not null,
cd_endereco int not null foreign key references endereco(cd_endereco))
go
insert into ramo_atividade (ds_ramo) values
('Construcao'),
('Arquitetura'),
('Urbanismo'),
('Design')
go
insert into tipo_assinante (ds_tipo) values
('Comum'),
('Completo'),
('Combo'),
('Multi')
go
insert into assinante(nm_assinante, cd_ramo, cd_tipo) values
('José Carlos', 2,1),
('Maria Conceição', 3,2),
('José Henrique',4,2),
('Simão Silva',1,3),
('Alfredo Dias',2,3),
('Silas Miranda',3,3)
go
insert into municipio (ds_municipio) values
('Campinas'),
('Valinhos'),
('São Paulo'),
('Louveira')
go
insert into endereco (ds_endereco, complemento, bairro, cep, cd_municipio, cd_assinante) values
('Rua das Oliveiras', 'prox. av 2', 'Jd. Ortizes','1234556',@@IDENTITY ,@@IDENTITY ),
('Rua Camarim', 'sem comp.', 'Jd Campo Belo', '53421523', 2, 3),
('Rua Carolina', '281', 'Amarais', '4541235', 3,1),
('Rua Bissoto', 'sem comp.', 'Sto Antonio', '423413245', 2,3),
('Rua Oliveira', 'prox. mercado', 'Planalto', '342352', 1,4),
('Rua Batista', 'prx. Caixa', 'Viracopos', '454279', 3, 2)
go
insert into telefone (ddd, n_fone, cd_endereco) values
(19,'4532412', 1),
(23,'1234532', 2),
(11,'3452242', 3),
(11,'2453255', 3),
(10,'4352522', @@IDENTITY)