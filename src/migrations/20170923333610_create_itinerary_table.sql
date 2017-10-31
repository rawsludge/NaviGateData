CREATE TABLE ITINERARY (
  ID                INT NOT NULL AUTO_INCREMENT,
  CODE              VARCHAR(30) NOT NULL,
  NAME              VARCHAR(100),
  PORT_COUNT        INT,
  INSERT_DATE       DATETIME,
  LAST_UPDATE_DATE  DATETIME,
  PRIMARY KEY (ID)
)
  ENGINE=InnoDB
  DEFAULT CHARSET=utf8;