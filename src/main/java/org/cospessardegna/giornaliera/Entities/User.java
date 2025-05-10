package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", length = 100)
    private String firstname;

    @Column(name = "last_name", length = 100)
    private String lastname;

    @Column(name = "fiscal_code", length = 16, nullable = false)
    private String fiscalcode;

    @Column(name = "email_address", length = 100, nullable = false)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phone;

    @Column(name = "role_id")
    private Integer roleid;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "privacy_consent")
    private boolean privacyConsent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="role_id",insertable = false,updatable = false)
    private Role role;


}
//-- giornaliera.`user` definition
//
//CREATE TABLE `user` (
//  `id` int NOT NULL AUTO_INCREMENT,
//  `first_name` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
//  `last_name` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL,
//  `fiscal_code` varchar(16) COLLATE utf8mb4_general_ci NOT NULL,
//  `email_address` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
//  `phone_number` int DEFAULT NULL,
//  `role_id` int DEFAULT NULL,
//  `status` binary(1) NOT NULL DEFAULT '0',
//  `privacy_consent` binary(1) DEFAULT NULL,
//  PRIMARY KEY (`id`),
//  KEY `users_roles_FK` (`role_id`),
//  CONSTRAINT `users_roles_FK` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
//) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;