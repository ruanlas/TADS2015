create database DBclinica
go
use DBclinica
go
create table Ambulatorios(
nroa int not null identity(1,1) primary key,
andar int,
capacidade int)
go
create table Pacientes(
codp int not null identity(1,1) primary key,
nome varchar(50),
idade int,
cidade varchar(50),
CPF varchar(20) unique,
doenca varchar(20))
go
create table Funcionarios(
codf int not null identity(1,1) primary key,
nome varchar(50),
idade int,
cidade varchar(50),
salario decimal(7,2),
CPF varchar(20) unique)
go
create table Medicos(
codm int not null identity(1,1) primary key,
nome varchar(50),
idade int,
especialidade varchar(30),
CPF varchar(20) unique,
cidade varchar(50),
nroa int foreign key references Ambulatorios(nroa))
go
create table Consultas(
codc int not null identity(1,1) primary key,
codm int foreign key references Medicos(codm),
codp int foreign key references Pacientes(codp),
data date,
hora time)
go
insert into Ambulatorios values
(1, 30),
(1, 50),
(2, 40),
(2, 25),
(2, 55)
go
insert into Pacientes values
('Ana', 20, 'Florianopolis', '20000200000', 'gripe'),
('Paulo', 24, 'Palhoca', '20000220000', 'fratura'),
('Lucia', 30, 'Biguacu', '22000200000', 'tendinite'),
('Carlos', 28, 'Joinville', '11000110000', 'sarampo')
go
insert into Funcionarios values
('Rita', 32, 'Sao Jose', 1200.00, '20000100000'),
('Maria', 55, 'Palhoca', 1220.00, '30000110000'),
('Caio', 45, 'Florianopolis', 1100.00, '41000100000'),
('Carlos', 44, 'Florianopolis', 1200.00, '51000110000'),
('Paula', 33, 'Florianopolis', 2500.00, '61000111000')
go
insert into Medicos values
('Joao', 40, 'ortopedia', '10000100000', 'Florianopolis', 1),
('Maria', 42, 'traumatologia', '10000110000', 'Blumenau', 2),
('Pedro', 51, 'pediatria', '11000100000', 'S�o Jos�', 2),
('Carlos', 28, 'ortopedia', '11000110000', 'Joinville', null),
('Marcia', 33, 'neurologia', '11000111000', 'Biguacu', 3)
go
insert into Consultas values
(1, 1, '12/06/2006', '14:00'),
(1, 4, '13/06/2006', '10:00'),
(2, 1, '13/06/2006', '9:00'),
(2, 2, '13/06/2006', '11:00'),
(2, 3, '14/06/2006', '14:00'),
(2, 4, '14/06/2006', '17:00'),
(3, 1, '19/06/2006', '18:00'),
(3, 3, '12/06/2006', '10:00'),
(3, 4, '19/06/2006', '13:00'),
(4, 4, '20/06/2006', '13:00'),
(4, 4, '22/06/2006', '19:30')
go
--exerc�cio 1)
--A)
create view vw_medicosOrtopedistas as
	select codm, nome, CPF, idade from Medicos where especialidade like 'ortopedia'
go
create view vw_ambulatoriosSuperior30 as
	select * from Ambulatorios where capacidade > 30
	with check option--esta op��o limita a inser��o e atualiza��o de dados na View
go
create view vw_pacientes as
	select nome, idade, doenca from Pacientes
go
create view vw_totalConsultasPorCodm as
	select codm, count(codp) as totalConsultas from Consultas
		group by codm
go
create view vw_consultas as
	select Consultas.codm,
		Medicos.nome as nomeMedico,
		Pacientes.CPF as CPFpaciente,
		Pacientes.nome as nomePaciente,
		Consultas.data
	from Consultas inner join Medicos
		on Medicos.codm = Consultas.codm
		inner join Pacientes
		on Consultas.codp = Pacientes.codp
