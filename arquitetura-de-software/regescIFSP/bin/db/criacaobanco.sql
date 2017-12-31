CREATE DATABASE regescifsp

CREATE TABLE `regescifsp`.`aluno` (
	`matricula` BIGINT NOT NULL AUTO_INCREMENT ,
	`nome` VARCHAR(225) NOT NULL ,
	`cpf` VARCHAR(225) NOT NULL ,
	`dataNascimento` DATE NOT NULL ,
	`rg` VARCHAR(225) NOT NULL ,
	`ra` VARCHAR(225) NOT NULL ,
	PRIMARY KEY (`matricula`)
) ENGINE = InnoDB;

CREATE TABLE `regescifsp`.`professor` (
	`matricula` BIGINT NOT NULL AUTO_INCREMENT ,
	`nome` VARCHAR(225) NOT NULL ,
	`cpf` VARCHAR(225) NOT NULL ,
	`dataNascimento` DATE NOT NULL ,
	`rg` VARCHAR(225) NOT NULL ,
	PRIMARY KEY (`matricula`)
) ENGINE = InnoDB;

CREATE TABLE `regescifsp`.`departamento` (
	`id` INT NOT NULL AUTO_INCREMENT ,
	`nomeDepartamento` VARCHAR(225) NOT NULL ,
	`sigla` VARCHAR(225) NOT NULL ,
	PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE `regescifsp`.`disciplina` (
	`id` INT NOT NULL AUTO_INCREMENT ,
	`nomeDisciplina` VARCHAR(225) NOT NULL ,
	`sigla` VARCHAR(225) NOT NULL ,
	PRIMARY KEY (`id`)
) ENGINE = InnoDB;

CREATE TABLE `regescifsp`.`curso` (
	`id` INT NOT NULL AUTO_INCREMENT ,
	`nomeCurso` VARCHAR(225) NOT NULL ,
	`sigla` VARCHAR(225) NOT NULL ,
	PRIMARY KEY (`id`)
) ENGINE = InnoDB;

