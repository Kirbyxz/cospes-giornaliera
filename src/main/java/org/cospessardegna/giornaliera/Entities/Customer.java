package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_id")
    private Integer category_id;

    @Column(length = 100, nullable = false)
    private String business_name;

    @Column(length = 16, nullable = false)
    private String fiscal_code;

    @Column(length = 20, nullable = false)   //TODO Modificare in Nullable su DB
    private String vat_code;

    @Column(name = "status")
    private boolean status; //TODO controllare se va bene lo stato boolean

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer_Category", nullable = false)
    private CustomerCategory category;

}
//-- giornaliera.customer definition
//
//CREATE TABLE `customer` (
//  `id` int NOT NULL AUTO_INCREMENT,
//  `category_id` int DEFAULT NULL,
//  `business_name` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
//  `fiscal_code` varchar(16) COLLATE utf8mb4_general_ci NOT NULL,
//  `vat_code` varchar(20) COLLATE utf8mb4_general_ci NOT NULL,
//  `status` binary(1) NOT NULL,
//  PRIMARY KEY (`id`),
//  KEY `customer_customer_category_fk` (`category_id`),
//  CONSTRAINT `customer_customer_category_fk` FOREIGN KEY (`category_id`) REFERENCES `customer_category` (`id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;