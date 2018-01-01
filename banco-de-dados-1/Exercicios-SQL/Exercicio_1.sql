create database Exercicio_1
go
use Exercicio_1
go
create table fornecedor
(
Codigo int not null identity(1,1) primary key,
Nome varchar(70) not null,
Endereco varchar(70) not null,
CGC varchar(4) not null,
CapitalSocial money not null,
Categoria varchar(30) not null
)
go
create table produto
(
id int identity(1,1),
Codigo as 'A' + right('0' + cast(id as varchar(1)), 1) persisted,
Descricao varchar(50) not null,
Saldo int not null,
Unidade varchar(50) not null,
constraint PK_produto primary key (Codigo)
)
go
create table pedido
(
Numero int not null identity(1,1) primary key,
DataEmissao date not null,
Ano int not null,
CodFornecedor int not null foreign key references fornecedor(Codigo)
)
go
create table detalhe_pedido
(
id int not null identity(1,1) primary key,
NumPedido int not null foreign key references pedido(Numero),
Item int not null,
CodProduto varchar(2) not null foreign key references produto(Codigo),
Quantidade int not null
)
go
insert into fornecedor (Nome, Endereco, CGC, CapitalSocial, Categoria) values ('Irmãos Cunha', 'Rua 15', 'CGC1', 3000000.00, 'Atacadista');
insert into fornecedor (Nome, Endereco, CGC, CapitalSocial, Categoria) values ('Casa da Pesca', 'Rua 80', 'CCG2', 150000.00, 'Varejista');
insert into fornecedor (Nome, Endereco, CGC, CapitalSocial, Categoria) values ('Pecuarista do Povo', 'Rua São João', 'CGC3', 200000.00, 'Rural');
insert into fornecedor (Nome, Endereco, CGC, CapitalSocial, Categoria) values ('Papelaria Moderna', 'Rua 23', 'CGC3', 100000.00, 'Escolar');
go
insert into pedido (DataEmissao, Ano, CodFornecedor) values ('10/10/1998', 1998, 1);
insert into pedido (DataEmissao, Ano, CodFornecedor) values ('10/11/1998', 1998, 1);
insert into pedido (DataEmissao, Ano, CodFornecedor) values ('20/1/1999', 1999, 3);
insert into pedido (DataEmissao, Ano, CodFornecedor) values ('20/2/1999', 1999, 3);
go
insert into produto (Descricao, Saldo, Unidade) values ('Forno Microondas', 100, 'Unitário');
insert into produto (Descricao, Saldo, Unidade) values ('Anzol', 800, 'Duzia');
insert into produto (Descricao, Saldo, Unidade) values ('Adubo Orgânico KBX', 100, 'Kg');
insert into produto (Descricao, Saldo, Unidade) values ('Caderno Espiral 100 Fls', 180, 'Unitário');
go
insert into detalhe_pedido (NumPedido, Item, CodProduto, Quantidade) values (1, 1, 'A1', 5);
insert into detalhe_pedido (NumPedido, Item, CodProduto, Quantidade) values (1, 2, 'A2', 10);
insert into detalhe_pedido (NumPedido, Item, CodProduto, Quantidade) values (1, 3, 'A3', 3);
insert into detalhe_pedido (NumPedido, Item, CodProduto, Quantidade) values (2, 1, 'A1', 8);
insert into detalhe_pedido (NumPedido, Item, CodProduto, Quantidade) values (2, 2, 'A2', 60);
insert into detalhe_pedido (NumPedido, Item, CodProduto, Quantidade) values (3, 1, 'A3', 20);

--letra a)
go
select Numero, DataEmissao, Ano, CodFornecedor from pedido
where ano = 1998
--letra b)
go
select * from produto
where codigo = 'A3'
-- letra c)
go
select * from pedido
where CodFornecedor = 3
--letra d)
go
select * from produto
where saldo >=200