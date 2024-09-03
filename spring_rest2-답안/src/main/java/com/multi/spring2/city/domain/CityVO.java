package com.multi.spring2.city.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityVO {
        private int id;
        private String name;
        private String countryCode;
        private String district;
        private int population;
}

/*
use shop2;

CREATE TABLE `city` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` char(35) NOT NULL DEFAULT '',
  `CountryCode` char(3) NOT NULL DEFAULT '',
  `District` char(20) NOT NULL DEFAULT '',
  `Population` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
);

INSERT INTO `city` (`Name`, `CountryCode`, `District`, `Population`) VALUES
('New York', 'USA', 'New York', 8419000),
('Los Angeles', 'USA', 'California', 3980400),
('Chicago', 'USA', 'Illinois', 2716000),
('Houston', 'USA', 'Texas', 2328000),
('Phoenix', 'USA', 'Arizona', 1690000),
('Philadelphia', 'USA', 'Pennsylvania', 1584200),
('San Antonio', 'USA', 'Texas', 1547200),
('San Diego', 'USA', 'California', 1423600),
('Dallas', 'USA', 'Texas', 1356000),
('San Jose', 'USA', 'California', 1035300);
 */