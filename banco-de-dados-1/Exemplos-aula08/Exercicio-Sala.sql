--primeiro conteudo
use TESTES_AULA
go
create table produto
(
id int not null identity(1,1) primary key,
nome varchar(20) not null,
valor money not null,
quantidade int not null,
medida varchar(15) not null
)
go
insert into produto (nome, valor, quantidade, medida) values ('Arroz', 1.90, 33, 'Kg');
insert into produto (nome, valor, quantidade, medida) values ('Feijão', 3.85, 82, 'Kg');
insert into produto (nome, valor, quantidade, medida) values ('Miojo', 1.20, 22, 'Unidade');
insert into produto (nome, valor, quantidade, medida) values ('Tomate', 3.05, 128, 'Kg');
insert into produto (nome, valor, quantidade, medida) values ('Cenoura', 2.50, 173, 'Kg');
insert into produto (nome, valor, quantidade, medida) values ('Batata', 2.38, 74, 'Kg');
insert into produto (nome, valor, quantidade, medida) values ('Pão', 10.25, 570, 'g');
insert into produto (nome, valor, quantidade, medida) values ('Queijo', 12.50, 120, 'Kg');
insert into produto (nome, valor, quantidade, medida) values ('Agua', 2.21, 88, 'L');
--segundo conteudo
go
update produto set quantidade = 100
where medida = 'Kg'
--terceiro conteudo
go
delete from produto where valor <= 2 or quantidade < 90
--quarto conteudo
go
update produto set valor = valor*2