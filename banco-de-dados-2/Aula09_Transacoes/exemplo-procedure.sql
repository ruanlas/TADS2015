CREATE TABLE conta ( 
	id INT PRIMARY KEY IDENTITY(1,1), 
	numero INT NOT NULL, 
	agencia INT NOT NULL, 
	saldo DECIMAL(20, 2) NOT NULL, 
	CONSTRAINT idx_numero_agencia UNIQUE (numero, agencia) 
	);
GO

CREATE PROCEDURE transferir @idd INT, @idc INT, @valor DECIMAL(18, 2)
AS
	BEGIN TRANSACTION;
	
	UPDATE conta SET saldo = saldo - @valor WHERE id = @idd;
	UPDATE conta SET saldo = saldo + @valor WHERE id = @idc;
	
	IF (SELECT id FROM conta WHERE id = @idd) IS NULL OR (SELECT id FROM conta WHERE id = @idc) IS NULL
	BEGIN
		ROLLBACK
	END
	ELSE
	BEGIN
		COMMIT TRANSACTION
	END
GO

SELECT * FROM conta

INSERT INTO CONTA (numero, agencia, saldo)
values (1, 1, 10)
INSERT INTO CONTA (numero, agencia, saldo)
values (2, 1, 0)
GO

EXECUTE transferir 1, 2, 10