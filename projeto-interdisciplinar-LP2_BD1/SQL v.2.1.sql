create database SieS
go
use SieS
go
CREATE TABLE [dbo].[Profissao]
(
	[CodProfissao] INT NOT NULL PRIMARY KEY, 
    [TipoProfissao] VARCHAR(25) NULL
)
GO

CREATE TABLE [dbo].[Pessoa]
(
	[CodPessoa] INT NOT NULL PRIMARY KEY, 
    [Nome] VARCHAR(50) not NULL,
	[DataNascimento] date not null, 
    [RG] INT not NULL, 
    [CPF] INT not NULL, 
    [Endereco] VARCHAR(100) NULL,
	[CodProfissao] INT NOT NULL,
	FOREIGN KEY ([CodProfissao]) REFERENCES [dbo].[Profissao] ([CodProfissao])
)
GO

CREATE TABLE [dbo].[Pessoa_email]
(
	[Cod] INT NOT NULL PRIMARY KEY, 
    [CodPessoa] INT NOT NULL,
	[Email] VARCHAR(45) NOT NULL,
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[Pessoa_Telefone]
(
	[Cod] INT NOT NULL PRIMARY KEY, 
    [CodPessoa] INT NOT NULL,
	[Telefone] INT NOT NULL,
	[TipoTelefone] varchar(20) NOT NULL,
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[TipoUsuario]
(
	[CodTipo] INT NOT NULL PRIMARY KEY,
	[TipoUsuario] varchar(15) NOT NULL
)
GO

CREATE TABLE [dbo].[Usuarios]
(
	[CodUsuario] INT NOT NULL PRIMARY KEY identity(1,1), 
    [User] varchar(25) NOT NULL,
	[Password] varchar(25) NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoUsuario] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Pessoa_Usuarios]
(
	[Cod] INT NOT NULL PRIMARY KEY, 
    [CodUsuario] INT NOT NULL unique,
	[CodPessoa] INT NOT NULL unique,
	FOREIGN KEY ([CodUsuario]) REFERENCES [dbo].[Usuarios] ([CodUsuario]),
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[TipoAtividade]
(
	[CodTipo] INT NOT NULL PRIMARY KEY,
	[Atividade] varchar(20) NOT NULL
)
GO

CREATE TABLE [dbo].[TipoMaterial]
(
	[CodTipo] INT NOT NULL PRIMARY KEY,
	[TipoMaterial] varchar(20) NOT NULL
)
GO

CREATE TABLE [dbo].[Materiais]
(
	[CodMaterial] INT NOT NULL PRIMARY KEY,
	[NomeMaterial] varchar(35) NOT NULL,
	[Rendimento] INT NOT NULL,
	[Observacoes] varchar(100) NOT NULL,
	[UnidadeDeRendimento] varchar(10) NOT NULL,
	[ConteudoEmbalagem] float NOT NULL,
	[UnidadeDoConteudo_Cx] varchar(10) NOT NULL,
	--[CodTipo] INT NOT NULL,
	--FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoMaterial] ([CodTipo])
)
GO

CREATE TABLE [dbo].[TipoAtividade_Materiais]
(
	[Cod] INT NOT NULL PRIMARY KEY,
	[CodMaterial] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodMaterial]) REFERENCES [dbo].[Materiais] ([CodMaterial]),
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoAtividade] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Orcamento]
(
	[CodOrcamento] INT NOT NULL PRIMARY KEY,
	[Observacoes] varchar(100) NOT NULL,
	[MaodeObra] decimal(7,2) NOT NULL,
	[ValorTotal] decimal(7,2) NOT NULL,
	[DataEmissao] DATE NOT NULL,
	[Validade] date NOT NULL,
	[CodCliente] INT NOT NULL,
	[CodProfissional] INT NOT NULL,
	FOREIGN KEY ([CodCliente]) REFERENCES [dbo].[Pessoa] ([CodPessoa]),
	FOREIGN KEY ([CodProfissional]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[Orcamento_TipoAtividade]
(
	[Cod] INT NOT NULL PRIMARY KEY,
	[CodOrcamento] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodOrcamento]) REFERENCES [dbo].[Orcamento] ([CodOrcamento]),
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoAtividade] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Descricao_Orcamento]
(
	[Cod] INT NOT NULL PRIMARY KEY,
	[CodOrcamento] INT NOT NULL,
	[CodMaterial] INT NOT NULL,
	[Item] INT NOT NULL,
	[QuantidadeMateriais] float NOT NULL,
	[ValorUnitario] decimal(7,2) NOT NULL,
	FOREIGN KEY ([CodOrcamento]) REFERENCES [dbo].[Orcamento] ([CodOrcamento]),
	FOREIGN KEY ([CodMaterial]) REFERENCES [dbo].[Materiais] ([CodMaterial])
)
GO