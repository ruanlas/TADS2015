CREATE TABLE [dbo].[Profissao]
(
	[CodProfissao] INT NOT NULL PRIMARY KEY, 
    [TipoProfissao] VARCHAR(25) NULL
)
GO

CREATE TABLE [dbo].[Pessoa]
(
	[CodPessoa] INT NOT NULL PRIMARY KEY, 
    [Nome] VARCHAR(35) NULL, 
    [RG] INT NULL, 
    [CPF] INT NULL, 
    [Endereco] VARCHAR(100) NULL,
	[CodProfissao] INT NOT NULL,
	FOREIGN KEY ([CodProfissao]) REFERENCES [dbo].[Profissao] ([CodProfissao])
)
GO

CREATE TABLE [dbo].[Pessoa_email]
(
	[Cod] INT NOT NULL PRIMARY KEY, 
    [CodPessoa] INT NOT NULL,
	[Email] VARCHAR(35) NOT NULL,
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[Pessoa_Telefone]
(
	[Cod] INT NOT NULL PRIMARY KEY, 
    [CodPessoa] INT NOT NULL,
	[Telefone] INT NOT NULL,
	[TipoTelefone] INT NOT NULL,
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[TipoUsuario]
(
	[CodTipo] INT NOT NULL PRIMARY KEY,
	[TipoUsuario] INT NOT NULL
)
GO

CREATE TABLE [dbo].[Usuarios]
(
	[CodUsuario] INT NOT NULL PRIMARY KEY, 
    [User] INT NOT NULL,
	[Password] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoUsuario] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Pessoa_Usuarios]
(
	[Cod] INT NOT NULL PRIMARY KEY, 
    [CodUsuario] INT NOT NULL,
	[CodPessoa] INT NOT NULL,
	FOREIGN KEY ([CodUsuario]) REFERENCES [dbo].[Usuarios] ([CodUsuario]),
	FOREIGN KEY ([CodPessoa]) REFERENCES [dbo].[Pessoa] ([CodPessoa])
)
GO

CREATE TABLE [dbo].[TipoAtividade]
(
	[CodTipo] INT NOT NULL PRIMARY KEY,
	[Atividade] INT NOT NULL
)
GO

CREATE TABLE [dbo].[TipoMaterial]
(
	[CodTipo] INT NOT NULL PRIMARY KEY,
	[TipoMaterial] INT NOT NULL
)
GO

CREATE TABLE [dbo].[Materiais]
(
	[CodMaterial] INT NOT NULL PRIMARY KEY,
	[NomeMaterial] INT NOT NULL,
	[Rendimento] INT NOT NULL,
	[Observacoes] INT NOT NULL,
	[UnidadeDeRendimento] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoMaterial] ([CodTipo])
)
GO

CREATE TABLE [dbo].[TipoAtividade_Materiais]
(
	[Campo1] INT NOT NULL PRIMARY KEY,
	[CodMaterial] INT NOT NULL,
	[CodTipo] INT NOT NULL,
	FOREIGN KEY ([CodMaterial]) REFERENCES [dbo].[Materiais] ([CodMaterial]),
	FOREIGN KEY ([CodTipo]) REFERENCES [dbo].[TipoAtividade] ([CodTipo])
)
GO

CREATE TABLE [dbo].[Orcamento]
(
	[CodOrcamento] INT NOT NULL PRIMARY KEY,
	[Observacoes] INT NOT NULL,
	[MaodeObra] INT NOT NULL,
	[ValorTotal] INT NOT NULL,
	[DataEmissao] DATE NOT NULL,
	[Validade] INT NOT NULL,
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
	[Quantidade] INT NOT NULL,
	[ValorUnitario] INT NOT NULL,
	FOREIGN KEY ([CodOrcamento]) REFERENCES [dbo].[Orcamento] ([CodOrcamento]),
	FOREIGN KEY ([CodMaterial]) REFERENCES [dbo].[Materiais] ([CodMaterial])
)
GO