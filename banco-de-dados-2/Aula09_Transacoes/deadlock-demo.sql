/* SCRIPT DE DEMONSTRAÇÃO DE UM DEADLOCK
   =====================================
    
   Imagine um cenário onde há um banco
   de dados com o cadastro dos alunos de
   uma escola.
   Na escola duas secretárias foram in-
   cumbidas de alterar os números de
   documentos dos alunos que estavam
   incorretos no sistema.
   Cada secretária recebeu uma lista
   com os nomes dos alunos que precisa-
   vam alterar.
   Para não correr o risco de alterarem
   os mesmos registros, as secretárias
   combinaram de uma começar no início
   da lista e a outra do final.
   O problema é que as secretárias se
   distrairam com conversas no WhatsApp
   no momento do trabalho e, por engano,
   tentaram alterar os mesmos registros,
   simultaneamente. 
   Execute o script conforme as instruções
   e confira o que acontece.

*/

CREATE DATABASE CadastroAlunos
GO

USE CadastroAlunos
GO
 
CREATE TABLE Alunos (
	CodAluno int NOT NULL PRIMARY KEY,
	NomeAluno varchar(50) NOT NULL,
	NumDocto varchar(50) NOT NULL
)
GO

CREATE TABLE Notas (
	CodAluno int NOT NULL,
	Nota numeric(3,1) NOT NULL,
)
GO

INSERT INTO Alunos VALUES (1, 'João', '1234')
INSERT INTO Alunos VALUES (2, 'Maria', '5678')
GO

INSERT INTO Notas VALUES (1,8.5)
INSERT INTO Notas VALUES (2,9.5)
GO

---------------------TRANSAÇÃO 1---------------------

BEGIN TRANSACTION T1

--REQUISITA RECURSO 1 - R1 
UPDATE Alunos SET NumDocto = '6666-Alterado_T1' WHERE CodAluno = 1

--**RODAR T2 EM NOVA JANELA**

--REQUISITA RECURSO 2 - R2 
UPDATE Alunos SET NumDocto = '7777-Alterado_T1' WHERE CodAluno = 2


---------------------TRANSAÇÃO 2---------------------

BEGIN TRANSACTION T2

--REQUISITA RECURSO 2 - R2 
UPDATE Alunos SET NumDocto = '7777-Alterado_T2' WHERE CodAluno = 2

--**RODAR PRÓXIMO UPDATE NA T1**

--REQUISITA RECURSO 1 - R1 
UPDATE Alunos SET NumDocto = '6666-Alterado_T2' WHERE CodAluno = 1


---------------------VERIFIQUE OS RESULTADOS---------------------
--FAÇA O COMMIT DA TRANSAÇÃO QUE NÃO FOI "DEADLOKED"

--CONSULTE A TABELA PARA VER O RESULTADO
SELECT * FROM alunos


/*
Select * from sys.dm_tran_active_transactions 

SELECT CASE transaction_isolation_level 
	WHEN 0 THEN 'Unspecified' 
	WHEN 1 THEN 'ReadUncommitted' 
	WHEN 2 THEN 'ReadCommitted' 
	WHEN 3 THEN 'Repeatable' 
	WHEN 4 THEN 'Serializable' 
	WHEN 5 THEN 'Snapshot' END AS TRANSACTION_ISOLATION_LEVEL 
FROM sys.dm_exec_sessions 
where session_id = @@SPID
*/