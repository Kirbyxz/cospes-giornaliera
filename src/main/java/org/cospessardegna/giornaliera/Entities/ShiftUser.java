package org.cospessardegna.giornaliera.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "shift_user")
@IdClass(ShiftUserId.class)
public class ShiftUser {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shift_id", nullable = false)
    private Shift shift;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}