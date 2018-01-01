use aula_9
go
create table produtos
(
id int not null primary key identity(1,1),
nome varchar(20) not null,
valor decimal(4,2) not null,
quantidade int not null,
medida varchar(15) not null
)
go
insert into produtos (nome, valor, quantidade, medida) values ('Arroz', 1.90, 33, 'Kg');
insert into produtos (nome, valor, quantidade, medida) values ('Feijão', 3.85, 82, 'Kg');
insert into produtos (nome, valor, quantidade, medida) values ('Miojo', 1.20, 22, 'Unidade');
insert into produtos (nome, valor, quantidade, medida) values ('Tomate', 3.05, 128, 'Kg');
insert into produtos (nome, valor, quantidade, medida) values ('Cenoura', 2.50, 173, 'Kg');
insert into produtos (nome, valor, quantidade, medida) values ('Batata', 2.38, 74, 'Kg');
insert into produtos (nome, valor, quantidade, medida) values ('Pão', 10.25, 570, 'g');
insert into produtos (nome, valor, quantidade, medida) values ('Queijo', 12.50, 120, 'Kg');
insert into produtos (nome, valor, quantidade, medida) values ('Água', 2.21, 88, 'L');
go
--Listagem dos 4 produtos da tabela
select top 4 * from produtos
go
-- listagem dos 4 produtos mais caros
select top 4 * from produtos order by valor desc --listagem dos valores decrescentes
go
-- listagem dos 4 produtos mais baratos
select top 4 * from produtos order by valor asc --listagem dos valores crescentes
go
-- listagem dos produtos que contenha a medida 'g'
select * from produtos where medida = 'g'
go
-- produtos com valor entre 2 e 5
select * from produtos where valor > 2 and valor < 5
go
-- media dos preços dos produtos
select sum(valor)/count(*) as media_de_precos from produtos
go
-- media de preço de produtos com medida igual a 'Kg'
select sum(valor)/count(*) as media_precos_KG from produtos where medida = 'Kg'
go
-- quantidade de registros na tablela
select count(*) as qtd_registros from produtos
go
-- nome e valor do produto mais barato e do produto mais caro
select top 1 nome, valor as valor_mais_barato from produtos order by valor asc
go
select top 1 nome, valor as valor_mais_caro from produtos order by valor desc
go
-- soma da coluna quantidade dos produtos com medida 'Kg'
select sum(quantidade) from produtos where medida = 'Kg'
go
-- a medida e a contagem do numero de produtos que existem para cada medida
select medida, count(*) as numero_produtos_existentes from produtos group by medida
go
-- a mesma consulta anterior, mas apenas as contagens maiores que 2
select medida, count(*) as numero_produtos_existentes from produtos group by medida having count(*) >2