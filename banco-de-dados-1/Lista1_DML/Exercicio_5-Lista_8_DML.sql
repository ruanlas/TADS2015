use OFICINA
go
insert into clientes (nome, endereco, bairro, cidade, uf, cep, telefone, celular) values ('Augusto', 'Rua Jordana, 234', 'São Miguel', 'São Paulo', 'Brasil', '43214-094', '32220999', '988003322');
insert into clientes (nome, endereco, bairro, cidade, uf, cep, telefone, celular) values ('Antônio', 'Rua Treze, 56', 'Jardim das Oliveiras', 'Paulínia', 'Brasil', '32456-098', '34459009', '980019895');
insert into clientes (nome, endereco, bairro, cidade, uf, cep, telefone, celular) values ('Ricardo', 'Rua Anchieta, 79', 'Centro', 'Campinas', 'Brasil', '15098-870', '24530910', '978002117');
insert into clientes (nome, endereco, bairro, cidade, uf, cep, telefone, celular) values ('Monteiro', 'Rua Teresinha, 65', 'Jardim Bela Vista', 'Hortolandia', 'Brasil', '25890-009', '42236777', '78660983');
insert into clientes (nome, endereco, bairro, cidade, uf, cep, telefone, celular) values ('Michel', 'Rua Quinze, s/n', 'Jardim Boa Esperança', 'Campinas', 'Brasil', '16980-098', '32337689', '981739870');
go
insert into veiculos (codCliente, marca, modelo, ano, cor, obs) values (1, 'Chevrolet', 'Celta', 2008, 'Prata', null);
insert into veiculos (codCliente, marca, modelo, ano, cor, obs) values (2, 'Chevrolet', 'Classic', 2012, 'Branco', null);
insert into veiculos (codCliente, marca, modelo, ano, cor, obs) values (1, 'Volkswagen', 'Gol', 2014, 'Vermelho', null);
insert into veiculos (codCliente, marca, modelo, ano, cor, obs) values (4, 'Citroen', 'C4 Pallas', 2013, 'Preto', 'Consignado')
insert into veiculos (codCliente, marca, modelo, ano, cor, obs) values (3, 'Renaut', 'Duster', 2015, 'Marron', null);
go
insert into manutencao (codCliente, codVeiculo, dataEntrada, dataPrevista, dataRetirada, obs) values (1,1, '13/9/2014', '22/9/2014', '22/9/2014', 'Poucos reparos');
insert into manutencao (codCliente, codVeiculo, dataEntrada, dataPrevista, dataRetirada, obs) values (1,3, '15/7/2009', '18/7/2014', '17/7/2014', 'Troca freio');
insert into manutencao (codCliente, codVeiculo, dataEntrada, dataPrevista, dataRetirada, obs) values (2,2, '12/5/2015', '12/6/2015', '29/5/2015', 'Retifica de Motor');
insert into manutencao (codCliente, codVeiculo, dataEntrada, dataPrevista, dataRetirada, obs) values (3,5, '11/3/2012', '11/3/2012', '11/3/2012', null);
insert into manutencao (codCliente, codVeiculo, dataEntrada, dataPrevista, dataRetirada, obs) values (1,1, '12/7/2015', '12/7/2015', '13/7/2015', 'Suspensão');
go
insert into maoobra (codManutencao, codVeiculo, orcamento, maoDeObra, valorOrcamento, totalOrcamento) values (1, 1, 400, 200, 600, 550);
insert into maoobra (codManutencao, codVeiculo, orcamento, maoDeObra, valorOrcamento, totalOrcamento) values (2, 3, 300, 100, 400, 400);
insert into maoobra (codManutencao, codVeiculo, orcamento, maoDeObra, valorOrcamento, totalOrcamento) values (3, 2, 1200, 250, 1450, 1300);
insert into maoobra (codManutencao, codVeiculo, orcamento, maoDeObra, valorOrcamento, totalOrcamento) values (4, 5, 80, 30, 110, 100);
insert into maoobra (codManutencao, codVeiculo, orcamento, maoDeObra, valorOrcamento, totalOrcamento) values (5, 1, 170, 45, 215, 200);
