SELECT medico.nome, ambulatorio.numero
FROM medico INNER JOIN ambulatorio
ON medico.ambulatorio_id = ambulatorio.id

select*from medico

SELECT medico.nome, ambulatorio.numero
FROM medico LEFT JOIN ambulatorio
ON medico.ambulatorio_id = ambulatorio.id

SELECT medico.nome, ambulatorio.numero
FROM medico RIGHT JOIN ambulatorio
ON medico.ambulatorio_id = ambulatorio.id
where medico.ambulatorio_id is null --pega, "filtra" o ambulatório que está null