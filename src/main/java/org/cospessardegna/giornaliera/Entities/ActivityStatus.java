package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "activity_status")
public class ActivityStatus {

    @Id
    @Column(name = "statid")
    private Integer id;

    @Column(name = "desc", length = 100)
    private String description;
}