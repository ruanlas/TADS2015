USE [master]
GO
CREATE LOGIN [restrito] WITH PASSWORD=N'123', DEFAULT_DATABASE=[Clinica], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [Clinica]
GO
CREATE USER [restrito] FOR LOGIN [restrito]
GO
use [Clinica]
GO
GRANT EXECUTE ON [dbo].[sp_AlocaConsulta] TO [restrito]
GO
