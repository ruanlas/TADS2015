--drop database Ex_DQL
--go
create database Ex_DQL
go
use Ex_DQL
go
create table EMPR
(
matr char(6) not null primary key,
nome varchar(12) not null,
sobrenome varchar(35) not null,
dept char(3),
fone varchar(14),
dinamin date,
cargo varchar(50),
niveled int,
sexo varchar(1),
datanas date,
salario money,
bonus money,
comis money
)
go
create table DEPT
(
dcodigo char(3) not null primary key,
dnome varchar(55) not null,
gerente char(6),
dsuper char(3)
)
go
create table PROJETO
(
pcodigo char(6) not null primary key,
pnome varchar(30) not null,
dcodigo char(3) not null,
resp char(6) not null,
equipe int,
dataini date,
datafim date,
psuper char(6)
)
go
alter table DEPT add foreign key (dsuper) references DEPT(dcodigo);
alter table EMPR add foreign key (dept) references DEPT(dcodigo);
alter table PROJETO add foreign key (dcodigo) references DEPT(dcodigo);
alter table PROJETO add foreign key (resp) references EMPR(matr);
go
insert into DEPT (dcodigo, dnome) values ('A01', 'Contabilidade');
insert into DEPT (dcodigo, dnome) values ('A21', 'Contas a Pagar');
insert into DEPT (dcodigo, dnome) values ('A12', 'Contas a Receber');
insert into DEPT (dcodigo, dnome) values ('B10', 'Recursos Humanos');
insert into DEPT (dcodigo, dnome) values ('B17', 'Reintegração de Sistemas');
insert into DEPT (dcodigo, dnome) values ('C02', 'Análise de Sistemas Embarcados');
insert into DEPT (dcodigo, dnome) values ('C12', 'Análise de Novos Negócios');
insert into DEPT (dcodigo, dnome) values ('C33', 'Análise de Recursos Renováveis');
insert into DEPT (dcodigo, dnome) values ('D00', 'Desenvolvimento de Tecnologias');
insert into DEPT (dcodigo, dnome) values ('D01', 'Desenvolvimento de Sistemas');
insert into DEPT (dcodigo, dnome) values ('D12', 'Divisão de Transmissões');
insert into DEPT (dcodigo, dnome) values ('D15', 'Gerenciamento de Processos');
insert into DEPT (dcodigo, dnome) values ('D17', 'Controle de Processos');
insert into DEPT (dcodigo, dnome) values ('D21', 'Divisão de Inovação');
insert into DEPT (dcodigo, dnome) values ('D27', 'Departamento Técnico');
insert into DEPT (dcodigo, dnome) values ('E01', 'Suporte Técnico');
insert into DEPT (dcodigo, dnome) values ('E08', 'Suporte de Sistemas');
insert into DEPT (dcodigo, dnome) values ('E00', 'Vendas');
go
insert into EMPR (matr, nome, sobrenome, sexo, datanas, dept, fone, dinamin, cargo, salario, bonus, comis) values ('000001', 'Paulo', 'Nascimento', 'M', '10/10/1980', 'E00', '889-0123', '29/11/2010', 'Gerente Vendas', 2400.00, 4000.00, 6000.00);
insert into EMPR (matr, nome, sobrenome, sexo, datanas, dept, fone, dinamin, cargo, salario, bonus, comis) values ('000002', 'Jéssica', 'Cristina', 'F', '16/8/1990', 'E00', '887-0999', '17/8/2011', 'Vendedor(a)', 1500.00, 1800.00, 3000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000005', 'Carlos', 'Oliveira', 'E01', '987-9901', '21/3/2008', 'Técnico de Manutenção', 'M', '20/5/1985', 3800.50, 3000.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000009', 'Patrícia', 'Knosth', 'C33', '557-0999', '21/9/2012', 'Analista', 'F', '21/10/1993', 2600.00, 1700.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000010', 'Adalberto', 'Conte', 'B10', '332-9091', '22/10/2013', 'Consultor de RH', 'M', '28/6/1987', 2400.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000012', 'Ricardo', 'Pontes', 'B10', '890-9882', '22/10/2013', 'Recrutador', 'M', '13/2/1978', 2600.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000016', 'João', 'Amancio', 'E00', '989-2241', '24/11/2007', 'Treinador de Vendas', 'M', '4/6/1969', 6000.00, 5000.00, 7000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000019', 'Cristina', 'Cabral', 'D00', '321-1549', '15/7/2010', 'Gerente', 'F', '6/1/1991', 4500.00, null, 2500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000020', 'Maria', 'Silva', 'A01', '338-5578', '19/2/2011', 'Contador(a)', 'F', '24/6/1990', 2100.00, 2000.00, 2000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000027', 'Margarida', 'Oliveira', 'A01', '659-9791', '24/5/2010', 'Gerente', 'F', '6/12/1986', 3500.00, 2500.00, 3000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000028', 'Ricardo', 'Santos', 'A01', '589-4833', '13/6/2009', 'Analista Contábil', 'M', '15/5/1989', 1300.00, 1000.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000029', 'João', 'Salto', 'A21', '445-9871', '18/4/2012', 'Comprador(a)', 'M', '27/9/1988', 1600.00, null, 2300.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000031', 'Cláudio', 'Alves', 'A21', '518-4582', '11/7/2011', 'Analista Financeiro', 'M', '17/12/1990', 1800.90, 2300.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000032', 'Camila', 'Contato', 'A21', '793-1716', '19/9/2010', 'Gerente', 'F', '19/8/1969', 4500.00, null, 8000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000033', 'Raissa', 'Queiróz', 'A12', '353-3584', '25/11/2009', 'Assistente de Contas', 'F', '2/10/1983', 2600.00, 3000.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000034', 'Igor', 'Andrade', 'A12', '663-8545', '28/2/2009', 'Gerente', 'M', '23/7/1992', 3400.60, 4500.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000036', 'André', 'Mello', 'A12', '548-4833', '23/7/2008', 'Assistente de Contas', 'M', '29/1/1986', 2400.30, null, 2000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000037', 'Márcio', 'Pires', 'B10', '144-4862', '27/8/2009', 'Gerente', 'M', '21/12/1991', 4000.00, 3700.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000039', 'Edson', 'Cardoso', 'B10', '555-4833', '21/5/2010', 'Pscicólogo', 'M', '12/4/1988', 3100.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000042', 'Armando', 'Silva', 'B17', '266-9813', '18/7/2009', 'Gerente', 'M', '18/5/1989', 5100.00, 5000.00, 6500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000045', 'Patrícia', 'Bueno', 'B17', '445-9998', '4/12/2011', 'Técnico Implantação', 'F', '14/9/1967', 4200.00, 3000.00, 3500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000046', 'Riquelme', 'Filho', 'B17', '775-4866', '9/10/2009', 'Analista Geral', 'M', '22/5/1987', 3800.00, 2900.00, 2500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000047', 'Leonardo', 'Henrique', 'C02', '888-6911', '13/5/2008', 'Técnico de Sistemas', 'M', '27/10/1990', 3200.00, 2000.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000048', 'Saulo', 'Brito', 'C12', '999-4588', '16/10/2010', 'Analista de Mercado', 'M', '19/2/1984', 6500.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000049', 'Samanta', 'Barshymi', 'C33', '332-4843', '9/10/2009', 'Tecnico Meio Ambiente', 'F', '17/1/1988', 2700.00, 1800.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000050', 'Sabrina', 'Volcher', 'D00', '445-6688', '15/2/2008', 'Analista de Sistemas', 'F', '13/8/1990', 3800.00, 2000.00, 3500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000051', 'Letícia', 'Walker', 'D01', '484-0549', '12/6/2009', 'Analista de Sistemas', 'F', '30/12/1987', 3500.00, null, 4000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000052', 'Letícia', 'Pedroso', 'D12', '363-4822', '28/9/2010', 'Administrador de Banco de Dados', 'F', '27/2/1986', 7000.00, 2000.00, 1500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000053', 'Laís', 'Cândido', 'D15', '321-3548', '27/5/2009', 'Gerente', 'F', '23/4/1989', 4600.00, null, 3200.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000055', 'Arnaldo', 'Pereira', 'D17', '333-5444', '5/10/2011', 'Analista de Procedimentos', 'M', '21/3/1989', 3400.00, 1500.00, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000056', 'Pâmela', 'Alfredo', 'D21', '325-5548', '14/7/2009', 'Gerente', 'F','23/7/1966', 5120.00, 1000.00, 3200.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000057', 'Andressa', 'Shinashq', 'D27', '314-1548', '21/5/2008', 'Gerente Técnico', 'F', '25/9/1978', 4800.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000060', 'Artur', 'Costa', 'E01', '211-1866', '22/1/2008', 'Técnico de Máquinas', 'M', '12/10/1974', 3700.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000064', 'Augusto', 'Bartolomeu', 'E08', '512-9888', '22/1/2008', 'Técnico de Sistemas', 'M', '14/9/1977', 3500.00, null, null);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000065', 'Felipe', 'Martins', 'E00', '548-6974', '27/5/2009', 'Vendedor(a)', 'M', '19/6/1979', 1200.00, 2000.00, 3200.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000067', 'Bruno', 'Nascimento', 'D17', '447-9863', '28/5/2009', 'Analista de Procedimentos', 'M', '7/5/1989', 1700.00, 1500.00, 2000.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000068', 'Daniel', 'Martins', 'D15', '154-8766', '27/5/2009', 'Analista de Processos', 'M', '9/12/1990', 2200.00, 1000.00, 1500.00);
insert into EMPR (matr, nome, sobrenome, dept, fone, dinamin, cargo, sexo, datanas, salario, bonus, comis) values ('000069', 'Emanuel', 'Figueiredo', 'E08', '555-9985', '18/7/2009', 'Técnico de Sistemas', 'M', '11/11/1982', 2500.00, 1500.00, 2000.00);
go
update DEPT set dsuper = 'A01'
where dcodigo = 'A21' or dcodigo = 'A12';
go
update DEPT set dsuper = 'B17'
where dcodigo = 'C02';
go
update DEPT set dsuper = 'D00'
where dcodigo = 'D01' or dcodigo = 'D12' or dcodigo = 'D21';
go
update DEPT set dsuper = 'D15'
where dcodigo = 'D17';
go
update DEPT set dsuper = 'D27'
where dcodigo = 'E01' or dcodigo = 'E08';
go
update DEPT set gerente = '000001'
where dcodigo = 'E00';
go
update DEPT set gerente = '000019'
where dcodigo = 'D00';
go
update DEPT set gerente = '000027'
where dcodigo = 'A01';
go
update DEPT set gerente = '000032'
where dcodigo = 'A21';
go
update DEPT set gerente = '000034'
where dcodigo = 'A12';
go
update DEPT set gerente = '000037'
where dcodigo = 'B10';
go
update DEPT set gerente = '000042'
where dcodigo = 'B17';
go
update DEPT set gerente = '000053'
where dcodigo = 'D15';
go
update DEPT set gerente = '000056'
where dcodigo = 'D21';
go
update DEPT set gerente = '000057'
where dcodigo = 'D27';
go
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe) values ('P00001', 'Sistema Multiprogramável', 'D01', '000051', 4);
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe) values ('P00002', 'Redef. de Processos', 'D15', '000053', 2);
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe) values ('P00003', 'Algoritmo de decisão', 'D01', '000019', 3);
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe) values ('P00004', 'Desenho Processo', 'D17', '000053', 3);
insert into PROJETO (pcodigo, pnome, dcodigo, resp, equipe) values ('P00005', 'Fluxo de Banco de Dados', 'D12', '000052', 1);
go
--CONSULTAS SQL

