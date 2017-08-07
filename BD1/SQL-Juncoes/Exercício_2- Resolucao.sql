use SQLJUNCOES_ex2
go
--Exercicio a)
select veiculo.placa, cliente.nome from cliente inner join veiculo on cliente.cpf = veiculo.Cliente_cpf

--Exercicio b)
select cliente.cpf, cliente.nome from cliente inner join veiculo on cliente.cpf = veiculo.Cliente_cpf
where veiculo.placa = 'ame0992'

--Exercício c)
select veiculo.placa, veiculo.cor from veiculo inner join estaciona on estaciona.Veiculo_placa = veiculo.placa
where estaciona.cod = 1

--Exercício d)
select modelo.Desc_2, veiculo.placa from modelo inner join veiculo on modelo.codMod = veiculo.Modelo_codMod
inner join estaciona on veiculo.placa = estaciona.Veiculo_placa where estaciona.cod = 1

--Exercicio e)
select veiculo.placa, modelo.Desc_2 from veiculo inner join modelo on modelo.codMod = veiculo.Modelo_codMod
where modelo.Desc_2 > '%2000'

--Exercício f)
select patio.ender, estaciona.dtEntrada, estaciona.dtSaida from patio inner join estaciona
on patio.num = estaciona.Patio_num where estaciona.Veiculo_placa = 'kzn2144'

--Exercício g)**********
select veiculo.cor, count(estaciona.Veiculo_placa) as Qtd_estacionamento from veiculo inner join estaciona
on veiculo.placa = estaciona.Veiculo_placa group by veiculo.cor

--Exercicio h)
select cliente.nome from cliente inner join veiculo on cliente.cpf = veiculo.Cliente_cpf inner join modelo
on modelo.codMod = veiculo.Modelo_codMod where modelo.codMod = 1

--Exercicio i)
select veiculo.placa, estaciona.hsEntrada, estaciona.hsSaida from veiculo inner join estaciona 
on veiculo.placa = estaciona.Veiculo_placa where veiculo.cor = 'Preto'

--Exercicio J)
select patio.ender, estaciona.hsEntrada, estaciona.hsSaida, dtEntrada, dtSaida from patio
inner join estaciona on patio.num = estaciona.Patio_num inner join veiculo on
veiculo.placa = estaciona.Veiculo_placa where veiculo.placa = 'kzn2144'

--Exercicio k)
select cliente.nome from cliente inner join veiculo on cliente.cpf = veiculo.Cliente_cpf
inner join estaciona on veiculo.placa = estaciona.Veiculo_placa where estaciona.cod = 2

--Exercicio l)
select cliente.cpf from cliente inner join veiculo on cliente.cpf = veiculo.Cliente_cpf
inner join estaciona on veiculo.placa = estaciona.Veiculo_placa where estaciona.cod = 3

--Exercicio m)
select modelo.Desc_2 from modelo inner join veiculo on modelo.codMod = veiculo.Modelo_codMod
inner join estaciona on veiculo.placa = estaciona.Veiculo_placa where estaciona.cod = 2

--Exercicio n)
select veiculo.placa, cliente.nome, modelo.Desc_2 from veiculo inner join cliente
on veiculo.Cliente_cpf = cliente.cpf inner join modelo on modelo.codMod = veiculo.Modelo_codMod