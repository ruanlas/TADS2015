create database Blog
go
use Blog
go
create table grupos
(
id int not null identity(1,1) primary key,
nome varchar(45) not null
)
go
create table usuarios
(
id int not null identity(1,1) primary key,
login_ varchar(45) not null,
senha varchar(80) not null,
email varchar(80) not null,
created date not null,
grupo_id int not null foreign key references grupos(id)
)
go
create table posts
(
id int not null identity(1,1) primary key,
titulo varchar(80) not null,
texto text not null,
publicar bit not null,
created date not null,
modifield date not null,
usuario_id int not null foreign key references usuarios(id)
)
go
create table comentarios
(
id int not null identity(1,1) primary key,
nome varchar(80) not null,
email varchar(128) not null,
publicar bit not null,
created date not null,
post_id int not null foreign key references posts(id),
usuario_id int not null foreign key references usuarios(id)
)
