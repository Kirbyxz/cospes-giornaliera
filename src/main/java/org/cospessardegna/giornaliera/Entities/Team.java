package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Team")
public class Team {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "desc", length = 100)
    private String description;

}
//-- giornaliera.team definition
//
//CREATE TABLE `team` (
//  `id` int NOT NULL AUTO_INCREMENT,
//  `desc` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
//  PRIMARY KEY (`id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;