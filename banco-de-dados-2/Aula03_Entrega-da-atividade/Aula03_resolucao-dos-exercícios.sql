--1. Encontre o RA dos alunos com nota em BD em 2010 menor que 5 (obs: BD = código da disciplinas).
SELECT ra
FROM HISTORICO
WHERE cod_disc='BD' AND ano=2010 AND nota <5

--2. Apresente o nome e RA dos alunos que tenha a letra 's' no nome
select nome, ra from alunos where nome like '%s%'

--3. Forneça o RA, nome e nota dos alunos com nota menor que 5 em BD em 2010.
SELECT a.RA, a.NOME, h.nota
from HISTORICO h, ALUNOS a
where cod_disc='BD' and ano=2010 and nota <5 and a.RA=h.RA

--4. Retorne o total de alunos cadastrados
select count(*) from alunos

--5. Retorne o número de alunos que fizeram BD em 2010.
SELECT count(*) from historico where cod_disc ='bd' and ano =2010

--6. retorne a nota máxima obtida até o momento de cada disciplina
Select nome_disc, max(nota)
from Disciplinas D, Historico H
Where D.cod_disc = h.cod_disc
group by nome_disc

--7. Retorne a disciplina com a média maior que o mínimo de todas as notas obtidas nas disciplinas
Select nome_disc, avg(nota)
from Disciplinas D, Historico H
Where D.cod_disc = h.cod_disc
group by nome_disc
having avg(nota) > all( Select min(nota)
                         from historico
						 group by cod_disc)

--8. Retorne o código das disciplinas com média menor que a média das notas em BD.
Select cod_disc, AVG(nota)
from historico
group by cod_disc
having avg(nota) < (select avg(nota)
                        from historico
                        where cod_disc = 'BD')

--9. Forneça o nome dos professores que já lecionaram alguma disciplina para o aluno de RA 1.
Select distinct P.nome
from Professores p inner join historico h
	on P.cod_prof = H.cod_prof
where H.RA = '1'

--10. Retorne o nome das disciplinas com média de freqüência (falta) abaixo de 75%.
Select nome_disc
From Disciplinas D,Historico H
Where H.cod_disc = D.cod_disc
group by nome_disc, carga_hor
having avg(frequencia) < 0.75 * carga_hor

--11. Forneça o nome dos alunos que tiveram no mínimo 2 reprovações (nota < 6) em 2010.
Select A.Nome
From Alunos A, Historico H
Where A.RA = H.RA and ano = 2010 and nota < 6.0
group by A.Nome
having count(*) >= 2


--12. Quantos alunos já cursaram a disciplina de Banco de Dados em 2009 e 2010.
select count(*)
from HISTORICO h inner join DISCIPLINAS d 
	on D.COD_DISC= h.COD_DISC
where d.NOME_DISC='Banco de Dados' and ano in (2009, 2010)

--13. esta aqui é bem bacana!
--Localize o nome e RA dos alunos do professor JOSÉ em 2010 ou 2009 que tiveram aulas com o professor RAUL em algum ano.
SELECT distinct a.NOME, a.RA
from ALUNOS a, PROFESSORES p, HISTORICO h 
where h.RA=a.RA and h.COD_PROF = p.COD_PROF
and p.NOME like '%josé%'
and (h.ANO = 2010 or h.ANO = 2009)
AND A.RA in
(select H.RA
from HISTORICO h, PROFESSORES p
where h.COD_PROF = p.COD_PROF
and p.nome like '%raul%')

