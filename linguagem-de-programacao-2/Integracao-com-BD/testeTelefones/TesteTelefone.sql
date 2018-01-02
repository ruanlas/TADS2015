create database TELEFONES
go
use TELEFONES
go
create table telefone
( id int not null primary key identity(1,1),
fone int not null
)
select*from telefone
delete from telefone