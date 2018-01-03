-- BANCO DE DADOS 2
-- CORREÇÃO DOS EXERCÍCIOS DE REVISÃO DA PROVA2

-- exercício 1
CREATE VIEW vwCustomersOrders
AS
select	firstname,
		lastname,
		order_date,
		item,
		price
from customer inner join orders
	on customer.customerid = orders.customerid
go

select * from vwCustomersOrders order by lastname

-- exercício 2
USE [master]
GO
CREATE LOGIN [restrito] WITH PASSWORD=N'123', DEFAULT_DATABASE=[Clinica], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [revprova2]
GO
CREATE USER [restrito] FOR LOGIN [restrito]
GO
GRANT SELECT ON [dbo].vwCustomersOrders TO [restrito]
GO

-- exercício 3
CREATE PROCEDURE spInsereOrders  
    @customerid int,
	@firstname varchar(50), 
    @lastname varchar(50),
	@city varchar(50),
	@st varchar(50),
	@order_date date,
	@item varchar(50),
	@quantity int,
	@price numeric(18,2)
AS

	declare @cust int
	set @cust = (select customerid from customer where customerid = @customerid)

	if @cust is null
	begin
		insert into customer
			values (@customerid, @firstname, @lastname, @city, @st)
	end

	insert into orders  
		values (@customerid, @order_date, @item, @quantity, @price)
go

execute spInsereOrders 999, 'cliente', 'teste', 'campinas', 'SP', '2016-06-09', 'sabonete', 1, 1.5
execute spInsereOrders 999, 'cliente', 'teste', 'campinas', 'SP', '2016-06-09', 'creme dental', 1, 4.5
go

-- exercício 4
/*
	SEG			TER			QUA			QUI			SEX			SAB			DOM
	---			---			---			---			---			---			---
				BI:15h					BI:15h
	BI:22h		BC:22h		BI:22h		BC:22h		BI:22h		BC:22h		
	
	BC - Backup Completo
	BI - Backup Incremental

	Informações importante:
	- Os horários na tabela acima representam o início do backup
	- As 3as e 5as teremos um backup completo ao final do dia pois nesses dias há grande alteração no BD
		-- Intermediariamente, há um BI no meio do dia
	- Em caso de recovery, jamais serão restaurante mais do que 2 backups para chegar ao BC
*/

-- exercício 5
CREATE FUNCTION fncTempoUltimoPedido (@datausuario date)
RETURNS TABLE
AS
RETURN 
(
    SELECT item, DATEDIFF(day, order_date, @datausuario) AS TotalDias
	from orders
);
GO

select * from fncTempoUltimoPedido(GETDATE())