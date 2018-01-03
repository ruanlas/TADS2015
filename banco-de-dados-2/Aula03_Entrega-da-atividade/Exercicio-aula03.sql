use BD2_Aula3
go
--Exercício 1)
select Alunos.RA from Alunos inner join Historico on Alunos.RA = Historico.RA 
inner join Disciplinas on Historico.COD_DISC = Disciplinas.COD_DISC
where Disciplinas.COD_DISC like 'BD' and Historico.ANO = 2010 and Historico.nota < 5
--Exercício 2)
select Alunos.nome, Alunos.RA from Alunos where Alunos.nome like '%s%'
--Exercício 3)
select Alunos.RA, Alunos.nome, Historico.nota from Alunos inner join Historico on Alunos.RA = Historico.RA 
inner join Disciplinas on Historico.COD_DISC = Disciplinas.COD_DISC
where Disciplinas.COD_DISC like 'BD' and Historico.ANO = 2010 and Historico.nota < 5
--Exercício 4)
select count(*)as TotalAlunos from Alunos
--Exercício 5)
select distinct count(*) as TotaldeAlunos from Alunos inner join Historico on Alunos.RA = Historico.RA 
inner join Disciplinas on Historico.COD_DISC = Disciplinas.COD_DISC
where Disciplinas.COD_DISC like 'BD' and Historico.ANO = 2010
--Exercício 6)
select distinct Disciplinas.nome_disc, MAX(Historico.nota) as NotaMaxima from Disciplinas inner join Historico
on Disciplinas.COD_DISC = Historico.COD_DISC group by Disciplinas.nome_disc
--Exercício 7)
select Disciplinas.nome_disc, AVG(Historico.nota) as Media from Disciplinas inner join Historico
on Disciplinas.COD_DISC = Historico.COD_DISC group by Disciplinas.nome_disc
having AVG(Historico.nota) > (select MIN(Historico.nota) from Historico)
--Exercício 8)
select Disciplinas.COD_DISC, AVG(Historico.nota) as Media from Disciplinas inner join Historico
on Disciplinas.COD_DISC = Historico.COD_DISC group by Disciplinas.COD_DISC
having AVG(Historico.nota) < (select AVG(Historico.nota) from Historico inner join Disciplinas
on Historico.COD_DISC = Disciplinas.COD_DISC where Disciplinas.COD_DISC like 'BD')
--Exercício 9)
select distinct Professores.nome from Professores inner join Historico on Professores.COD_PROF = Historico.COD_PROF
inner join Alunos on Alunos.RA = Historico.RA where Alunos.RA = 1
--Exercício 10)
select Disciplinas.nome_disc from Disciplinas inner join Historico
on Disciplinas.COD_DISC = Historico.COD_DISC group by Disciplinas.nome_disc
having sum(Historico.frequencia) < sum(Disciplinas.carga_hor)*0.75
/* SUM(Historico.frequencia) soma a carga horária de todos os alunos presentes na disciplina
   SUM(Disciplinas.carga_hor)*0.75 calcula a carga horária total de presença que os alunos 
								   deveria ter considerando uma frequencia media de 75% na
								   disciplina
*/
--Exercício 11)
select distinct Alunos.nome from Alunos inner join Historico on Alunos.RA = Historico.RA
where Historico.nota < 6 and Historico.ANO = 2010 group by Alunos.nome having COUNT(Alunos.nome) >=2
--Exercício 12)
select count(*) as TotalAlunos from Historico inner join Disciplinas on Disciplinas.COD_DISC = Historico.COD_DISC
where  Historico.ANO in (2009, 2010) and Disciplinas.nome_disc = 'Banco de Dados'
--Exercício 13)
select distinct Alunos.nome, Alunos.RA from Alunos inner join Historico on Alunos.RA = Historico.RA
inner join Professores on Professores.COD_PROF = Historico.COD_PROF where Historico.ANO in (2009, 2010)
and Professores.nome like 'José%' and Historico.RA in 
(select Historico.RA from Historico inner join Professores on Historico.COD_PROF = Professores.COD_PROF
where Professores.nome like 'Raul%')