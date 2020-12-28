-- MySQL Script generated by MySQL Workbench
-- Sun Nov 29 23:47:47 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`TBL_USUARIO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBL_USUARIO` (
  `ID` REAL NOT NULL,
  `TIPO_USUARIO` INT NULL,
  `NOME_USUARIO` VARCHAR(45) NULL,
  `EXCLUSAO` TINYINT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBL_VOTO`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBL_VOTO` (
  `ID` REAL NOT NULL,
  `ID_USUARIO` REAL NULL,
  `QUANTIDADE_ESTRELAS` INT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_TBL_VOTO_TBL_USUARIO1_idx` (`ID_USUARIO` ASC),
  CONSTRAINT `fk_TBL_VOTO_TBL_USUARIO1`
    FOREIGN KEY (`ID_USUARIO`)
    REFERENCES `mydb`.`TBL_USUARIO` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBL_FILMES`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBL_FILMES` (
  `ID` REAL NOT NULL,
  `NOME` VARCHAR(45) NULL,
  `DIRETOR` VARCHAR(45) NULL,
  `GENERO` VARCHAR(45) NULL,
  `ATORES` VARCHAR(45) NULL,
  `EXCLUSAO` TINYINT NULL,
  `ID_VOTO` REAL NULL,
  `TBL_FILMEScol` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_TBL_FILMES_TBL_VOTO_idx` (`ID_VOTO` ASC),
  CONSTRAINT `fk_TBL_FILMES_TBL_VOTO`
    FOREIGN KEY (`ID_VOTO`)
    REFERENCES `mydb`.`TBL_VOTO` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
