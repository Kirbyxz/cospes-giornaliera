package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.id.IntegralDataTypeHolder;

@Entity
@Table(name = "autorization_role")
@IdClass(AutorizationRoleId.class)
public class AutorizationRole {

    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Id
    @Column(name = "app_entity_id", nullable = false)
    private Integer appEntityId;

    @Id
    @Column(name = "permission_id", nullable = false)
    private Integer pemissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_entity_id", nullable = false)
    private ApplicationEntity appEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role roleid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", nullable = false)
    private Permission permissionId;


}
