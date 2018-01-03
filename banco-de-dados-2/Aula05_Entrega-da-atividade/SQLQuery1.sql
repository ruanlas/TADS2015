use AdventureWorks2014
go
select * from Sales.CurrencyRate
select * from Sales.SalesOrderHeader
select * from Sales.SalesPerson
select * from Sales.CreditCard
select * from Production.Product
select * from Sales.SpecialOffer
select * from Sales.SalesOrderDetail
SELECT  bea.BusinessEntityID ,  
        bea.AddressID ,
        bea.AddressTypeID ,
        FirstName ,
        LastName ,
        a.AddressLine1 ,
        a.City ,
        at.Name AS AddressType
FROM    Person.Person AS p  
        INNER JOIN Person.BusinessEntityAddress AS bea ON bea.BusinessEntityID = p.BusinessEntityID
        INNER JOIN Person.Address AS a ON a.AddressID = bea.AddressID
        INNER JOIN Person.AddressType AS at ON at.AddressTypeID = bea.AddressTypeID
WHERE   p.BusinessEntityID in (2996, 19724, 16872) 

select Sales.SalesOrderHeader.RevisionNumber, Sales.SalesOrderHeader.OrderDate, Sales.SalesOrderHeader.DueDate,
	   Sales.SalesOrderHeader.ShipDate, Sales.SalesOrderHeader.Status, Sales.SalesOrderHeader.OnlineOrderFlag,
	   Sales.SalesOrderHeader.SalesOrderNumber, Sales.SalesOrderHeader.PurchaseOrderNumber, Sales.SalesOrderHeader.AccountNumber,
	   Person.Person.FirstName as FirstNameCustomer, Person.Person.LastName as LastNameCustomer, Sales.SalesPerson.SalesQuota,
	   Sales.SalesPerson.Bonus, Sales.SalesPerson.CommissionPct, Sales.SalesPerson.SalesYTD, Sales.SalesPerson.SalesLastYear,
	   Sales.SalesTerritory.Name, Sales.SalesTerritory.CountryRegionCode, Sales.SalesOrderHeader.BillToAddressID, Person.Address.AddressLine1,
	   Person.Address.AddressLine2, Person.Address.City, Person.Address.StateProvinceID, Person.Address.PostalCode, Purchasing.ShipMethod.Name,
	   Purchasing.ShipMethod.ShipBase, Purchasing.ShipMethod.ShipRate, Sales.CreditCard.CardType, Sales.CreditCard.CardNumber,
	   Sales.SalesOrderHeader.CreditCardApprovalCode, Sales.CurrencyRate.FromCurrencyCode, Sales.CurrencyRate.ToCurrencyCode,
	   Sales.SalesOrderHeader.SubTotal, Sales.SalesOrderHeader.TaxAmt, Sales.SalesOrderHeader.Freight, Sales.SalesOrderHeader.TotalDue,
	   Sales.SalesOrderHeader.Comment, Sales.SalesOrderHeader.rowguid, Sales.SalesOrderHeader.ModifiedDate, Sales.SalesOrderDetail.CarrierTrackingNumber,
	   Sales.SalesOrderDetail.OrderQty, Production.Product.Name, Production.Product.Color, Production.Product.Size, Production.Product.SizeUnitMeasureCode,
	   Production.Product.Class, Production.Product.Style, Sales.SpecialOffer.Description, Sales.SpecialOffer.Type, Sales.SpecialOffer.Category,
	   Sales.SalesOrderDetail.UnitPrice, Sales.SalesOrderDetail.UnitPriceDiscount, Sales.SalesOrderDetail.LineTotal, Sales.SalesOrderDetail.rowguid,
	   Sales.SalesOrderDetail.ModifiedDate
from Sales.Customer inner join Person.Person
		on Sales.Customer.PersonID = Person.Person.BusinessEntityID
		inner join Sales.SalesOrderHeader
		on Sales.SalesOrderHeader.CustomerID = Sales.Customer.CustomerID
		inner join Purchasing.ShipMethod
		on Purchasing.ShipMethod.ShipMethodID = Sales.SalesOrderHeader.ShipMethodID
		inner join Sales.CreditCard
		on Sales.CreditCard.CreditCardID = Sales.SalesOrderHeader.CreditCardID
		inner join Sales.CurrencyRate
		on Sales.CurrencyRate.CurrencyRateID = Sales.SalesOrderHeader.CurrencyRateID
		inner join Sales.SalesTerritory
		on Sales.SalesTerritory.TerritoryID = Sales.SalesOrderHeader.TerritoryID
		inner join Sales.SalesPerson
		on Sales.SalesPerson.BusinessEntityID = Sales.SalesOrderHeader.SalesPersonID
		inner join Person.Address
		on Person.Address.AddressID = Sales.SalesOrderHeader.ShipToAddressID
		inner join Sales.SalesOrderDetail
		on Sales.SalesOrderDetail.SalesOrderID = Sales.SalesOrderHeader.SalesOrderID
		inner join Sales.SpecialOfferProduct
		on Sales.SpecialOfferProduct.SpecialOfferID = Sales.SalesOrderDetail.SpecialOfferID and
		Sales.SpecialOfferProduct.ProductID = Sales.SalesOrderDetail.ProductID
		inner join Production.Product
		on Sales.SpecialOfferProduct.ProductID = Production.Product.ProductID
		inner join Sales.SpecialOffer
		on Sales.SpecialOffer.SpecialOfferID = Sales.SpecialOfferProduct.SpecialOfferID

select month(Sales.SalesOrderHeader.OrderDate) from Sales.SalesOrderHeader

select YEAR(Sales.SalesOrderHeader.OrderDate)
		,[1] as Jan
		,[2] as Fev

from Sales.SalesOrderHeader pivot (sum(

select YEAR(Sales.SalesOrderHeader.OrderDate) as Ano
		,mes_1 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=1 then Sales.SalesOrderHeader.SubTotal end)
		,mes_2 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=2 then Sales.SalesOrderHeader.SubTotal end)
		,mes_3 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=3 then Sales.SalesOrderHeader.SubTotal end)
		,mes_4 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=4 then Sales.SalesOrderHeader.SubTotal end)
		,mes_5 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=5 then Sales.SalesOrderHeader.SubTotal end)
		,mes_6 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=6 then Sales.SalesOrderHeader.SubTotal end)
		,mes_7 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=7 then Sales.SalesOrderHeader.SubTotal end)
		,mes_8 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=8 then Sales.SalesOrderHeader.SubTotal end)
		,mes_9 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=9 then Sales.SalesOrderHeader.SubTotal end)
		,mes_10 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=10 then Sales.SalesOrderHeader.SubTotal end)
		,mes_11 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=11 then Sales.SalesOrderHeader.SubTotal end)
		,mes_12 = sum(case when month(Sales.SalesOrderHeader.OrderDate)=12 then Sales.SalesOrderHeader.SubTotal end)
		from Sales.SalesOrderHeader
		group by YEAR(Sales.SalesOrderHeader.OrderDate)
		order by YEAR(Sales.SalesOrderHeader.OrderDate)
		
select YEAR(Sales.SalesOrderHeader.OrderDate) as Ano
		,1 as Jan
		,2 as Fev
		,3 as Jan
		,4 as Fev
		,5 as Jan
		,6 as Fev
		,7 as Jan
		,8 as Fev
		,9 as Jan
		,10 as Fev
		,11 as Jan
		,12 as Fev
		from Sales.SalesOrderHeader pivot (sum(Sales.SalesOrderHeader.SubTotal) for month(Sales.SalesOrderHeader.OrderDate) in (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)) 
		order by 1