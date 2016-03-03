package cfms.module.party.domain.jpa.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by longzhiyou on 2016-02-25.
 */
@Entity
@Table(name = "customer", schema = "", catalog = "cfms")
@IdClass(CustomerEntityPK.class)
public class CustomerEntity {
    private Long partyRoleId;
    private Date fromDate;
    private Date thruDate;
    private Long partyId;
    private Long roleTypeId;

    @Basic
    @Column(name = "party_role_id", nullable = true, insertable = true, updatable = true)
    public Long getPartyRoleId() {
        return partyRoleId;
    }

    public void setPartyRoleId(Long partyRoleId) {
        this.partyRoleId = partyRoleId;
    }

    @Basic
    @Column(name = "from_date", nullable = true, insertable = true, updatable = true)
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "thru_date", nullable = true, insertable = true, updatable = true)
    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    @Id
    @Column(name = "party_id", nullable = false, insertable = true, updatable = true)
    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    @Id
    @Column(name = "role_type_id", nullable = false, insertable = true, updatable = true)
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

        CustomerEntity that = (CustomerEntity) o;

        if (partyRoleId != null ? !partyRoleId.equals(that.partyRoleId) : that.partyRoleId != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (thruDate != null ? !thruDate.equals(that.thruDate) : that.thruDate != null) return false;
        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;
        if (roleTypeId != null ? !roleTypeId.equals(that.roleTypeId) : that.roleTypeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partyRoleId != null ? partyRoleId.hashCode() : 0;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (thruDate != null ? thruDate.hashCode() : 0);
        result = 31 * result + (partyId != null ? partyId.hashCode() : 0);
        result = 31 * result + (roleTypeId != null ? roleTypeId.hashCode() : 0);
        return result;
    }
}
