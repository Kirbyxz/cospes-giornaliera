package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;

import java.time.LocalDateTime;

@Entity
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "desc", nullable = false, length = 500)
    private String description;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "date_time_end", nullable = false)
    private LocalDateTime dateTimeEnd;

    @Column(name = "read_only")
    private boolean redOnly;


    //Foreign Key
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cost_center_id", nullable = false)
    private CostCenter CostCenterid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false)
    private ActivityStatus statusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false)
    private ActivityType type;
}
