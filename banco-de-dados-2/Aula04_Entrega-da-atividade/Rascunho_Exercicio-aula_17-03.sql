use AdventureWorks2014
go
select * from Person.Person
select * from Person.BusinessEntityAddress
select * from Person.BusinessEntity
select * from Sales.Store
select * from Sales.Customer

select Sales.Customer.StoreID, Sales.Store.Name, Sales.Customer.CustomerID 
from Sales.Customer inner join Sales.Store on Sales.Customer.StoreID = Sales.Store.BusinessEntityID
where Sales.Customer.StoreID in (292, 294, 296, 298)

select Sales.Customer.PersonID, Person.Person.Title, Person.Person.FirstName, Person.Person.LastName
from Sales.Customer inner join Person.Person on Sales.Customer.PersonID = Person.Person.BusinessEntityID

select Person.BusinessEntity.BusinessEntityID, Person.Address.AddressID, Person.AddressType.AddressTypeID,
Person.Person.FirstName, Person.Person.LastName, Person.Address.AddressLine1, Person.Address.City,
Person.AddressType.Name as AdressType
from Person.BusinessEntity inner join Person.BusinessEntityAddress on Person.BusinessEntity.BusinessEntityID =
Person.BusinessEntityAddress.BusinessEntityID inner join Person.Address on Person.BusinessEntityAddress.AddressID = 
Person.Address.AddressID inner join Person.AddressType on Person.BusinessEntityAddress.AddressTypeID =
Person.AddressType.AddressTypeID inner join Person.Person on Person.BusinessEntity.BusinessEntityID = 
Person.Person.BusinessEntityID order by BusinessEntityID

use AdventureWorks2014
select * from Sales.Store