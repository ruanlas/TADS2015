create database TESTES_AULA
go
use TESTES_AULA
go
CREATE TABLE pessoa (
id INT PRIMARY KEY identity(1,1),
cpf CHAR(14) NOT NULL UNIQUE,
rg INT NOT NULL UNIQUE,
nome VARCHAR(100) NOT NULL,
data_nascimento DATE
)
go

insert into pessoa (cpf,rg,nome,data_nascimento) values ('111.222.333-44',65432122, 'Pedro Paulo', '19-4-1987');
insert into pessoa (cpf,rg,nome,data_nascimento) values ('123.456.789-01',12345611, 'Antônio Augusto', '12-3-1995');
insert into pessoa (cpf,rg,nome,data_nascimento) values ('123.123.123-00',11223344, 'Paula Maria', '18-12-1978');
insert into pessoa (cpf,rg,nome) values ('333.444.555-00',98765433, 'João Pedro');
--Atualizar nome e rg do redistro de id igual a 2
go
update pessoa 
set nome = 'Felipe Alves', rg = 12345678 --> o que irá atualizar (campos)
where id = 2 --> condição de atualização (ele irá alterar somente o registro que obtiver o id igual a 2)

--Atualizar o cpf do registro de nome igual a pedro paulo e data de nascimento igual a 1987-04-19 para 000.999.555-27
go
update pessoa set cpf = '000.999.555-27'
where nome = 'Pedro Paulo' and data_nascimento = '1987-04-19'
--atualizar a data_nascimento da tabela pessoa para null
go
update pessoa set data_nascimento = null
--deletar o conteudo de uma linha
go
delete from pessoa where cpf = '123.123.123-00'
