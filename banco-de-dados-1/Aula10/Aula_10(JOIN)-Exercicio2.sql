use clinica_aula_11_11
go
--Exercicio 1
insert into medico (nome, rg, idade, salario, especialidade, data_contrato, ambulatorio_id) values
('Alberto', 120, 41, 6000, 'Cardiologia', '2012-01-10', (select distinct ambulatorio.id from ambulatorio where ambulatorio.numero = 201))

insert into medico
	select nome, 999, idade, salario, especialidade, data_contrato, ambulatorio_id from medico where nome = 'Alberto'

	select*from medico
--Exercicio 2
insert into medico values
('Flávio', 12130, 34, 6000, 'Ortopedia', '2012-02-10', (select distinct ambulatorio.id from ambulatorio where ambulatorio.numero = 301)),
('Augusto', 9130, 29, 7000, 'Dermatologia', '2013-01-10', (select distinct ambulatorio.id from ambulatorio where ambulatorio.numero = 301))

--Exercicio 3
select medico.nome as NomeMedico, medico.especialidade as EspecialidadeMedico, ambulatorio.numero as NumeroAmbulatorio, ambulatorio.andar as AndarAmbulatorio
from medico inner join ambulatorio
on medico.ambulatorio_id = ambulatorio.id
order by ambulatorio.numero, medico.nome DESC