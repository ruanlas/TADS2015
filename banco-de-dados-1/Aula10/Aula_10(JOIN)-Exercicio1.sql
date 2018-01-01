use clinica_aula_11_11
go
--Exerc�cio 1
select medico.nome, medico.salario, ambulatorio.numero
from medico inner join ambulatorio
on medico.ambulatorio_id = ambulatorio.id
where ambulatorio.andar = 2
--Exerc�cio 2
select sum(medico.salario) as valorTotal
from medico inner join ambulatorio
on medico.ambulatorio_id = ambulatorio.id
where ambulatorio.andar = 1
--Exerc�cio 3
select medico.nome, ambulatorio.numero, medico.data_contrato
from medico inner join ambulatorio
on medico.ambulatorio_id = ambulatorio.id
--Exerc�cio 4
select count(medico.ambulatorio_id) as Medicos_trabalham, ambulatorio.numero
from medico inner join ambulatorio
on medico.ambulatorio_id = ambulatorio.id
group by ambulatorio.numero