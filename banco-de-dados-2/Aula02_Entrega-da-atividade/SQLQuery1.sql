create database exercicio_1a
go
use exercicio_1a
go
create table PessoaFisica(
CIC int not null primary key,
nome varchar(35) not null)
go
create table PessoaJuridica(
CGC int not null primary key,
razaoSocial varchar(40))
go
create table venda(
cod int not null identity(1,1) primary key,
CIC int not null,
CGC int not null,
data date not null)
go
alter table venda add foreign key(CIC) references PessoaFisica(CIC)
alter table venda add foreign key(CGC) references PessoaJuridica(CGC)
go
--Exercício 2a
insert into PessoaFisica values
		(5325, 'Carlos Augusto'),
		(8977, 'Pedro Marcelo'),
		(9002, 'Marcio Ricardo'),
		(6323, 'Ricardo Mathias'),
		(3282, 'Angelo Simoes');
go
insert into PessoaJuridica values
		(9899, 'Donizete LTDA'),
		(8999, 'Alves Silva LTDA'),
		(7099, 'Camargo LTDA'),
		(7923, 'Antonios LTDA');
go
insert into venda values
		(5325, 8999, '21/09/2014'),
		(8977, 7099, '22/10/2015'),
		(6323, 7923, '18/07/2013'),
		(8977, 7923, '19/01/2014');
go
update PessoaJuridica set razaoSocial = 'Cia Antonio LTDA'
where CGC = 7923
delete from PessoaJuridica where CGC = 9899

-----------
create database exercicio_1b
go
use exercicio_1b
go
create table cliente(
cod int not null identity(1,1) primary key(cod),
nome varchar(30) not null,
numeroTelefone varchar(15))
go
create table telefone(
cod int not null identity(1,1) primary key,
codCliente int not null,
numero varchar(15)
foreign key(codCliente) references cliente(cod)
on update cascade
on delete cascade)
go
--Exercício 2b
insert into cliente values
	('Pedro','888-0090'),
	('João', '738-0898'),
	('Ricardo', '773-3251'),
	('Marcelo', '832-1333'),
	('Alberto', '893-3439');
go
insert into telefone values
	((select distinct cliente.cod from cliente where cliente.nome = 'Pedro'), '998-3893'),
	((select distinct cliente.cod from cliente where cliente.nome = 'Pedro'), '998-3843'),
	((select distinct cliente.cod from cliente where cliente.nome = 'João'), '998-3003'),
	((select distinct cliente.cod from cliente where cliente.nome = 'Pedro'), '998-0009'),
	((select distinct cliente.cod from cliente where cliente.nome = 'Ricardo'), '907-0893'),
	((select distinct cliente.cod from cliente where cliente.nome = 'João'), '911-1893');
go
update cliente set nome = 'Caio' where cod = (select distinct cliente.cod from cliente where cliente.nome = 'Pedro');
update cliente set numeroTelefone = null where nome = 'Alberto';
delete from cliente where nome = 'Caio';


-----------

create database exercicio_1c
go
use exercicio_1c
go
create table fabricante(
cod int not null identity(1,1) primary key,
nome varchar(30) not null)
go
create table categoria(
cod int not null identity(1,1) primary key,
tipo varchar(30) not null)
go
create table produto(
cod int not null identity(1,1) primary key,
codFabricante int not null,
codCategoria int not null,
nomeProduto varchar(30) not null,
foreign key (codFabricante) references fabricante(cod)
on update cascade
on delete cascade,
foreign key (codCategoria) references categoria(cod)
on update cascade
on delete cascade)
go
create table receita(
cod int not null identity(1,1) primary key,
item int not null,
medico varchar(30) not null,
codProduto int not null,
foreign key (codProduto) references produto(cod)
on update cascade
on delete cascade)
go
create table venda(
cod int not null identity(1,1) primary key,
codProduto int not null,
data date not null,
items int not null,
foreign key(codProduto) references produto(cod)
on update cascade
on delete cascade)
go
-- Exercício 2c
insert into fabricante values
	('Bio Medic'),
	('Medic Star'),
	('Bio Natural');
go
insert into categoria values
	('Medicamento'),
	('Perfumaria');
go
insert into produto values
	(3, 1,'Paracetamol'),
	(2, 1, 'Bezetacil'),
	(3, 2, 'Agua de cheiro'),
	(3, 2, 'Colônia'),
	(3, 2, 'Desodorante'),
	(3, 2, 'Borrifador'),
	(1, 1, 'Diclofenaco'),
	(1, 1, 'Antibiótico'),
	(2, 1, 'AntiInflamatório'),
	(3, 2, 'DeoColonia'),
	(3, 2, 'Cheiro de Rosas');
