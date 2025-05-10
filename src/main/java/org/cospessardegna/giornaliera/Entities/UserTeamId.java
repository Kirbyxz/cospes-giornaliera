package org.cospessardegna.giornaliera.Entities;

import java.io.Serializable;
import java.util.Objects;

public class UserTeamId implements Serializable {

    private Integer user;
    private Integer team;

    public UserTeamId() {}

    public UserTeamId(Integer user, Integer team) {
        this.user = user;
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserTeamId)) return false;
        UserTeamId that = (UserTeamId) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, team);
    }
}