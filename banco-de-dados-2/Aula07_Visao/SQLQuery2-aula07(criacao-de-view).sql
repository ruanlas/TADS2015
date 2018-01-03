--Exemplo da aula
select departamento.nome nome, sum(empregado.salario) despesa 
	from empregado inner join departamento
	on empregado.departamento_id = departamento.id
	group by departamento.nome

go

create view despesas_por_departamento as
	select departamento.nome nome, sum(empregado.salario) despesa 
		from empregado inner join departamento
		on empregado.departamento_id = departamento.id
		group by departamento.nome

go
select * from despesas_por_departamento
select despesa from despesas_por_departamento
select sum(despesa) from despesas_por_departamento

--Exercício da aula

select empregado.nome nome, empregado.rg rg, departamento.nome departamento
	from empregado inner join departamento
	on empregado.departamento_id = departamento.id

go
create view funcionario as
	select empregado.nome nome, empregado.rg rg, departamento.nome departamento
		from empregado inner join departamento
		on empregado.departamento_id = departamento.id

go
select nome from funcionario where departamento like 'Financeiro'
