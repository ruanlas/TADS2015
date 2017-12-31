CREATE TABLE Treinador(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(64) NOT NULL,
    cidade VARCHAR(64),
    idade INT,
    
    PRIMARY KEY(id)
);


CREATE TABLE Pokemon(
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(64) NOT NULL,
    xp INT DEFAULT 10,
    treinador_id BIGINT,
    
    PRIMARY KEY(id),
    FOREIGN KEY(treinador_id) REFERENCES Treinador(id)
			ON DELETE SET NULL 
			ON UPDATE CASCADE
);



