package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Table(name="shift")
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="start_date_time")
    private LocalDateTime start;

    @Column(name="end_date_time")
    private LocalDateTime end;

}
//-- giornaliera.shift definition
//
//CREATE TABLE `shift` (
//  `id` int NOT NULL AUTO_INCREMENT,
//  `start_date_time` datetime NOT NULL,
//  `end_date_time` datetime NOT NULL,
//  PRIMARY KEY (`id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
