package org.cospessardegna.giornaliera.Entities;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;

import java.time.LocalDateTime;

@Entity
@Table(name = "cost_center")
public class CostCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cost_center_name", length = 100)
    private String name;

    @Column(name = "desc", length = 500)
    private String description;

    private Integer max_hours;

    @Column(name = "max_budg")
    private Double max_budget;

    private LocalDateTime expiration_date;

    private LocalDateTime creation_date;
    @Column(name = "status_id", nullable = false)
    private Integer status_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_status", nullable = false)
    private CostCenterStatus status;


}

//-- giornaliera.cost_center definition
//
//CREATE TABLE `cost_center` (
//  `cost_id` int NOT NULL AUTO_INCREMENT,
//  `cost_center_name` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
//  `desc` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
//  `status_id` int DEFAULT NULL,
//  `max_hours` int DEFAULT NULL,
//  `max_budg` float DEFAULT NULL,
//  `expiration_date` date DEFAULT NULL,
//  `creation_date` date DEFAULT NULL,
//  PRIMARY KEY (`cost_id`),
//  KEY `cost_center_cost_center_status_fk` (`status_id`),
//  CONSTRAINT `cost_center_cost_center_status_fk` FOREIGN KEY (`status_id`) REFERENCES `cost_center_status` (`statuscc_id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

