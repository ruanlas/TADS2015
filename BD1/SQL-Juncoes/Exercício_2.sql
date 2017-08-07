create database SQLJUNCOES_ex2
go
use SQLJUNCOES_ex2
go
create table cliente(
cpf int not null primary key,
nome varchar(30) not null,
dtNasc date not null)
go
create table modelo(
codMod int not null primary key identity(1,1),
Desc_2 varchar(30) not null)
go
create table patio(
num int not null identity(1,1) primary key,
ender varchar(30) not null,
capacidade int not null)
go
create table veiculo(
placa varchar(20) not null primary key,
Modelo_codMod int not null foreign key references modelo(codMod),
cliente_cpf int not null foreign key references cliente(cpf),
cor varchar(20) not null)
go
create table estaciona(
cod int not null primary key identity(1,1),
Patio_num int not null foreign key references patio(num),
Veiculo_placa varchar(20) not null foreign key references veiculo(placa),
dtEntrada date not null,
dtSaida date,
hsEntrada time not null,
hsSaida time)
go
insert into cliente values
(31251,'Pedro', '23/12/1990'),
(12345,'Antônio', '9/5/1998'),
(64331,'Ricardo', '21/7/1989'),
(64135,'Carlos', '3/5/1980')
go
insert into modelo values
('Corsa 2000'),
('Kaddet 1999'),
('Palio 2010'),
('S10 2014')
go
insert into patio values
('Rua Alcatéia, 344', 3),
('Rua Gimenes, 098', 7),
('Rua Paulinia, 780', 5),
('Av. Costa Filho, 321', 9)
go
insert into veiculo values
('kzn2144', 1, 31251,'Preto'),
('lmz4322', 2, 12345,'Azul'),
('ame0992', 3, 64331,'Branco'),
('qwa1222', 4, 64135,'Preto')
go
insert into estaciona values
(4,'kzn2144','2/5/2010', '7/5/2010', '13:55', '17:00'),
(4,'lmz4322','4/9/2010', '9/9/2010', '19:55', '17:00'),
(2,'ame0992','15/9/2010', '20/9/2010', '9:00', '17:56'),
(4,'kzn2144','21/12/2010', '30/12/2010', '10:20', '18:00')