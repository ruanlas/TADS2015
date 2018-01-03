-- ex 1
CREATE PROCEDURE calc_imc
	@peso float,
	@altura float 
AS
BEGIN 
	DECLARE @imc float
	DECLARE @status varchar(30)

	SET @imc = @peso / (@altura * @altura)

	IF @imc <= 19 
		SET @status = 'subpeso'
	ELSE IF @imc > 19 AND @imc <= 25 
		SET @status = 'peso normal'
	ELSE IF @imc > 25 AND @imc <= 29.9 
		SET @status = 'sobrepeso'
	ELSE
		SET @status = 'obesidade'

	print @status + ', '+  CONVERT(varchar(10),@imc)
END

exec calc_imc 150, 1.87;

-- ex 2
CREATE PROCEDURE soma_pares
	@n1 int,
	@n2 int
AS
BEGIN
	DECLARE @atual int
	DECLARE @soma int
	DECLARE @sobra int

	SET @atual = @n1
	SET @soma = 0
	SET @sobra = 0

	WHILE @atual <= @n2
		BEGIN
			SET @sobra = @atual % 2
			IF @sobra = 0
				BEGIN
					SET @soma = @soma + @atual
				END
			SET @atual = @atual + 1
		END
	PRINT CONVERT(VARCHAR(10),@soma)
END

exec soma_pares 0,100;

-- ex 3
CREATE TABLE datas(
ID INT PRIMARY KEY,
dia INT,
mes INT,
ano INT,
soma INT)

INSERT INTO datas (ID,dia,mes,ano) VALUES (1,15,1,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (2,15,2,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (3,15,3,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (4,15,4,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (5,15,5,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (6,15,6,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (7,15,7,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (8,15,8,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (9,15,9,1999)
INSERT INTO datas (ID,dia,mes,ano) VALUES (10,15,10,1999)

CREATE PROCEDURE soma_datas
	@valor INT
AS
BEGIN
	UPDATE datas SET datas.soma = datas.DIA + datas.MES + datas.ANO + @valor
	SELECT * FROM datas
END

exec soma_datas 10

-- ex 4
CREATE FUNCTION diaSemana (@dia INT,@mes INT,@ano INT) RETURNS
@table table (data varchar(50) null) AS
BEGIN
DECLARE @a INT,@b INT, @c INT, @d INT,@soma INT;
IF @dia<1 OR @dia>31
INSERT INTO @table VALUES('DIA INEXISTENTE')
ELSE IF @mes<1 OR @mes>12
INSERT INTO @table VALUES('MES INEXISTENTE')
ELSE IF @ano<1900 OR @ano>2399 
INSERT INTO @table VALUES('ANO FORA DO INTERVALO')
ELSE
SET @a=@ano-1900;
SET @b=@a/4;
IF (((@ano%4=0 AND @ano%100!=0) OR (@ano%400=0)) AND (@mes<2 AND @dia<=29))
SET @b=@b-1;
IF @mes=1
	SET @c=0;
ELSE IF @mes=2
	SET @c=3;
ELSE IF @mes=3
	SET @c=3;
ELSE IF @mes=4
	SET @c=6;
ELSE IF @mes=5
	SET @c=1;
ELSE IF @mes=6
	SET @c=4;
ELSE IF @mes=7
	SET @c=6;
ELSE IF @mes=8
	SET @c=2;
ELSE IF @mes=9
	SET @c=5;
ELSE IF @mes=10
	SET @c=0;
ELSE IF @mes=11
	SET @c=3;
ELSE
	SET @c=5;
SET @d=@dia-1;
SET @soma=(@a+@b+@c+@d)%7;
INSERT INTO @table VALUES('Você digitou a data '+ CONVERT(varchar(10),@dia) + '/' + CONVERT(varchar(10),@mes) + '/' + CONVERT(varchar(10),@ano));
IF @soma=0	
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) segunda-feira');
ELSE IF @soma=1	
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) terça-feira');
ELSE IF @soma=2	
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) quarta-feira');
ELSE IF @soma=3	
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) quinta-feira');
ELSE IF @soma=4	
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) sexta-feira');
ELSE IF @soma=5
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) sabado');
ELSE
INSERT INTO @table VALUES('Este dia foi um(a) bela(o) domingo');
RETURN
END
SELECT * FROM diaSemana(17,05,1996)
-- ex 5
CREATE TABLE Saldo(
ID INT PRIMARY KEY,
saldo FLOAT)

CREATE TABLE Movimentacao(
ID	INT PRIMARY KEY IDENTITY(1,1),
IDSaldo INT,
quantidade FLOAT,
tipoMovimentacao VARCHAR(10),
FOREIGN KEY(IDSaldo) REFERENCES Saldo(ID))

CREATE TRIGGER Movimentacao_dinheiro
ON Movimentacao
AFTER 
INSERT
AS
IF(SELECT TipoMovimentacao FROM INSERTED) = 'D'
UPDATE SALDO SET saldo = SALDO + QUANTIDADE FROM INSERTED WHERE SALDO.ID = IDSaldo
ELSE
UPDATE SALDO SET saldo = SALDO - QUANTIDADE FROM INSERTED WHERE SALDO.ID = IDSaldo

INSERT INTO Saldo VALUES(1, 3000)
INSERT INTO Saldo VALUES(2, 1000)

INSERT INTO Movimentacao VALUES(1, 2000, 'D')
INSERT INTO Movimentacao VALUES(2, 200, 'C')

SELECT * FROM Saldo