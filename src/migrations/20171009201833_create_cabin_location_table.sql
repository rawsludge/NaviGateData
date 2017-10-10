CREATE TABLE CABIN_LOCATION(
  ID                INT NOT NULL AUTO_INCREMENT,
  CODE              VARCHAR(2) NOT NULL,
  NAME              VARCHAR(30),
  INSERT_DATE       DATETIME,
  LAST_UPDATE_DATE  DATETIME,

  PRIMARY KEY (ID)
)
  ENGINE=InnoDB
  DEFAULT CHARSET=utf8;