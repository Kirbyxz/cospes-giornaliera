package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "activity_type")
public class ActivityType {

    @Id
    @Column(name = "act_id")
    private Integer id;

    @Column(name = "desc", length = 100)
    private String description;
}
