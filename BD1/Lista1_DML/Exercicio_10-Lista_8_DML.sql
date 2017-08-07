use LOCADORA
go
insert into cliente (nome, telefone, endereco) values ('Alberto Albuquerque', '555-3256', 'Rua das Oliveiras, 332 - São Paulo');
insert into cliente (nome, telefone, endereco) values ('Fernando Antunes', '555-2214', 'Avenida Orosimbo Maia, 1210 - Campinas');
insert into cliente (nome, telefone, endereco) values ('Caio Augusto', '555-0992', 'Alameda das Alcatéias, 31 - São Pedro');
insert into cliente (nome, telefone, endereco) values ('Fernando Oliveira', '555-3225', 'Rua Marcos Andradas, 811 - Pinheiros');
insert into cliente (nome, telefone, endereco) values ('Paulo Sérgio', '555-9920', 'Rua das Ortizes, 90 - Parque dos Eucalíptos');
go
insert into categoria (nome) values ('Ação');
insert into categoria (nome) values ('Ficção');
insert into categoria (nome) values ('Aventura');
insert into categoria (nome) values ('Infantil');
insert into categoria (nome) values ('Policial');
go
insert into ator (nome) values ('Jim Kery');
insert into ator (nome) values ('The Rock');
insert into ator (nome) values ('Selena Gomez');
insert into ator (nome) values ('Megan Fox');
insert into ator (nome) values ('Vin Diesel');
go
insert into filme (idcategoria, titulo) values (1, 'Veloses e Furiosos');
insert into filme (idcategoria, titulo) values (4, 'O fada do dente');
insert into filme (idcategoria, titulo) values (5, 'Com as própias mãos');
insert into filme (idcategoria, titulo) values (3, 'O Criador');
insert into filme (idcategoria, titulo) values (5, 'G.I. Joe');
go
insert into estrela (idcategoria, idfilme, idator) values (1, 1, 2);
insert into estrela (idcategoria, idfilme, idator) values (1, 1, 5);
insert into estrela (idcategoria, idfilme, idator) values (4, 2, 2);
insert into estrela (idcategoria, idfilme, idator) values (5, 5, 2);
insert into estrela (idcategoria, idfilme, idator) values (3, 4, 1);
go
insert into DVD (idcategoria, idfilme) values (1, 1);
insert into DVD (idcategoria, idfilme) values (4, 2);
insert into DVD (idcategoria, idfilme) values (5, 5);
insert into DVD (idcategoria, idfilme) values (3, 4);
insert into DVD (idcategoria, idfilme) values (5, 3);
go
insert into locacao (cliente_idcliente, dvd_numero, data_retirada, data_devolucao) values (1, 2, '2/10/2015', '10/10/2015');
insert into locacao (cliente_idcliente, dvd_numero, data_retirada, data_devolucao) values (1, 3, '2/10/2015', '10/10/2015');
insert into locacao (cliente_idcliente, dvd_numero, data_retirada, data_devolucao) values (1, 5, '2/10/2015', '10/10/2015');
insert into locacao (cliente_idcliente, dvd_numero, data_retirada, data_devolucao) values (2, 4, '24/8/2015', '30/8/2015');
insert into locacao (cliente_idcliente, dvd_numero, data_retirada, data_devolucao) values (3, 1, '12/1/2015', '21/1/2015');
