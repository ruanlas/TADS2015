CREATE TABLE Alunos (
    RA INT NOT NULL, 
    nome VARCHAR(50) , 
    endereco VARCHAR(50) , 
    cidade VARCHAR(50) ,
    PRIMARY KEY (RA) );
 
INSERT INTO Alunos( RA , NOME , ENDERECO , CIDADE ) VALUES ( 1 , 'Maria Oliveira'   , 'End 1' , 'Vitoria' );
INSERT INTO Alunos( RA , NOME , ENDERECO , CIDADE ) VALUES ( 2 , 'Pedro Paulo Cunha', 'End 2' , 'Campinas' );
INSERT INTO Alunos( RA , NOME , ENDERECO , CIDADE ) VALUES ( 3 , 'José da Silva', 'End 3' , 'Campinas' );
INSERT INTO Alunos( RA , NOME , ENDERECO , CIDADE ) VALUES ( 4 , 'Marília Gabriela', 'End 4' , 'Vila Velha' );
 
CREATE TABLE Disciplinas (
   COD_DISC CHAR(03) NOT NULL, 
   nome_disc VARCHAR(50), 
   carga_hor INT , 
   PRIMARY KEY (COD_DISC) )
 
INSERT INTO Disciplinas( COD_DISC , nome_disc  , carga_hor ) VALUES ( 'BD' , 'Banco de Dados' , 80 )
INSERT INTO Disciplinas( COD_DISC , nome_disc  , carga_hor ) VALUES ( 'LP1' , 'Linguagem de Programação 1'  , 80 )
INSERT INTO Disciplinas( COD_DISC , nome_disc  , carga_hor ) VALUES ( 'LP2' , 'Linguagem de Programação 2'  , 40 )
 
CREATE TABLE Professores (
   COD_PROF INT NOT NULL, 
   nome VARCHAR(50) , 
   endereco VARCHAR(50), 
   cidade VARCHAR(50) ,
   PRIMARY KEY (COD_PROF) )
 
INSERT INTO PROFESSORES( COD_PROF , NOME , CIDADE ) VALUES( 1 , 'Raul Seixas' , 'Vitoria'    );
INSERT INTO PROFESSORES( COD_PROF , NOME , CIDADE ) VALUES( 2 , 'José Ramalho'   , 'Campinas'   );
INSERT INTO PROFESSORES( COD_PROF , NOME , CIDADE ) VALUES( 3 , 'Paulo Coelho'   , 'Vila Velha' );
INSERT INTO PROFESSORES( COD_PROF , NOME , CIDADE ) VALUES( 4 , 'José Saramago' , 'Campinas'   );
 
CREATE TABLE Turma (
   COD_TURMA INT NOT NULL , 
   COD_DISC  CHAR(03) NOT NULL  , 
   COD_PROF  INT NOT NULL  , 
   ANO       INT NOT NULL  , 
   horario   VARCHAR(05) )
 
ALTER TABLE TURMA ADD CONSTRAINT PK_TURMA     PRIMARY KEY (COD_TURMA);
ALTER TABLE TURMA ADD CONSTRAINT FK_TURMADISC FOREIGN KEY (COD_DISC) REFERENCES disciplinas(cod_disc);
ALTER TABLE TURMA ADD CONSTRAINT FK_TURMAPROF FOREIGN KEY (COD_PROF) REFERENCES professores(cod_PROF);
 
INSERT INTO TURMA( COD_TURMA , COD_DISC , COD_PROF , ANO , HORARIO )
       VALUES ( 1 , 'BD' , 1 , 2013 , 'NOT' );
INSERT INTO TURMA( COD_TURMA , COD_DISC , COD_PROF , ANO , HORARIO )
       VALUES ( 2 , 'LP1' , 1 , 2010 , 'NOT' );
INSERT INTO TURMA( COD_TURMA , COD_DISC , COD_PROF , ANO , HORARIO )
       VALUES ( 3 , 'BD' , 2 , 2010 , 'NOT' );
INSERT INTO Turma( COD_TURMA , COD_DISC , COD_PROF , ANO , horario ) 
       VALUES ( 4 , 'LP2' , 4 , 2010 , 'NOT' );
INSERT INTO Turma( COD_TURMA , COD_DISC , COD_PROF , ANO , horario ) 
       VALUES ( 5 , 'BD' , 2 , 2011 , 'NOT' );
INSERT INTO TURMA( COD_TURMA , COD_DISC , COD_PROF , ANO , HORARIO )
       VALUES ( 6 , 'LP1' , 1 , 2011 , 'NOT' );
 
 
CREATE TABLE Historico (
   RA         INT NOT NULL  , 
   COD_DISC   CHAR(03) NOT NULL  , 
   COD_TURMA  INT NOT NULL , 
   COD_PROF   INT NOT NULL , 
   ANO        INT NOT NULL , 
   frequencia INT, 
   nota NUMERIC(5,2) )
 
ALTER TABLE historico ADD CONSTRAINT PK_HISTORICO     PRIMARY KEY (RA,COD_DISC,COD_TURMA,COD_PROF,ANO);
ALTER TABLE historico ADD CONSTRAINT PK_HISTORICOALUN FOREIGN KEY (RA) REFERENCES alunos(RA);
ALTER TABLE historico ADD CONSTRAINT PK_HISTORICODISC FOREIGN KEY (cod_disc) REFERENCES disciplinas(cod_disc);
ALTER TABLE historico ADD CONSTRAINT PK_HISTORICOTURM FOREIGN KEY (cod_turma) REFERENCES turma(cod_turma);
ALTER TABLE historico ADD CONSTRAINT PK_HISTORICOPROF FOREIGN KEY (cod_prof) REFERENCES professores(cod_prof);
 
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 1 , 'BD'  , 1 , 2 , 2010 , 2 , 7 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 2 , 'BD'  , 1 , 2 , 2010 , 2 , 4 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 3 , 'BD'  , 1 , 2 , 2010 , 2 , 3 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 4 , 'BD'  , 1 , 2 , 2010 , 2 , 8 );
 
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 1 , 'LP1'  , 1 , 1 , 2010 , 2 , 7.2 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 2 , 'LP1'  , 1 , 1 , 2010 , 2 , 4.2 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 4 , 'LP1'  , 1 , 1 , 2010 , 2 , 2.2 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 4 , 'LP2'  , 4 , 4 , 2010 , 30 , 2.2 );
 
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 1 , 'BD'  , 1 , 2 , 2011 , 2 , 3 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 2 , 'BD'  , 1 , 2 , 2011 , 2 , 4 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 3 , 'BD'  , 1 , 2 , 2011 , 2 , 3 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 4 , 'BD'  , 1 , 2 , 2011 , 2 , 8 );
 
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 1 , 'LP1'  , 1 , 1 , 2011 , 2 , 7.2 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 2 , 'LP1'  , 1 , 1 , 2011 , 2 , 4.2 );
INSERT INTO historico( RA , COD_DISC , COD_TURMA , COD_PROF , ANO , frequencia , nota )
       VALUES( 4 , 'LP1'  , 1 , 1 , 2011 , 2 , 2.2 );