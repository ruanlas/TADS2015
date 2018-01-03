use Clinica
go
create view AlocacaoMedicos as
select Medicos.nome as 'Nome do médico',
		Medicos.especialidade as 'Especialidade',
		Consultas.data as 'Data',
		'Consultas no dia' = count(case when Consultas.data = Consultas.data then Consultas.codm end)
		from Medicos inner join Consultas
		on Medicos.codm = Consultas.codm
		group by Medicos.nome, Medicos.especialidade, Consultas.data

