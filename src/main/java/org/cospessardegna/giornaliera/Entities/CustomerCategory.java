package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Locale;

@Entity
@Table(name="customer_category")
public class CustomerCategory {

    @Id
    @Column(name="id")
    private Integer Id;

    @Column(name="desc", length = 100)
    private String description;


}
//-- giornaliera.customer_category definition
//
//CREATE TABLE `customer_category` (
//  `id` int NOT NULL,
//  `desc` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
//  PRIMARY KEY (`id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;