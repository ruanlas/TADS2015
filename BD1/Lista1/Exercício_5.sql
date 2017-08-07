create database OFICINA
go
use OFICINA
go
create table clientes
(
codCliente int not null identity(1,1) primary key,
nome varchar(50) not null,
endereco varchar(100) not null,
bairro varchar(20) not null,
cidade varchar(20) not null,
uf varchar(20) not null,
cep varchar(10) not null,
telefone varchar(15) not null,
celular varchar(15) not null,
obs text,
email varchar(35)
)
go
create table veiculos
(
codVeiculo int not null identity(1,1) primary key,
codCliente int not null foreign key references clientes(codCliente),
marca varchar(20) not null,
modelo varchar(20) not null,
ano int not null,
cor varchar(20) not null,
obs text
)
go
create table manutencao
(
codManutencao int not null identity(1,1) primary key,
codCliente int not null foreign key references clientes(codCliente),
codVeiculo int not null foreign key references veiculos(codVeiculo),
dataEntrada date not null,
dataPrevista date not null,
dataRetirada date not null,
obs text
)
go
create table maoobra
(
codMaoObra int not null identity(1,1) primary key,
codManutencao int not null foreign key references manutencao(codManutencao),
codVeiculo int not null foreign key references veiculos(codVeiculo),
orcamento money not null,
maoDeObra money not null,
valorOrcamento money not null,
totalOrcamento money not null
)
