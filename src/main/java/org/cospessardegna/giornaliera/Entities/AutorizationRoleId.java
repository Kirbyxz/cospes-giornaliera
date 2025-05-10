package org.cospessardegna.giornaliera.Entities;


import java.io.Serializable;
import java.util.Objects;

public class AutorizationRoleId implements Serializable {

    private Integer roleId;
    private Integer appEntityId;
    private Integer permissionId;

    public AutorizationRoleId() {
    }

    public AutorizationRoleId(Integer roleId, Integer appEntityId, Integer permissionId) {
        this.roleId = roleId;
        this.appEntityId = appEntityId;
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutorizationRoleId)) return false;

        AutorizationRoleId that = (AutorizationRoleId) o;

        return Objects.equals(roleId, that.roleId)
                &&
                Objects.equals(appEntityId, that.appEntityId)
                &&
                Objects.equals(permissionId, that.permissionId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, appEntityId, permissionId);
    }
}
