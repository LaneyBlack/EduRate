CREATE SCHEMA `edurate` ;

CREATE TABLE `edurate`.`user` (
  `UserId` INT NOT NULL,
  `UserName` VARCHAR(45) NOT NULL,
  `UserPassword` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`UserId`),
  unique INDEX `UserId_UNIQUE` (`UserId` ASC),
  unique INDEX `UserName_UNIQUE` (`UserName` ASC))
  COMMENT = 'In this table I store Users with them id, name and password.';

  ALTER TABLE `edurate`.`user`
DROP COLUMN `UserId`,
ADD COLUMN `UserFirstName` VARCHAR(45) NOT NULL AFTER `UserPassword`,
DROP INDEX `idUser_UNIQUE` ,
DROP PRIMARY KEY;
;

ALTER TABLE `edurate`.`user`
ADD COLUMN `UserId` INT ,
ADD PRIMARY KEY (`UserId`),
ADD UNIQUE INDEX `UserId_UNIQUE` (`UserId` ASC);
;

