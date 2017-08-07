use ESCOLA
go
insert into alunos (nome, email, senha, cpf) values ('Fabio Camargo', 'fabio.camargo@gmail.com', 'lka1532', '99022200022');
insert into alunos (nome, email, senha, cpf) values ('Samantha Dias', 'sahdias@gmail.com', 'osad987', '34488833300');
insert into alunos (nome, email, senha, cpf) values ('Jean Oliveira', 'jean_oli@hotmail.com', 'Eld2201', '23199900022');
insert into alunos (nome, email, senha, cpf) values ('Marcia Santana', 'marcia.santana@gmail.com', 'HDsw231', '12344422209');
insert into alunos (nome, email, senha, cpf) values ('Sabrina Becker', 'becker@hotmail.com', 'SBckr98', '89066088821');
go
insert into cursos (nome) values ('Engenharia Química');
insert into cursos (nome) values ('Análise de Sistemas');
insert into cursos (nome) values ('Engenharia Ambiental');
insert into cursos (nome) values ('Letras');
insert into cursos (nome) values ('Pedagogia');
go
insert into professores (nome, email, senha) values ('Antonio Santos', 'antonio.san@gmail.com', 'ant3215');
insert into professores (nome, email, senha) values ('Gilmar Soares', 'gilmarsoares@bol.com', 'gil0988');
insert into professores (nome, email, senha) values ('Paulo Válio', 'valio.paulo@dpf.gov', 'Pvpf007');
insert into professores (nome, email, senha) values ('Gilson Azevedo', 'azevedogil@yahoo.com', 'Azev402');
insert into professores (nome, email, senha) values ('Marli Oliveira', 'mar_oliv@gmail.com', 'mArlOl2');
go
insert into disciplinas (nome, idprofessor) values ('Matemática', 1);
insert into disciplinas (nome, idprofessor) values ('Meio Ambiente', 2);
insert into disciplinas (nome, idprofessor) values ('Arquitetura Computadores', 3);
insert into disciplinas (nome, idprofessor) values ('Ingles', 5);
insert into disciplinas (nome, idprofessor) values ('Tecnologia Móvel', 4);
go
insert into matriculas (ativa, data_cadastro, idpessoa, idcurso) values (1, '14/9/2010', 1, 2);
insert into matriculas (ativa, data_cadastro, idpessoa, idcurso) values (0, '12/9/2015', 2, 1);
insert into matriculas (ativa, data_cadastro, idpessoa, idcurso) values (1, '14/9/2015', 3, 5);
insert into matriculas (ativa, data_cadastro, idpessoa, idcurso) values (1, '12/8/2013', 4, 3);
insert into matriculas (ativa, data_cadastro, idpessoa, idcurso) values (0, '11/10/2015', 5, 4);
go
insert into disciplinas_cursos (idcurso, iddisciplina) values (1, 1);
insert into disciplinas_cursos (idcurso, iddisciplina) values (1, 4);
insert into disciplinas_cursos (idcurso, iddisciplina) values (2, 1);
insert into disciplinas_cursos (idcurso, iddisciplina) values (2, 3);
insert into disciplinas_cursos (idcurso, iddisciplina) values (2, 4);
insert into disciplinas_cursos (idcurso, iddisciplina) values (2, 5);
insert into disciplinas_cursos (idcurso, iddisciplina) values (3, 1);
insert into disciplinas_cursos (idcurso, iddisciplina) values (3, 2);
insert into disciplinas_cursos (idcurso, iddisciplina) values (3, 4);
