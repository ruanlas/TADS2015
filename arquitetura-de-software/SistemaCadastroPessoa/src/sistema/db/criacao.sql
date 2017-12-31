CREATE DATABASE 'db_cadastro_pessoa';

CREATE TABLE 'db_cadastro_pessoa.pessoa'(
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    rg BIGINT NOT NULL,
    cpf BIGINT NOT NULL,
    PRIMARY KEY(id)
    );
    
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Ruan Silva', 776688392, 32342342);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Leandro Cardoso', 798088392, 12342342);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Vagner Lima', 776680092, 32388742);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Oswaldo Pinto', 776654392, 32342702);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Francisca Oliveira', 776688000, 32980667);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Robson Rodrigues', 776688058, 32377892);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Nunes Vieira', 776688150, 30042342);
INSERT INTO db_cadastro_pessoa.pessoa (nome, cpf, rg) VALUES ('Carlos Valio', 776000392, 32340001);

