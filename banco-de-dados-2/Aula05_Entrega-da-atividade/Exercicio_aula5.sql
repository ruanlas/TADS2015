use AdventureWorks2014
go
--Exercício 1)
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

--Exercício 2) pivot table
select YEAR(Sales.SalesOrderHeader.OrderDate) as Ano
		,[Janeiro] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=1 then Sales.SalesOrderHeader.SubTotal end)
		,[Fevereiro] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=2 then Sales.SalesOrderHeader.SubTotal end)
		,[Março] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=3 then Sales.SalesOrderHeader.SubTotal end)
		,[Abril] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=4 then Sales.SalesOrderHeader.SubTotal end)
		,[Maio] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=5 then Sales.SalesOrderHeader.SubTotal end)
		,[Junho] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=6 then Sales.SalesOrderHeader.SubTotal end)
		,[Julho] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=7 then Sales.SalesOrderHeader.SubTotal end)
		,[Agosto] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=8 then Sales.SalesOrderHeader.SubTotal end)
		,[Setembro] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=9 then Sales.SalesOrderHeader.SubTotal end)
		,[Outubro] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=10 then Sales.SalesOrderHeader.SubTotal end)
		,[Novembro] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=11 then Sales.SalesOrderHeader.SubTotal end)
		,[Dezembro] = sum(case when month(Sales.SalesOrderHeader.OrderDate)=12 then Sales.SalesOrderHeader.SubTotal end)
		from Sales.SalesOrderHeader
		group by YEAR(Sales.SalesOrderHeader.OrderDate)
		order by YEAR(Sales.SalesOrderHeader.OrderDate)