use teste
go
create table testee1
(
id char(3) not null primary key,
nome varchar(10) not null
)
go
create table testee2
(
id char(3) not null primary key,
id_testee1 char(3) not null foreign key references testee1(id),
nome varchar(10) not null,
)
go
insert into testee1 (id, nome) values ('P01', 'Olá');
insert into testee2 (id, id_testee1, nome) values ('A01', 'P01', 'Oi');
