use SQLJUNCOES_ex
go
--Exercício a)
select assinante.nm_assinante, endereco.ds_endereco, endereco.bairro, endereco.complemento, endereco.cep, telefone.ddd, telefone.n_fone
from endereco inner join assinante on assinante.cd_assinante = endereco.cd_assinante inner join telefone on endereco.cd_endereco = telefone.cd_endereco

--Exercício b)
select distinct assinante.nm_assinante, ramo_atividade.ds_ramo from assinante inner join ramo_atividade
on assinante.cd_ramo = ramo_atividade.cd_ramo order by ramo_atividade.ds_ramo, assinante.nm_assinante

--Exercício c)******
select assinante.nm_assinante from assinante inner join tipo_assinante on assinante.cd_tipo = tipo_assinante.cd_tipo
inner join endereco on endereco.cd_assinante = assinante.cd_assinante inner join municipio on municipio.cd_municipio = endereco.cd_municipio
where municipio.ds_municipio = 'Campinas' and tipo_assinante.ds_tipo = 'Comum'

--Exercício d)
select assinante.nm_assinante from assinante inner join endereco on assinante.cd_assinante = endereco.cd_assinante inner join
telefone on endereco.cd_endereco = telefone.cd_endereco group by assinante.nm_assinante having count(telefone.cd_endereco) >1

--Exercício e)
select assinante.nm_assinante, telefone.n_fone, tipo_assinante.ds_tipo from assinante inner join endereco on assinante.cd_assinante = endereco.cd_assinante
inner join telefone on endereco.cd_endereco = telefone.cd_endereco inner join tipo_assinante on assinante.cd_tipo = tipo_assinante.cd_tipo
inner join municipio on municipio.cd_municipio = endereco.cd_municipio where municipio.ds_municipio in('Valinhos', 'Campinas')
