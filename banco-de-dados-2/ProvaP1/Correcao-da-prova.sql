/* SCRIPTS PRÉ-RESPOSTAS
=================================================== */
CREATE DATABASE Prova1BD2
GO

USE Prova1BD2
GO

ALTER TABLE dbo.customer ALTER COLUMN customerid INT NOT NULL;
GO
ALTER TABLE dbo.orders ALTER COLUMN quantity INT;
GO
ALTER TABLE dbo.orders ALTER COLUMN price MONEY;
GO
ALTER TABLE dbo.orders ALTER COLUMN order_date SMALLDATETIME;
GO


/* EXERCÍCIO 1
=================================================== */
USE Prova1BD2
GO

CREATE TABLE Disciplinas (
	codigo INT NOT NULL, 
	descricao VARCHAR(255)
	PRIMARY KEY (codigo)
)
GO

CREATE TABLE Professores (
	codigo INT NOT NULL,
	nome VARCHAR(255) NOT NULL
	PRIMARY KEY (codigo)
)
GO

CREATE TABLE Sala (
	codigo INT NOT NULL,
	localizacao VARCHAR(255)
	PRIMARY KEY (codigo)
)
GO

CREATE TABLE Turma (
	codigo INT NOT NULL,
	periodo VARCHAR(100),
	turno VARCHAR(100),
	codigo_sala INT NOT NULL
	PRIMARY KEY (codigo)
	FOREIGN KEY (codigo_sala) REFERENCES Sala (codigo),
)
GO

CREATE TABLE turma_professores (
	codigo INT NOT NULL,
	codigo_professor INT NOT NULL,
	codigo_turma INT NOT NULL,
	PRIMARY KEY (codigo),
	FOREIGN KEY (codigo_professor) REFERENCES Professores (codigo),
	FOREIGN KEY (codigo_turma) REFERENCES Turma (codigo)
)
GO

CREATE TABLE aulas_turma (
	codigo INT NOT NULL,
	codigo_aula INT NOT NULL,
	codigo_turma INT NOT NULL,
	PRIMARY KEY (codigo),
	FOREIGN KEY (codigo_aula) REFERENCES Disciplinas (codigo),
	FOREIGN KEY (codigo_turma) REFERENCES Turma (codigo)
)
GO

INSERT INTO Disciplinas (codigo, descricao) 
	VALUES  (1, 'Disciplina 1'),
			(2, 'Disciplina 2'),
			(3, 'Disciplina 3'),
			(4, 'Disciplina 4')

INSERT INTO Sala (codigo, localizacao) 
	VALUES	(1, 'Sala 1'),
			(2, 'Sala 2')

INSERT INTO Turma (codigo, periodo, turno, codigo_sala) 
	VALUES	(1, '1o semestre', 'Noturno', 1),
			(2, '2o semestre', 'Matutino', 2)

INSERT INTO Professores (codigo, nome) 
	VALUES	(1, 'Professor 1'),
			(2, 'Professor 2');


/* EXERCÍCIO 2 
=================================================== */
--a)
SELECT customer.firstname,
	   customer.lastname,
	   orders.order_date,
	   orders.item, 
	   orders.price
FROM customer INNER JOIN orders
	ON customer.customerid = orders.customerid
ORDER BY lastname, order_date

--b)
SELECT customer.[state],
	   COUNT(*) AS 'Total items', 
	   SUM(orders.price) AS 'Total price'
FROM customer INNER JOIN orders
	ON customer.customerid = orders.customerid
GROUP BY customer.[state]
ORDER BY customer.[state]


--c)
SELECT customer.firstname + ' ' + customer.lastname AS 'Full name',
	   COUNT(*) AS 'Total items',
	   SUM(orders.price) AS 'Total price'
FROM customer INNER JOIN orders
	ON customer.customerid = orders.customerid
GROUP BY customer.firstname, customer.lastname
ORDER BY 'Total price' DESC


--d)
SELECT customer.firstname + ' ' + customer.lastname AS 'Full name',
	   COUNT(orders.customerid) AS 'Total items',
	   SUM(ISNULL(orders.price, 0)) AS 'Total price'
FROM customer LEFT OUTER JOIN orders
	ON customer.customerid = orders.customerid
GROUP BY customer.firstname, customer.lastname
ORDER BY 'Total price' DESC

--e)
SELECT customer.firstname + ' ' + customer.lastname AS 'Full name',
	   month_1 = SUM(case when datepart(month, order_date) = 1 then price end),
	   month_2 = SUM(case when datepart(month, order_date) = 2 then price end),
	   month_3 = SUM(case when datepart(month, order_date) = 3 then price end),
	   month_4 = SUM(case when datepart(month, order_date) = 4 then price end),
	   month_5 = SUM(case when datepart(month, order_date) = 5 then price end),
	   month_6 = SUM(case when datepart(month, order_date) = 6 then price end),
	   month_7 = SUM(case when datepart(month, order_date) = 7 then price end),
	   month_8 = SUM(case when datepart(month, order_date) = 8 then price end),
	   month_9 = SUM(case when datepart(month, order_date) = 9 then price end),
	   month_10 = SUM(case when datepart(month, order_date) = 10 then price end),
	   month_11 = SUM(case when datepart(month, order_date) = 11 then price end),
	   month_12 = SUM(case when datepart(month, order_date) = 12 then price end)
FROM customer INNER JOIN orders
	ON customer.customerid = orders.customerid
WHERE datepart(year, order_date) = 1999
GROUP BY customer.firstname, customer.lastname
ORDER BY 'Full name'

SELECT customer.firstname + ' ' + customer.lastname AS 'Full name',
	   month_1 = SUM(case when datepart(month, order_date) = 1 then price end),
	   month_2 = SUM(case when datepart(month, order_date) = 2 then price end),
	   month_3 = SUM(case when datepart(month, order_date) = 3 then price end),
	   month_4 = SUM(case when datepart(month, order_date) = 4 then price end),
	   month_5 = SUM(case when datepart(month, order_date) = 5 then price end),
	   month_6 = SUM(case when datepart(month, order_date) = 6 then price end),
	   month_7 = SUM(case when datepart(month, order_date) = 7 then price end),
	   month_8 = SUM(case when datepart(month, order_date) = 8 then price end),
	   month_9 = SUM(case when datepart(month, order_date) = 9 then price end),
	   month_10 = SUM(case when datepart(month, order_date) = 10 then price end),
	   month_11 = SUM(case when datepart(month, order_date) = 11 then price end),
	   month_12 = SUM(case when datepart(month, order_date) = 12 then price end)
FROM customer INNER JOIN orders
	ON customer.customerid = orders.customerid
WHERE datepart(year, order_date) = 2000
GROUP BY customer.firstname, customer.lastname
ORDER BY 'Full name'

--f)
SELECT customer.firstname + ' ' + customer.lastname AS 'Full name',
	   Y1999S1 = SUM(case when datepart(month, order_date) BETWEEN 1 AND 6 AND datepart(year, order_date) = 1999 then price end),
	   Y1999S2 = SUM(case when datepart(month, order_date) BETWEEN 7 AND 12 AND datepart(year, order_date) = 1999 then price end),
	   Y2000S1 = SUM(case when datepart(month, order_date) BETWEEN 1 AND 6 AND datepart(year, order_date) = 2000 then price end),
	   Y2000S2 = SUM(case when datepart(month, order_date) BETWEEN 7 AND 12 AND datepart(year, order_date) = 2000 then price end)
FROM customer INNER JOIN orders
	ON customer.customerid = orders.customerid
GROUP BY customer.firstname, customer.lastname
ORDER BY 'Full name'