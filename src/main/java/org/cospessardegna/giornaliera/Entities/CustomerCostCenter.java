package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="customer_cost_center")
@IdClass(CustomerCostCenterId.class)
public class CustomerCostCenter {

    @Id
    @Column(name="cost_center_id")
    private Integer CostCenterid;

    @Column(name="customer_id")
    private Integer customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cost_center_id",insertable = false,updatable = false)
    private CostCenter costCenter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id",insertable = false,updatable = false)
    private Customer customer;

}
