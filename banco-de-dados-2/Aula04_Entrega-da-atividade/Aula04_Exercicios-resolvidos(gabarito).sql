--Exercício 1: retorne a lista de Stores
SELECT * FROM sales.Customer AS c WHERE StoreID IS NOT NULL

--Exercício 2: retorne a lista de Persons
SELECT * FROM Sales.Customer AS c WHERE PersonID IS NOT NULL  

--Exercício 3: gere scripts para retornar os resultados conforme especificado abaixo:
--Stores
SELECT  StoreID ,  
        Name ,
        CustomerID
FROM    Sales.Customer AS c  
        INNER JOIN Sales.Store AS s ON c.StoreID = s.BusinessEntityID
WHERE   StoreID IS NOT NULL

--Persons
SELECT  PersonID ,  
        Title ,
        FirstName ,
        LastName
FROM    Sales.Customer AS c  
        INNER JOIN Person.Person AS p ON p.BusinessEntityID = c.PersonID
WHERE   PersonID IS NOT NULL  


--Exercício 4: gere um script para retornar resultados semelhante ao exposto abaixo.
SELECT  bea.BusinessEntityID ,  
        bea.AddressID ,
        bea.AddressTypeID ,
        FirstName ,
        LastName ,
        a.AddressLine1 ,
        a.City ,
        at.Name AS Addr
		essType
FROM    Person.Person AS p  
        INNER JOIN Person.BusinessEntityAddress AS bea ON bea.BusinessEntityID = p.BusinessEntityID
        INNER JOIN Person.Address AS a ON a.AddressID = bea.AddressID
        INNER JOIN Person.AddressType AS at ON at.AddressTypeID = bea.AddressTypeID
WHERE   p.BusinessEntityID in (2996, 19724, 16872)  


--Exercício 5: gere um script para retornar resultados semelhante ao exposto abaixo.
SELECT  c.CustomerID ,  
        p.FirstName ,
        p.LastName ,
        c.StoreID,
        s.Name,
        soh.SalesOrderID ,
        soh.OrderDate ,
        soh.SubTotal,
        soh.PurchaseOrderNumber
FROM    Sales.SalesOrderHeader AS soh  
        INNER JOIN Sales.Customer AS c ON c.CustomerID = soh.CustomerID
        INNER JOIN Person.Person AS p ON p.BusinessEntityID = c.PersonID
        INNER JOIN Sales.Store AS s ON s.BusinessEntityID = c.StoreID
WHERE   OnlineOrderFlag = 0 