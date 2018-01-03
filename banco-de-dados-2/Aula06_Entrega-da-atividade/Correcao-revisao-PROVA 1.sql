--Exercício 2)
select customer.CustomerName,
	   orders.orderid 
from customer inner join orders
	on customer.CustomerID = orders.CustomerID
order by customer.CustomerName

--Exercício 3)
select customer.CustomerName,
	   orders.orderid 
from customer left outer join orders
	on customer.CustomerID = orders.CustomerID
order by customer.CustomerName

--Exercício 4)
select customer.CustomerName,
	   ISNULL(orders.orderid, 'SEM PEDIDO RELACIONADO') AS OrderID
from customer left outer join orders
	on customer.CustomerID = orders.CustomerID
order by customer.CustomerName

--Exercício 5)
select customer.CustomerName,
	   COUNT(*) AS 'Total_OrdersID'
from customer inner join orders
	on customer.CustomerID = orders.CustomerID
group by customer.CustomerName
order by 'Total_OrdersID' DESC

--Exercício 6)
select TOP 10 customer.CustomerName,
	   COUNT(*) AS 'Total_OrdersID'
from customer inner join orders
	on customer.CustomerID = orders.CustomerID
group by customer.CustomerName
order by 'Total_OrdersID' DESC

--Exercício 7)
select customer.CustomerName,
	   COUNT(Orders.OrderID) AS 'Total_OrdersID'
from customer left outer join orders
	on customer.CustomerID = orders.CustomerID
group by customer.CustomerName
order by 'Total_OrdersID'

--Exercício 8)
SELECT  'Quantidade de pedidos',
		'0_pedido' = COUNT(case when sub_query.Total_OrdersID = 0 then sub_query.Total_OrdersID end),
		'1_pedido' = COUNT(case when sub_query.Total_OrdersID = 1 then sub_query.Total_OrdersID end),
		'2_pedidos' = COUNT(case when sub_query.Total_OrdersID = 2 then sub_query.Total_OrdersID end),
		'3_pedidos' = COUNT(case when sub_query.Total_OrdersID = 3 then sub_query.Total_OrdersID end),
		'4_pedidos' = COUNT(case when sub_query.Total_OrdersID = 4 then sub_query.Total_OrdersID end),
		'5_pedidos' = COUNT(case when sub_query.Total_OrdersID = 5 then sub_query.Total_OrdersID end),
		'6_pedidos' = COUNT(case when sub_query.Total_OrdersID = 6 then sub_query.Total_OrdersID end),
		'7_pedidos' = COUNT(case when sub_query.Total_OrdersID = 7 then sub_query.Total_OrdersID end),
		'8_pedidos' = COUNT(case when sub_query.Total_OrdersID = 8 then sub_query.Total_OrdersID end),
		'9_pedidos' = COUNT(case when sub_query.Total_OrdersID = 9 then sub_query.Total_OrdersID end),
		'10_pedidos' = COUNT(case when sub_query.Total_OrdersID = 10 then sub_query.Total_OrdersID end)
FROM ( 
		select customer.CustomerName,
			   COUNT(Orders.OrderID) AS 'Total_OrdersID'
		from customer left outer join orders
			on customer.CustomerID = orders.CustomerID
		group by customer.CustomerName
	 ) AS sub_query
	

--Exercício 10)
select customer.CustomerName,
	   month_1 = COUNT(case when datepart(month, Orders.OrderDate) = 1 then OrderID end),
	   month_2 = COUNT(case when datepart(month, Orders.OrderDate) = 2 then OrderID end),
	   month_3 = COUNT(case when datepart(month, Orders.OrderDate) = 3 then OrderID end),
	   month_4 = COUNT(case when datepart(month, Orders.OrderDate) = 4 then OrderID end),
	   month_5 = COUNT(case when datepart(month, Orders.OrderDate) = 5 then OrderID end),
	   month_6 = COUNT(case when datepart(month, Orders.OrderDate) = 6 then OrderID end),
	   month_7 = COUNT(case when datepart(month, Orders.OrderDate) = 7 then OrderID end),
	   month_8 = COUNT(case when datepart(month, Orders.OrderDate) = 8 then OrderID end),
	   month_9 = COUNT(case when datepart(month, Orders.OrderDate) = 9 then OrderID end),
	   month_10 = COUNT(case when datepart(month, Orders.OrderDate) = 10 then OrderID end),
	   month_11 = COUNT(case when datepart(month, Orders.OrderDate) = 11 then OrderID end),
	   month_12 = COUNT(case when datepart(month, Orders.OrderDate) = 12 then OrderID end)
from customer left outer join orders
	on customer.CustomerID = orders.CustomerID
where datepart(year, Orders.OrderDate) = 1996
group by customer.CustomerName
having COUNT(Orders.OrderID) >= 5
order by customer.CustomerName

select customer.CustomerName,
	   month_1 = COUNT(case when datepart(month, Orders.OrderDate) = 1 then OrderID end),
	   month_2 = COUNT(case when datepart(month, Orders.OrderDate) = 2 then OrderID end),
	   month_3 = COUNT(case when datepart(month, Orders.OrderDate) = 3 then OrderID end),
	   month_4 = COUNT(case when datepart(month, Orders.OrderDate) = 4 then OrderID end),
	   month_5 = COUNT(case when datepart(month, Orders.OrderDate) = 5 then OrderID end),
	   month_6 = COUNT(case when datepart(month, Orders.OrderDate) = 6 then OrderID end),
	   month_7 = COUNT(case when datepart(month, Orders.OrderDate) = 7 then OrderID end),
	   month_8 = COUNT(case when datepart(month, Orders.OrderDate) = 8 then OrderID end),
	   month_9 = COUNT(case when datepart(month, Orders.OrderDate) = 9 then OrderID end),
	   month_10 = COUNT(case when datepart(month, Orders.OrderDate) = 10 then OrderID end),
	   month_11 = COUNT(case when datepart(month, Orders.OrderDate) = 11 then OrderID end),
	   month_12 = COUNT(case when datepart(month, Orders.OrderDate) = 12 then OrderID end)
from customer left outer join orders
	on customer.CustomerID = orders.CustomerID
where datepart(year, Orders.OrderDate) = 1997
group by customer.CustomerName
having COUNT(Orders.OrderID) >= 3
order by customer.CustomerName