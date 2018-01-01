create database aula_9
go
use aula_9
go
CREATE TABLE ambulatorio (
id INT PRIMARY KEY identity(1,1),
numero INT NOT NULL UNIQUE,
andar INT NOT NULL,
capacidade INT NOT NULL
);
go
CREATE TABLE medico (
id INT PRIMARY KEY identity(1,1),
nome VARCHAR(100) NOT NULL,
rg INT NOT NULL UNIQUE,
idade INT NOT NULL,
salario DECIMAL(7, 2) NOT NULL,
especialidade VARCHAR(50) NOT NULL,
data_contrato DATE,
ambulatorio_id INT,
FOREIGN KEY(ambulatorio_id) REFERENCES ambulatorio(id)
);
go
insert into ambulatorio (numero, andar, capacidade) values (3, 1, 31);
insert into ambulatorio (numero, andar, capacidade) values (2, 2, 45);
go
insert into medico (nome, rg, idade, salario, especialidade) values ('Pedro Cardoso', 3436892, 43, 10000.90, 'Cirurgião');
insert into medico (nome, rg, idade, salario, especialidade) values ('Simão Oliveira', 8038032, 49, 20000.90, 'Pediatra');
-- Comandos Select
go
select * from medico where idade > 45
go
select * from ambulatorio
go
select numero, capacidade/5 from ambulatorio
go
-- Contagem de linhas/registros
select count(*) from medico where especialidade = 'Pediatra'
go
select count(ambulatorio_id) from medico
go
--soma os campos 
select sum(capacidade) from ambulatorio where andar = 2
go
--consulta limitando a quantidade de linhas 
select top x * from medico --onde x é o numero de linhas
-- as XXXXXX -> dá um apelido para a coluna de consulta