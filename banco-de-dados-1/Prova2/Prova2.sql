create database bdescola
go
use bdescola
go
create table tb_aluno(
codigo_aluno int not null primary key identity(1,1),
nome_aluno varchar(60) not null,
data_nascimento int,
email varchar(60),
sexo char(1) not null)
go
create table tb_curso(
codigo_curso int not null primary key identity(1,1),
nome_curso varchar(60) not null)
go
create table tb_matricula(
id_matricula int not null primary key identity(1,1),
codigo_curso int not null foreign key references tb_curso(codigo_curso),
codigo_aluno int not null foreign key references tb_aluno(codigo_aluno))
go
insert into tb_aluno values
('Josiel Jardim', 1974, 'josiel@provaSQL.com.br', 'M'),
('Ana Maria', 1980, 'ana@provaSQL.com.br', 'F'),
('João Pedro', 1979, 'joao@provaSQL.com.br', 'M');
go
insert into tb_curso values
('Medicina'),
('Arquitetura'),
('Filosofia'),
('Informática'),
('Jornalismo');
go
insert into tb_matricula values
(1,1),
(1,2),
(2,3),
(5,3);
go
--Exercício 1a)
alter table tb_aluno add ra_aluno varchar(10);
alter table tb_aluno add fone_aluno varchar(50);

update tb_aluno set ra_aluno = '100092', fone_aluno = '556-9008' where codigo_aluno = 1;
update tb_aluno set ra_aluno = '100094', fone_aluno = '556-1298' where codigo_aluno = 2;
update tb_aluno set ra_aluno = '100097', fone_aluno = '556-9328' where codigo_aluno = 3;

go
--Exercício 1b)
insert into tb_aluno values('Pedro César', 1980, 'pedro@provaSQL.com.br', 'M', '100098', '556-9989');
insert into tb_matricula values((select distinct tb_curso.codigo_curso from tb_curso where tb_curso.nome_curso = 'Informática'), (select distinct tb_aluno.codigo_aluno from tb_aluno where tb_aluno.nome_aluno = 'Pedro César'))
go
--Exercício 1c)
select tb_aluno.nome_aluno, tb_curso.nome_curso from tb_aluno inner join tb_matricula on tb_aluno.codigo_aluno = tb_matricula.codigo_aluno
inner join tb_curso on tb_matricula.codigo_curso = tb_curso.codigo_curso order by tb_curso.nome_curso
--Exercício 1d)
select tb_aluno.email, tb_aluno.nome_aluno from tb_aluno inner join tb_matricula on tb_aluno.codigo_aluno = tb_matricula.codigo_aluno
inner join tb_curso on tb_matricula.codigo_curso = tb_curso.codigo_curso where tb_aluno.sexo = 'F' and tb_curso.nome_curso = 'Jornalismo'
--Exercício 1e)
select distinct tb_curso.nome_curso, count(tb_matricula.codigo_aluno) as alunos_matriculados from tb_curso inner join tb_matricula on tb_curso.codigo_curso = tb_matricula.codigo_curso
group by tb_curso.nome_curso
--Exercício 1f)
select tb_aluno.nome_aluno from tb_aluno where (2015 - tb_aluno.data_nascimento) <18
--Exercício 1g)
select tb_aluno.nome_aluno from tb_aluno inner join tb_matricula on tb_aluno.codigo_aluno = tb_matricula.codigo_aluno
inner join tb_curso on tb_matricula.codigo_curso = tb_curso.codigo_curso where tb_aluno.sexo = 'F' and tb_curso.nome_curso = 'Medicina'
--Exercício 1h)
select tb_curso.nome_curso from tb_curso order by tb_curso.nome_curso asc
--Exercício 1i)
update tb_aluno set data_nascimento = 1995 where nome_aluno = 'Ana Maria'
select * from tb_aluno
--Exercício 1j)
update tb_aluno set fone_aluno = null
/*
////////////////////////////////////////////////
////////////////////////////////////////////////
////////////////////////////////////////////////
*/
--Exercício 2
create database bdempresa
go
use bdempresa
go
create table departamento(
codigo int not null primary key identity(1,1),
nome varchar(20) not null)
go
create table cargo(
codigo int not null primary key identity(1,1),
nome varchar(30) not null,
salario money not null)
go
create table empregado(
codigo int not null primary key identity(1,1),
nome varchar(50) not null,
dataNascimento date not null,
codDep int not null foreign key references departamento(codigo),
codCargo int not null foreign key references cargo(codigo))
go
insert into departamento values
('Financeiro'),
('Engenharia'),
('Comercial')
go
insert into cargo values
('Advogado', 3000.00),
('Analista de Sistemas', 4000.00),
('Contador', 1000.00),
('Engenheiro', 4000.00),
('Programador', 1500.00),
('Medico', 4000.00),
('Auxiliar de Escritório', 400.00)
go
insert into empregado values
('Maria Araujo', '10/10/1970', 1,3),
('Carla Figueiredo', '2/5/1976', 2,1),
('Marcio Francisco', '30/6/1949', 1,2),
('Maria Bonita', '20/7/1980', 3,5),
('Francisco Carlos', '18/8/1972', 2,2),
('Rezende Rocha', '25/3/1960', 1,1),
('Marcia dos Anos', '27/12/1955', 3,3),
('José Ferreira', '2/3/1951', 2,1),
('Ferreira Fado', '14/11/1955', 1,2)
go
--Exercício 2k)
select empregado.codigo, empregado.nome, cargo.nome as cargo from empregado inner join cargo on empregado.codCargo = cargo.codigo
--Exercício 2l)
select empregado.codigo, empregado.nome, cargo.nome as cargo from empregado inner join cargo on empregado.codCargo = cargo.codigo
inner join departamento on empregado.codDep = departamento.codigo where departamento.codigo in (1,3)
--Exercício 2m)
select empregado.codigo, empregado.nome, empregado.dataNascimento from empregado where empregado.codigo in (1,3)
--Exercício 2n)
select empregado.codigo, empregado.nome, empregado.dataNascimento as [Data de Nascimento do Funcionário] from empregado
--Exercício 2o)
select empregado.codigo, empregado.nome, departamento.nome as Departamento, cargo.nome as Cargo, cargo.salario from empregado inner join departamento
on empregado.codDep = departamento.codigo inner join cargo on empregado.codCargo = cargo.codigo order by cargo.salario desc
--Exercício 2p)
select cargo.codigo, count(empregado.codCargo) as Quantidade from cargo inner join empregado on empregado.codCargo = cargo.codigo
group by cargo.codigo
--Exercício 2q)
select cargo.codigo, sum(cargo.salario) as Salario from cargo inner join empregado on empregado.codCargo = cargo.codigo
group by cargo.codigo
--Exercício 2r)
select departamento.codigo, departamento.nome, max(cargo.salario) as [Maior Salário] from departamento inner join
empregado on empregado.codDep = departamento.codigo inner join cargo on empregado.codCargo = cargo.codigo
group by departamento.codigo, departamento.nome