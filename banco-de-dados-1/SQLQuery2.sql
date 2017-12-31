use teste
go
CREATE TABLE MinhaTabela2
(--ID INT not null IDENTITY(1,1),
 CharID AS 'WC' + RIGHT('000' + CAST(1 AS VARCHAR(3)), 3) PERSISTED,
 nome varchar(30) not null,
 criado varchar(10) not null,
 CONSTRAINT PK_MinhaTabela2 PRIMARY KEY(CharID)
)
go
insert into MinhaTabela2 (nome, criado) values ('Ola', 'Sim');
insert into MinhaTabela2 (nome, criado) values ('Olas', 'Sims');
insert into MinhaTabela2 (nome, criado) values ('Olaasga', 'Simsd');
insert into MinhaTabela2 (nome, criado) values ('Oladsd', 'Simsdds');

select * from MinhaTabela2