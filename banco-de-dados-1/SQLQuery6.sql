/*use teste
go
CREATE TABLE MinhaTabela
(ID INT not null IDENTITY(1,1),
 CharID AS 'WC' + RIGHT('000' + CAST(ID AS VARCHAR(3)), 3) PERSISTED,
 nome varchar(30) not null,
 criado varchar(10) not null,
 CONSTRAINT PK_MinhaTabela PRIMARY KEY(CharID)
)*/
use teste
/*go
insert into MinhaTabela (nome, criado) values ('Ola', 'Sim');
insert into MinhaTabela (nome, criado) values ('Olas', 'Sims');
insert into MinhaTabela (nome, criado) values ('Olaasga', 'Simsd');
insert into MinhaTabela (nome, criado) values ('Oladsd', 'Simsdds');
*/
select * from MinhaTabela