go
--B)
select * from vw_ambulatoriosSuperior30 --Opera��o permitida
select * from vw_consultas --Opera��o permitida
select * from vw_medicosOrtopedistas --Opera��o permitida
select * from vw_pacientes --Opera��o permitida
select * from vw_totalConsultasPorCodm --Opera��o permitida
go
insert into vw_pacientes values('Juliano', 21, 'alergia')--Opera��o permitida
update vw_pacientes set doenca = 'resfriado' where nome like 'Juliano' --Opera��o permitida
go
insert into vw_ambulatoriosSuperior30 values(4, 1, 45) --Opera��o n�o permitida
update vw_ambulatoriosSuperior30 set capacidade = 45 where andar = 1 --Opera��o permitida
go
insert into vw_medicosOrtopedistas values ('Denis', '32000043000', 32) --Opera��o permitida
update vw_medicosOrtopedistas set nome = 'Renato' where CPF like '32000043000' --Opera��o permitida
go
insert into vw_consultas values (1, 'Joao', '20000220000', 'Paulo', '20/07/2006') --Opera��o n�o permitida
update vw_consultas set data = '23/06/2006' where codm = 4 --Opera��o permitida
go
insert into vw_totalConsultasPorCodm values(2, 5) --Opera��o n�o permitida
update vw_totalConsultasPorCodm set totalConsultas = 3 where codm = 1 --Opera��o n�o permitida
go
--Exerc�cio 2.1
--A)
USE [master]
GO
CREATE LOGIN [usuario] WITH PASSWORD=N'usuario', DEFAULT_DATABASE=[master], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
ALTER LOGIN [usuario] WITH DEFAULT_DATABASE=[DBclinica], DEFAULT_LANGUAGE=[Portugu�s (Brasil)], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [DBclinica]
GO
CREATE USER [usuario] FOR LOGIN [usuario]
GO
--B)
--consulta dados de ambulat�rios
use [DBclinica]
GO
GRANT SELECT ON [dbo].[Ambulatorios] TO [usuario]
GO
--consulta e altera��o de nome, CPF e doen�a dos pacientes
use [DBclinica]
GO
GRANT UPDATE ON [dbo].[Pacientes] (nome, CPF, doenca) TO [usuario]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[Pacientes] TO [usuario]
GO
--altera��o e inclus�o de dados de m�dicos
use [DBclinica]
GO
GRANT UPDATE ON [dbo].[Medicos] TO [usuario]
GO
use [DBclinica]
GO
GRANT INSERT ON [dbo].[Medicos] TO [usuario]
GO
--C)
--(conectado como usu�rio)
--D)
use DBclinica
go
select * from Ambulatorios
insert into Ambulatorios values(1, 60) --n�o autorizado
update Ambulatorios set capacidade = 20 where nroa = 1 --n�o autorizado
select * from Pacientes
select * from Medicos --n�o autorizado
update Pacientes set nome = 'Ana Maria' where codp = 1
update Pacientes set idade = 19 where codp = 1 --n�o autorizado
--Exercicio 2.2)
go
--A)
--(Condi��o de ADM)
alter table Medicos add [login] as 'u' + cast(codm as varchar)
go
--B)
USE [master]
GO
CREATE LOGIN [u1] WITH PASSWORD=N'' MUST_CHANGE, DEFAULT_DATABASE=[DBclinica], CHECK_EXPIRATION=ON, CHECK_POLICY=ON
GO
USE [DBclinica]
GO
CREATE USER [u1] FOR LOGIN [u1]
GO
USE [master]
GO
CREATE LOGIN [u2] WITH PASSWORD=N'' MUST_CHANGE, DEFAULT_DATABASE=[DBclinica], CHECK_EXPIRATION=ON, CHECK_POLICY=ON
GO
USE [DBclinica]
GO
CREATE USER [u2] FOR LOGIN [u2]
GO
--C)
create view meusPac as
	select codp, nome, idade, doenca
		from Pacientes
			where codp in (select codp
				from Consultas
					where codm in (select codm
					from Medicos
						where [login] = CURRENT_USER))
go
create view minhasConsultas as
	select Consultas.codc,
		Pacientes.nome,
		Consultas.data,
		Consultas.hora
		from Consultas inner join Pacientes
		on Consultas.codp = Pacientes.codp
		inner join Medicos
		on Medicos.codm = Consultas.codm
		where Medicos.[login] = CURRENT_USER

go
create view meuAmbulatorio as	
	select Ambulatorios.nroa, Ambulatorios.andar, Ambulatorios.capacidade from Ambulatorios
		inner join Medicos
		on Ambulatorios.nroa = Medicos.nroa
		where Medicos.[login] = CURRENT_USER
