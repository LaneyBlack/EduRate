CREATE SCHEMA `edurate` ;

CREATE TABLE `edurate`.`user` (
  `UserId` INT NOT NULL,
  `UserName` VARCHAR(45) NOT NULL,
  `UserPassword` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`UserId`),
  UNIQUE INDEX `UserId_UNIQUE` (`UserId` ASC) VISIBLE,
  UNIQUE INDEX `UserName_UNIQUE` (`UserName` ASC) VISIBLE)
COMMENT = 'In this table I store Users with them id, name and password.';
