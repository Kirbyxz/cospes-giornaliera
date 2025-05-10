package org.cospessardegna.giornaliera.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cost_center_status")
public class CostCenterStatus {

    //TODO: Modificare tutti i nomi brutti
    @Id
    @Column(name = "statuscc_id") //TODO: Rimuovere Autoincrement da DB
    private Integer id;

    @Column(name = "description", length = 100)
    private String description;
}
