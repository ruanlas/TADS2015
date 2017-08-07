/*
Exemplo de como montar uma chave
primária no estilo de "P01"
como se fosse o código de um
produto
*/
use teste
go
CREATE TABLE MinhaTabela2
(Id INT not null IDENTITY(1,1),
 Cod AS 'P' + RIGHT('00' + CAST(Id AS VARCHAR(2)), 2) PERSISTED,
 nome varchar(30) not null,
 criado varchar(10) not null,
 CONSTRAINT PK_MinhaTabela2 PRIMARY KEY(Cod)
)
go
insert into MinhaTabela2 (nome, criado) values ('Ola', 'Sim');
insert into MinhaTabela2 (nome, criado) values ('Olas', 'Sims');
insert into MinhaTabela2 (nome, criado) values ('Olaasga', 'Simsd');
insert into MinhaTabela2 (nome, criado) values ('Oladsd', 'Simsdds');

select * from MinhaTabela2