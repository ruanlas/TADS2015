use aula_9
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
----
select top 1 max(valor), nome from produtos group by nome, valor order by nome