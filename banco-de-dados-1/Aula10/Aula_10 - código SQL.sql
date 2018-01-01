create database clinica
go

use clinica

CREATE TABLE ambulatorio (
    id INT PRIMARY KEY IDENTITY(1,1),
    numero INT NOT NULL UNIQUE,
    andar INT NOT NULL,
    capacidade INT NOT NULL
)
 
CREATE TABLE medico (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(100) NOT NULL,
    rg INT NOT NULL UNIQUE,
    idade INT NOT NULL,
    salario DECIMAL(7, 2) NOT NULL,
    especialidade VARCHAR(50) NOT NULL,
    data_contrato DATE,
    ambulatorio_id INT,
    FOREIGN KEY(ambulatorio_id) REFERENCES ambulatorio(id)
)
 
INSERT INTO medico (nome, rg, idade, salario, especialidade) VALUES
    ('Natasha', 12200, 41, 12000, 'Cardiologia'),
    ('Otávio', 12300, 23, 1400, 'Oftalmologia'),
    ('Pedro', 12347, 22, 1150, 'Ortopedia');

INSERT INTO ambulatorio (numero, andar, capacidade) VALUES (101, 1, 15);

INSERT INTO medico (nome, rg, idade, salario, especialidade, data_contrato, ambulatorio_id) VALUES
    ('Paulo', 1200, 42, 10000, 'Cardiologia', '2012-01-31', @@identity),
    ('Anna', 3234, 24, 12000, 'Cardiologia', '2012-01-17', @@identity),
    ('Arthur', 32234, 22, 8000, 'Ortopedia', '2012-12-15', @@identity);

INSERT INTO ambulatorio (numero, andar, capacidade) VALUES (201, 2, 20);

INSERT INTO medico (nome, rg, idade, salario, especialidade, data_contrato, ambulatorio_id) VALUES
    ('Felipe', 12122, 25, 19800, 'Dermatologia', '2012-12-31', @@identity),
    ('Gustavo', 51421, 45, 1400, 'Oftalmologia', '2012-05-05', @@identity);

INSERT INTO ambulatorio (numero, andar, capacidade) VALUES (202, 2, 30);

INSERT INTO medico (nome, rg, idade, salario, especialidade, data_contrato, ambulatorio_id) VALUES
    ('Alan', 12034, 38, 19700, 'Neurologia', '2012-07-29', @@identity),
    ('Henrique', 32034, 39, 18000, 'Mastologia', '2012-09-10', @@identity),
    ('Daniela', 32340, 28, 8500, 'Ortopedia', '2012-09-11', @@identity);
 
INSERT INTO ambulatorio (numero, andar, capacidade) VALUES (302, 3, 10);
 
SELECT * FROM medico, ambulatorio;
 
SELECT * 
FROM medico, ambulatorio 
WHERE medico.ambulatorio_id = ambulatorio.id;
 
SELECT medico.nome, ambulatorio.numero 
FROM medico, ambulatorio 
WHERE medico.ambulatorio_id = ambulatorio.id;
 
SELECT medico.nome, ambulatorio.numero 
FROM medico INNER JOIN ambulatorio 
	ON medico.ambulatorio_id = ambulatorio.id;
 
SELECT medico.nome, ambulatorio.numero 
FROM medico LEFT JOIN ambulatorio 
	ON medico.ambulatorio_id = ambulatorio.id;
 
SELECT medico.nome, ambulatorio.numero 
FROM medico RIGHT JOIN ambulatorio 
	ON medico.ambulatorio_id = ambulatorio.id;
 
SELECT numero 
FROM ambulatorio 
WHERE id IN (SELECT DISTINCT ambulatorio_id FROM medico WHERE ambulatorio_id IS NOT NULL);
 
SELECT DISTINCT ambulatorio.numero 
FROM ambulatorio INNER JOIN medico 
	ON medico.ambulatorio_id = ambulatorio.id;
 
SELECT nome 
FROM medico 
WHERE idade > ANY (SELECT DISTINCT idade FROM medico);
 
SELECT nome 
FROM medico 
WHERE salario < ALL (SELECT DISTINCT salario FROM medico WHERE especialidade = 'Cardiologia');
 
UPDATE medico 
SET salario = 7500 
WHERE ambulatorio_id = (SELECT id FROM ambulatorio WHERE numero = 201);
 
DELETE FROM medico 
WHERE ambulatorio_id IN (SELECT id FROM ambulatorio WHERE andar > 1);
 
SELECT DISTINCT a.numero FROM ambulatorio AS a INNER JOIN medico AS m ON m.ambulatorio_id = a.id;
 
SELECT DISTINCT a.numero FROM (SELECT id, numero FROM ambulatorio) a INNER JOIN medico m ON m.ambulatorio_id = a.id;