/*************** EXERCÍCIO 4 **************
=========================================== */
CREATE VIEW AlocacaoMedicos
AS 
select medicos.nome AS 'Nome do médico', medicos.Especialidade, consultas.Data,
	count(consultas.data) AS 'Consultas no dia',	
	'09h-10h' = MAX(case when hora between CAST('09:00:00' AS time) and CAST('09:59:59' AS time) then Pacientes.nome end),
	'10h-11h' = MAX(case when hora between CAST('10:00:00' AS time) and CAST('10:59:59' AS time) then Pacientes.nome end),
	'11h-12h' = MAX(case when hora between CAST('11:00:00' AS time) and CAST('11:59:59' AS time) then Pacientes.nome end),
	'12h-13h' = MAX(case when hora between CAST('12:00:00' AS time) and CAST('12:59:59' AS time) then Pacientes.nome end),
	'13h-14h' = MAX(case when hora between CAST('13:00:00' AS time) and CAST('13:59:59' AS time) then Pacientes.nome end),
	'14h-15h' = MAX(case when hora between CAST('14:00:00' AS time) and CAST('14:59:59' AS time) then Pacientes.nome end),
	'15h-16h' = MAX(case when hora between CAST('15:00:00' AS time) and CAST('15:59:59' AS time) then Pacientes.nome end),
	'16h-17h' = MAX(case when hora between CAST('16:00:00' AS time) and CAST('16:59:59' AS time) then Pacientes.nome end),
	'17h-18h' = MAX(case when hora between CAST('17:00:00' AS time) and CAST('17:59:59' AS time) then Pacientes.nome end),
	'18h-19h' = MAX(case when hora between CAST('18:00:00' AS time) and CAST('18:59:59' AS time) then Pacientes.nome end),
	'19h-20h' = MAX(case when hora between CAST('19:00:00' AS time) and CAST('19:59:59' AS time) then Pacientes.nome end)
from pacientes inner join consultas
	on pacientes.codp = consultas.codp inner join medicos
	on consultas.codm = medicos.codm
group by medicos.nome, medicos.especialidade, consultas.data
go

select * from AlocacaoMedicos order by Data, 'Nome do médico'
go

/*************** EXERCÍCIO 5 **************
=========================================== */
CREATE PROCEDURE sp_AlocaConsulta 
    @codm int, 
    @codp int,
	@data date
AS
	--verifica qual o último horário com consulta agendada
	declare @prox_hora time
	set @prox_hora = (select max(hora) from consultas where data = @data and codm = @codm)
		
	--a) Se não houver consulta marcada para o dia: o sistema deverá agendar para a primeira hora do dia, ou seja, às 9h.
	if @prox_hora is null
	begin
		INSERT INTO Consultas (codm, codp, data, hora) values (@codm, @codp, @data, CAST('9:00' AS time))
		PRINT 'Consulta marcada para: ' + CAST(@data AS varchar) + ' ' + '9:00'
		return
	end

	--b) Se o médico já tiver consulta agendada no último horário do dia (após às 19h): o sistema deverá agendar para o dia seguinte, logo às 9h. 
	if @prox_hora >= CAST('19:00' AS time) 
	begin
		INSERT INTO Consultas (codm, codp, data, hora) values (@codm, @codp, dateadd(day, 1, @data), CAST('9:00' AS time))
		PRINT 'Consulta marcada para: ' + CAST(dateadd(day, 1, @data) AS varchar) + ' ' + '9:00'
		return
	end
	
	--c) Se nenhuma das condições acima for satisfeita, entende-se que a próxima consulta ocorrerá no dia solicitado depois da última consulta localizada.
		INSERT INTO Consultas (codm, codp, data, hora) values (@codm, @codp, @data, dateadd(hour, 1, @prox_hora))
	PRINT 'Consulta marcada para: ' + CAST(@data AS varchar) + ' ' + CAST(dateadd(hour, 1, @prox_hora) AS varchar)
go
	
exec sp_AlocaConsulta 4, 4, '2006-06-30'

/*************** EXERCÍCIO 6 **************
=========================================== */
USE [master]
GO
CREATE LOGIN [restrito] WITH PASSWORD=N'123', DEFAULT_DATABASE=[Clinica], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [Clinica]
GO
CREATE USER [restrito] FOR LOGIN [restrito]
GO
GRANT EXECUTE ON [dbo].[sp_AlocaConsulta] TO [restrito]
GO