CREATE SCHEMA `edurate` ;

CREATE TABLE `edurate`.`user` (
  `UserId` INT NOT NULL AUTO_INCREMENT,
  `UserName` VARCHAR(45) NOT NULL,
  `UserPassword` VARCHAR(45) NOT NULL,
  `UserFirstName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`UserId`),
  unique INDEX `UserId_UNIQUE` (`UserId` ASC),
  unique INDEX `UserName_UNIQUE` (`UserName` ASC))
  COMMENT = 'In this table I store Users with them id, name and password.';