go
insert into receita values
	(1, 'Marcos', 1),
	(2, 'Marcos', 7),
	(1, 'João', 8),
	(1, 'Pedro', 9),
	(3, 'Marcos', 9),
	(1, 'Reginaldo', 1),
	(1, 'Antônio', 2),
	(2, 'Pedro', 2);
go
insert into venda values
	(1, '22/03/2001', 1),
	(6, '27/04/2005', 1),
	(7, '27/04/2005', 2),
	(5, '09/01/2009', 1),
	(7, '03/09/2012', 1),
	(2, '03/09/2012', 2),
	(4, '03/09/2012', 3),
	(2, '05/10/2014', 1),
	(3, '06/10/2014', 1),
	(5, '20/10/2014', 1);
go
update venda set data = '25/10/2003' where cod = 1;
go
update receita set medico = 'Armando' where medico = 'Pedro';
go
update fabricante set nome = 'Star LAB' where nome = 'Medic Star';
go
delete from receita where codProduto = (select distinct produto.cod from produto where produto.nomeProduto = 'AntiInflamatório')
delete from venda where codProduto = (select distinct top 1 produto.cod from produto inner join fabricante on fabricante.cod=produto.codFabricante where fabricante.nome = 'Bio Medic' order by produto.cod asc)

-------------------
create database exercicio_1d
go
use exercicio_1d
go
create table aluno(
cod int not null identity(1,1) primary key,
nome varchar(30) not null,
Rg int not null)
go
create table curso(
codCurso int not null identity(1,1) primary key,
nomeCurso varchar(30) not null)
go
create table inscricao(
codInscricao int not null identity(1,1) primary key,
codCurso int not null,
codAluno int not null unique,
foreign key (codCurso) references curso(codCurso)
on update cascade
on delete cascade,
foreign key (codAluno) references aluno(cod)
on update cascade
on delete cascade)
go
create table departamento(
cod int not null identity(1,1) primary key,
departamento varchar(30) not null)
go
create table disciplina(
codDisciplina int not null identity(1,1) primary key,
codDepartamento int not null,
materia varchar(30) not null,
foreign key(codDepartamento) references departamento(cod)
on update cascade
on delete cascade)
go
create table disciplina_curso(
cod int not null identity(1,1) primary key,
codDisciplina int not null,
codCurso int not null,
foreign key (codDisciplina) references disciplina(codDisciplina)
on update cascade
on delete cascade,
foreign key (codCurso) references curso(codCurso)
on update cascade
on delete cascade)
go
create table preRequisitos(
cod int not null identity(1,1) primary key,
codMateria int not null,
codDependencia int not null,
foreign key(codMateria) references disciplina(codDisciplina),
foreign key(codDependencia) references disciplina(codDisciplina))
go
--Exercício 2d
insert into aluno values
	('Ronaldo', 99889),
	('Alex', 98733),
	('Augusto', 67890),
	('Michael', 76393),
	('Rubens', 87112),
	('Renata', 53225),
	('Marcela', 73920),
	('Thais', 89321);
go
insert into curso values
	('Análise Sistemas'),
	('Eng. Elétrica'),
	('Ciencias Exatas');
go
insert into inscricao values
	(1, 3),
	(1, 2),
	(2, 1),
	(2, 6),
	(2, 4),
	(2, 5),
	(3, 7);
go
insert into departamento values
	('Informatica'),
	('Sala Vídeo'),
	('Exatas');
go
insert into disciplina values
	(3, 'Matemática'),
	(3, 'Física'),
	(1, 'Computação II'),
	(2, 'Computação Grafica'),
	(2,	'Animação 3D'),
	(1, 'Ling. Program.'),
	(1, 'Hardware');
go
insert into disciplina_curso (codCurso, codDisciplina)values
	(1, 3),
	(1, 6),
	(1, 7),
	(1, 1),
	(1, 4),
	(2, 7),
	(2, 1),
	(2, 6),
	(3, 1),
	(3, 2);
go
insert into preRequisitos values
	(2, 1),
	(5, 4),
	(7, 3);
go
update aluno set nome = 'João' where cod = (select distinct aluno.cod from aluno where aluno.Rg = 99889)
go
update departamento set departamento.departamento = 'Laboratório' where departamento.departamento = 'Sala Vídeo'
go
delete from inscricao where codCurso = (select distinct curso.codCurso from curso where curso.nomeCurso = 'Eng. Elétrica')
