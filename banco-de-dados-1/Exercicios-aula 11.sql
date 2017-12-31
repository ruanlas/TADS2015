select * from customer
select * from orders
--exercicio 1
select customer.[state ], sum(orders.price) as TotalVendas from customer inner join orders on
customer.customerid = orders.customerid group by customer.[state ]
--Exerc�cio 2
select top 10 customer.firstname, sum(orders.price) as TotalVendas from customer inner join orders on
customer.customerid = orders.customerid group by customer.firstname order by sum(orders.price) desc
--Exerc�cio 3
select customer.[state ], customer.city, sum(orders.price) as TotalVendas from customer inner join orders on
customer.customerid = orders.customerid group by customer.city, customer.[state ]
--Exerc�cio 4
select YEAR(orders.order_date) as Ano, sum(orders.price) as TotalVendas from customer inner join orders on
customer.customerid = orders.customerid group by YEAR(orders.order_date)