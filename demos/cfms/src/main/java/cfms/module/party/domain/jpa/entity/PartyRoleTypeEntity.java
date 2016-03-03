package cfms.module.party.domain.jpa.entity;

import javax.persistence.*;

/**
 * Created by longzhiyou on 2016-02-25.
 */
@Entity
@Table(name = "party_role_type", schema = "", catalog = "cfms")
public class PartyRoleTypeEntity {
    private Long roleTypeId;
    private String description;

    @Id
    @Column(name = "role_type_id", nullable = false, insertable = true, updatable = true)
    public Long getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(Long roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartyRoleTypeEntity that = (PartyRoleTypeEntity) o;

        if (roleTypeId != null ? !roleTypeId.equals(that.roleTypeId) : that.roleTypeId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleTypeId != null ? roleTypeId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
