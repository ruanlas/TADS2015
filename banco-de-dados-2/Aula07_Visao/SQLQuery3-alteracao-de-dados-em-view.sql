--Alterando dados em View
use AdventureWorks2014
go
select * from [Sales].[vSalesPerson]

update [Sales].[vSalesPerson] set FirstName = '**Teste**' where BusinessEntityID = 274