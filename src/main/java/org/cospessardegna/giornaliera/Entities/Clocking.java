package org.cospessardegna.giornaliera.Entities;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDateTime;

@Entity
@Table(name = "clocking")
public class Clocking {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "direction", nullable = false, length = 1)
    private Character direction;

    @Column(name = "clocking_time")
    private LocalDateTime clocking_time;

    @Column(name = "user_id")
    private Integer userId;


}
