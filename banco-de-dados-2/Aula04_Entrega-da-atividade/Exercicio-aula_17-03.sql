use AdventureWorks2014
go
--Exercício 1)
select * from Sales.Store
--Exercício 2)
select * from Person.Person
--Exercício 3)
select Sales.Customer.StoreID, Sales.Store.Name, Sales.Customer.CustomerID 
from Sales.Customer inner join Sales.Store on Sales.Customer.StoreID = Sales.Store.BusinessEntityID
order by Sales.Customer.StoreID asc, Sales.Customer.CustomerID asc

select Sales.Customer.PersonID, Person.Person.Title, Person.Person.FirstName, Person.Person.LastName
from Sales.Customer inner join Person.Person on Sales.Customer.PersonID = Person.Person.BusinessEntityID
--Exercício 4)
select Person.BusinessEntity.BusinessEntityID, Person.Address.AddressID, Person.AddressType.AddressTypeID,
Person.Person.FirstName, Person.Person.LastName, Person.Address.AddressLine1, Person.Address.City,
Person.AddressType.Name as AdressType
from Person.BusinessEntity inner join Person.BusinessEntityAddress on Person.BusinessEntity.BusinessEntityID =
Person.BusinessEntityAddress.BusinessEntityID inner join Person.Address on Person.BusinessEntityAddress.AddressID = 
Person.Address.AddressID inner join Person.AddressType on Person.BusinessEntityAddress.AddressTypeID =
Person.AddressType.AddressTypeID inner join Person.Person on Person.BusinessEntity.BusinessEntityID = 
Person.Person.BusinessEntityID order by Person.BusinessEntity.BusinessEntityID
--Exercício 5)
select Sales.Customer.CustomerID, Person.Person.FirstName, Person.Person.LastName, Sales.Customer.StoreID,
Sales.Store.Name, Sales.SalesOrderHeader.SalesOrderID, Sales.SalesOrderHeader.OrderDate, Sales.SalesOrderHeader.SubTotal,
Sales.SalesOrderHeader.PurchaseOrderNumber from Sales.Customer inner join Sales.SalesOrderHeader
on Sales.Customer.CustomerID = Sales.SalesOrderHeader.CustomerID inner join Sales.Store
on Sales.Customer.StoreID = Sales.Store.BusinessEntityID inner join Person.Person
on Sales.Customer.PersonID = Person.Person.BusinessEntityID order by Person.Person.LastName asc

