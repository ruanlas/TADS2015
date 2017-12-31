use Blog
go
insert into grupos (nome) values ('Administradores');
insert into grupos (nome) values ('Autores');
insert into grupos (nome) values ('Editores');
insert into grupos (nome) values ('Visitantes');
insert into grupos (nome) values ('Usuários');
go
insert into usuarios (login_, senha, email, created, grupo_id) values ('joao123', 'odn345nso', 'joao123@gmail.com', '18/3/2008', 1);
insert into usuarios (login_, senha, email, created, grupo_id) values ('alfre231', 'fdds098aa', 'alfre@hotmail.com', '14/9/2014', 2);
insert into usuarios (login_, senha, email, created, grupo_id) values ('vitinho' , '342cdiosn', 'vito@yahoo.com.br', '13/8/2010', 2);
insert into usuarios (login_, senha, email, created, grupo_id) values ('nessahhh', 'kso35634ll', 'vanessah@hotmail.com', '15/8/2014', 3);
insert into usuarios (login_, senha, email, created, grupo_id) values ('jehhas', 'dasdf9009', 'jehandrade_santana@gmail.com', '8/8/2014', 4);
go
insert into posts (titulo, texto, publicar, created, modifield, usuario_id) values ('Política Internacional', 'Os comentários que serão aqui abordados referen-se a politica internacional', 0, '13/9/2008', '13/9/2008', 1);
insert into posts (titulo, texto, publicar, created, modifield, usuario_id) values ('Meio Ambiente', 'O meio ambiente precisa ser preservado para que assim seja possível uma.....', 1, '13/7/2015', '14/9/2015', 2);
insert into posts (titulo, texto, publicar, created, modifield, usuario_id) values ('História da Tecnologia', 'A tecnologia passou por várias evoluções durante o período da revolução....', 0, '14/9/2013', '19/8/2015', 3);
insert into posts (titulo, texto, publicar, created, modifield, usuario_id) values ('Abordagem sobre criptografia', 'A criptografia é a tecnica que permite codificar uma mensagem....', 1, '9/10/2015', '9/10/2015', 2);
insert into posts (titulo, texto, publicar, created, modifield, usuario_id) values ('O que é Hardware?', 'Um computador é composto por duas partes, o Hardware e o Software: o Hardware...', 1, '10/10/2015', '10/10/2015', 4);
go
insert into comentarios (nome, email, publicar, created, post_id, usuario_id) values ('Legal este post', 'teste@teste.com', 0, '11/12/2014', 1,2);
insert into comentarios (nome, email, publicar, created, post_id, usuario_id) values ('Muito interessante, parabéns!', 'vito@yahoo.com.br', 1, '14/3/2015', 5,3);
insert into comentarios (nome, email, publicar, created, post_id, usuario_id) values ('Bacana este assunto!', 'alfre@hotmail.com', 1, '12/8/2014', 5,2);
insert into comentarios (nome, email, publicar, created, post_id, usuario_id) values ('Bem Conceitual este post', 'teste@teste.com', 0, '11/9/2015', 5,3);
insert into comentarios (nome, email, publicar, created, post_id, usuario_id) values ('Parabéns pelo seu trabalho!!', 'jehandrade_santana@gmail.com',1, '9/10/2015', 2, 5);