--Exercício 1
go
select sobrenome, nome, dept, datanas, dinamin, salario*12 as salario from EMPR
where salario*12 >= 30000
--Exercicio 2
go
select dcodigo, dnome, gerente, dsuper from DEPT
where gerente is null;
--Exercicio 3
go
select sobrenome, nome, dept, datanas, dinamin, salario*12 as salario from EMPR
where salario*12 <= 20000;
--Exercício 4 (foi substituido o 'A00' pelo 'D00')
go
select * from DEPT
where dsuper = 'D00';
--Exercício 5 (foi substituido o 'serviço' por 'sistema')
go
select dcodigo, dnome from DEPT
where dnome like '%sistema%';
--Exercício 6
go
select matr, sobrenome, dept, fone from EMPR
where dept between 'D11' and 'D21';
--Exercicio 7 (foi substituido o 'B01' pelo 'B10')
go
update EMPR set comis = 0
where dept = 'B10' or dept = 'C01' or dept = 'D01' and comis = null;
go
select sobrenome, dept, salario+comis as rendimento from EMPR
where dept = 'B10' or dept = 'C01' or dept = 'D01'
order by salario+comis desc
--Exercicio 8
go
select sobrenome, salario*12 as salario_anual, dept from EMPR
where salario > 3000
order by sobrenome asc;
--Exercicio 9
go
select matr, nome, sobrenome from EMPR
where dept like 'E%';
--Exercício 10
go
select matr, sobrenome, salario from EMPR
where sexo = 'M' and salario < 1600
--Exercicio 11
go
select sobrenome, (comis/(salario+comis+bonus))*100 as porcentagem_comissao from EMPR
where cargo like 'Vende%'
--Exercicio 12 (foi substituido o 'E01' por 'A01')
go
select * from DEPT
where dcodigo = 'A01' or dsuper = 'A01';
--Exercício 13
go
select sobrenome, salario*12 as salario_anual, cargo, niveled from EMPR
where salario*12 > 40000 or (cargo like 'Gerente%' and niveled < 16)
