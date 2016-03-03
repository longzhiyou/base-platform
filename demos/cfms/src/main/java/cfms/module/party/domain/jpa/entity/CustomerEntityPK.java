package cfms.module.party.domain.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by longzhiyou on 2016-02-25.
 */
public class CustomerEntityPK implements Serializable {
    private Long partyId;
    private Long roleTypeId;

    @Column(name = "party_id", nullable = false, insertable = true, updatable = true)
    @Id
    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    @Column(name = "role_type_id", nullable = false, insertable = true, updatable = true)
    @Id
    public Long getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(Long roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntityPK that = (CustomerEntityPK) o;

        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;
        if (roleTypeId != null ? !roleTypeId.equals(that.roleTypeId) : that.roleTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partyId != null ? partyId.hashCode() : 0;
        result = 31 * result + (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return result;
    }
}
