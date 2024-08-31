package com.multi.spring2.tour.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TourVO {
        private String destination;
        private int duration; // in days
        private double price;
}

/*
use shop2;
CREATE TABLE Tour (
    id INT AUTO_INCREMENT PRIMARY KEY,
    destination VARCHAR(255) NOT NULL,
    duration INT NOT NULL,
    price DOUBLE NOT NULL
);

INSERT INTO Tour (destination, duration, price) VALUES
('Paris', 5, 1200.0),
('New York', 7, 1500.0),
('Tokyo', 10, 2000.0),
('London', 4, 1100.0),
('Sydney', 8, 1800.0),
('Rome', 6, 1300.0),
('Berlin', 5, 1150.0),
('Dubai', 7, 1600.0),
('Hong Kong', 9, 1750.0),
('Amsterdam', 5, 1250.0);

select * from tour;
 */