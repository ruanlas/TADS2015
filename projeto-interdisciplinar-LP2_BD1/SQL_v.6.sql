/* 
    Autor: Paulo Henrique C. Limeira
    Função: CREATE DATABASE
    Descrição: 
    Data: 13/11/2015 02:56 AM 
 */
 create database SieS
 go
 use SieS
 go
 
CREATE TABLE [dbo].[Profissao]
(
	[CodProfissao] INT NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    [TipoProfissao] VARCHAR(25) not NULL
)
GO

CREATE TABLE [dbo].[Pessoa]
(
	[CodPessoa] INT NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    [Nome] VARCHAR(50) NOT NULL,
	[DataNascimento] DATE NOT NULL, 
    [RG] varchar(15) NOT NULL unique, --não aceitou double
    [CPF] varchar(15) NOT NULL unique, --nao aceitou double
    [Endereco] VARCHAR(100) Not NULL,
	[CodProfissao] INT NOT NULL,
	[Obs] text null,
	FOREIGN KEY ([CodProfissao]) REFERENCES [dbo].[Profissao] ([CodProfissao])
)
GO

CREATE TABLE [dbo].[Pessoa_email]
(
	[Cod] INT NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    [CodPessoa] INT NOT NULL,
	[Email] VARCHAR(45) NOT NULL,
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[Pessoa_Telefone]
(
	[Cod] INT NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    [CodPessoa] INT NOT NULL,
	[Telefone] varchar(15) NOT NULL,--nao aceitou double
	[TipoTelefone] VARCHAR(20) NOT NULL,
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[TipoUsuario]
(
	[CodTipo] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[TipoUsuario] VARCHAR(15) NOT NULL
)
GO

CREATE TABLE [dbo].[Usuarios]
(
	[CodUsuario] INT NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    [User] VARCHAR(25) NOT NULL UNIQUE,
	[Password] VARCHAR(25) NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoUsuario] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Pessoa_Usuarios]
(
	[Cod] INT NOT NULL IDENTITY (1,1) PRIMARY KEY, 
    [CodUsuario] INT NOT NULL UNIQUE,
	[CodPessoa] INT NOT NULL UNIQUE,
	FOREIGN KEY ([CodUsuario]) REFERENCES [dbo].[Usuarios] ([CodUsuario]),
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[TipoAtividade]
(
	[CodTipo] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[Atividade] VARCHAR(20) NOT NULL
)
GO

CREATE TABLE [dbo].[CatMaterial] --Categoria do Material
(
	[CodCat] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[CatMaterial] VARCHAR(20) NOT NULL
)
GO

CREATE TABLE [dbo].[Materiais]
(
	[CodMaterial] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[NomeMaterial] VARCHAR(35) NOT NULL,
	[Rendimento] float NOT NULL,
	[Observacoes] VARCHAR(100) NOT NULL,
	[UnidadeDeRendimento] VARCHAR(10) NOT NULL,
	[ConteudoEmbalagem] FLOAT NOT NULL,
	[UnidadeDoConteudo_Cx] VARCHAR(10) NOT NULL,
	[CodCat] INT NOT NULL,
	FOREIGN KEY ([CodCat]) REFERENCES [dbo].[CatMaterial] ([CodCat])
)
GO

CREATE TABLE [dbo].[TipoAtividade_Materiais]
(
	[Cod] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[CodMaterial] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodMaterial]) REFERENCES [dbo].[Materiais] ([CodMaterial]),
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoAtividade] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Orcamento]
(
	[CodOrcamento] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[Observacoes] text NOT NULL,
	[MaodeObra] DECIMAL(7,2) NOT NULL,
	[ValorTotal] DECIMAL(7,2) NOT NULL,
	[DataEmissao] DATE NOT NULL,
	[Validade] DATE NOT NULL,
	[CodCliente] INT NOT NULL,
	[CodProfissional] INT NOT NULL,
	FOREIGN KEY ([CodCliente]) REFERENCES [dbo].[Pessoa] ([CodPessoa]),
	FOREIGN KEY ([CodProfissional]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[Orcamento_TipoAtividade]
(
	[Cod] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[CodOrcamento] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodOrcamento]) REFERENCES [dbo].[Orcamento] ([CodOrcamento]),
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoAtividade] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Descricao_Orcamento]
(
	[Cod] INT NOT NULL IDENTITY (1,1) PRIMARY KEY,
	[CodOrcamento] INT NOT NULL,
	[CodMaterial] INT NOT NULL,
	[Item] INT NOT NULL,
	[QuantidadeMateriais] FLOAT NOT NULL,
	[UnidadeMedida] varchar(15) not null,
	[NumeroUnidades] int not null,
	[UnidadeAgrupamento] varchar(15) not null,
	[ValorUnitario] DECIMAL(7,2) NOT NULL,
	FOREIGN KEY ([CodOrcamento]) REFERENCES [dbo].[Orcamento] ([CodOrcamento]),
	FOREIGN KEY ([CodMaterial]) REFERENCES [dbo].[Materiais] ([CodMaterial])
)
go
---valores para teste
insert into TipoUsuario values('Profissional');
insert into TipoUsuario values('Cliente');
insert into Profissao values('Construção Civil');
insert into Profissao values ('Cliente')

insert into TipoAtividade Values
('Pintura'),
('Repintura'),
('Colocar Piso'),
('Colocar Gramado')
insert into CatMaterial values
('Piso'),
('Argamassa'),
('Rejunte'),
('Tinta'),
('Massa Corrida'),
('Selador'),
('Corante'),
('Fundo Preparador'),
('Gramado')
