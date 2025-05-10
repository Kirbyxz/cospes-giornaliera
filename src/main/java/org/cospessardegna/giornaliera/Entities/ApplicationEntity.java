package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "app_entity")
public class ApplicationEntity {

    @Id
    @Column(name = "app_id")
    private Integer id;

    @Column(name = "desc", length = 100)
    private String description;
}
