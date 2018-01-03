use Clinica
go
create procedure sp_AlocaConsulta
	@codm int,
	@codp int,
	@data date
as
declare @hora time
begin
	if exists (select * from Consultas where codm = @codm and data = @data)
	begin
		if exists (select * from Consultas where codm = @codm and data = @data and hora = '19:00:00')
		begin
			insert into Consultas (codm, codp, data, hora) values (@codm, @codp, DATEADD(day, 1, @data), '09:00:00')
		end
		else
		begin
			set @hora = dateadd(hour, 1,(select Consultas.hora from Consultas where codm = @codm and data = @data))
			insert into Consultas (codm, codp, data, hora) values (@codm, @codp, @data, @hora)
		end
	end		
	else
	begin
		insert into Consultas (codm, codp, data, hora) values (@codm, @codp, @data, '09:00:00')
	end

end

--set @hora = convert (time ,datepart(hour, dateadd(hour, 1,(select Consultas.hora from Consultas where codm = @codm and data = @data))))