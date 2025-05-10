package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @Column(name = "perm_id")
    private Integer id;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "description", nullable = false, length = 100)
    private Integer code;


}
//-- giornaliera.permission definition
//
//CREATE TABLE `permission` (
//  `perm_id` int NOT NULL ,
//  `description` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
//  `code` int DEFAULT NULL,
//  PRIMARY KEY (`perm_id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;