go
use [DBclinica]
GO
GRANT SELECT ON [dbo].[meusPac] TO [u1]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[meusPac] TO [u2]
GO
use [DBclinica]
GO
GRANT UPDATE ON [dbo].[minhasConsultas] TO [u1]
GO
use [DBclinica]
GO
GRANT DELETE ON [dbo].[minhasConsultas] TO [u1]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[minhasConsultas] TO [u1]
GO
use [DBclinica]
GO
GRANT UPDATE ON [dbo].[minhasConsultas] TO [u2]
GO
use [DBclinica]
GO
GRANT DELETE ON [dbo].[minhasConsultas] TO [u2]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[minhasConsultas] TO [u2]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[meuAmbulatorio] TO [u1]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[meuAmbulatorio] TO [u2]
GO
--D)
--(conectado como u1 e u2)
--E)
--u1
use DBclinica
select * from minhasConsultas
update minhasConsultas set data = '14/06/2006' where codc = 1
delete minhasConsultas where codc = 2 --n�o permitido /OBS: A op��o de desmarcar(deletar) a consulta n�o funcionou
select * from meusPac
select * from meuAmbulatorio
--u2
use DBclinica
select * from minhasConsultas
update minhasConsultas set data = '14/07/2006' where codc = 5
delete minhasConsultas where codc = 6 --n�o permitido /OBS: A op��o de desmarcar(deletar) a consulta n�o funcionou
select * from meusPac
select * from meuAmbulatorio
--F)
--(conectado como sa)
--G)
use [DBclinica]
GO
REVOKE DELETE ON [dbo].[minhasConsultas] TO [u1] AS [dbo]
GO
--H)
delete minhasConsultas where codc = 2 --esta opera��o n�o p�de ser executada pois a modifica��o
--afeta varias tabelas base (segundo o sql), ou seja, ele n�o permite esta altera��o

--Exerc�cio 3)
--A)
USE [master]
GO
CREATE LOGIN [u3] WITH PASSWORD=N'u3' MUST_CHANGE, DEFAULT_DATABASE=[DBclinica], CHECK_EXPIRATION=ON, CHECK_POLICY=ON
GO
USE [DBclinica]
GO
CREATE USER [u3] FOR LOGIN [u3]
GO
USE [master]
GO
CREATE LOGIN [u4] WITH PASSWORD=N'u4' MUST_CHANGE, DEFAULT_DATABASE=[DBclinica], CHECK_EXPIRATION=ON, CHECK_POLICY=ON
GO
USE [DBclinica]
GO
CREATE USER [u4] FOR LOGIN [u4]
GO
--B)
--Op��o fun��es SQL portugues
USE [DBclinica]
GO
CREATE ROLE [grupo23]
GO
USE [DBclinica]
GO
ALTER ROLE [grupo23] ADD MEMBER [u2]
GO
USE [DBclinica]
GO
ALTER ROLE [grupo23] ADD MEMBER [u3]
GO
--C)
use [DBclinica]
GO
GRANT UPDATE ON [dbo].[Medicos] TO [grupo23]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[Medicos] TO [grupo23]
GO
use [DBclinica]
GO
GRANT UPDATE ON [dbo].[Ambulatorios] TO [grupo23]
GO
use [DBclinica]
GO
GRANT DELETE ON [dbo].[Ambulatorios] TO [grupo23]
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[Ambulatorios] TO [grupo23]
GO
--D)
--Conectado como u3
--E)
use DBclinica
go
select * from Medicos
select * from Ambulatorios
delete Ambulatorios where nroa = 5
delete Medicos where codm = 6 --nao permitido
update Medicos set especialidade = 'ortopedia' where codm = 6
update Ambulatorios set andar = 3 where nroa = 4
--F)
USE [master]
GO
CREATE LOGIN [u5] WITH PASSWORD=N'u5' MUST_CHANGE, DEFAULT_DATABASE=[DBclinica], CHECK_EXPIRATION=ON, CHECK_POLICY=ON
GO
USE [DBclinica]
GO
CREATE USER [u5] FOR LOGIN [u5]
GO
--G)
GO
use [DBclinica]
GO
GRANT SELECT ON [dbo].[Pacientes] TO [u5]
GO
USE [DBclinica]
GO
ALTER ROLE [db_securityadmin] ADD MEMBER [u5]
GO
--H)
--(conectado como u5)
select * from Pacientes
--I)
use [DBclinica]
GO
GRANT SELECT ON [dbo].[Pacientes] TO [grupo23]
GO
--J)
--(conectado com o u3)
select * from Pacientes
--K)
--(Conectado como sa)
--L)
use [DBclinica]
GO
REVOKE SELECT ON [dbo].[Pacientes] TO [u5] cascade AS [dbo]
GO
--M)
--usuario u5 (n�o permitido)
use DBclinica
go
select * from Pacientes
--usu�rio u3 (permitido)
use DBclinica
go
select * from Pacientes
--usu�rio u2 (permitido)
use DBclinica
go
select * from Pacientes