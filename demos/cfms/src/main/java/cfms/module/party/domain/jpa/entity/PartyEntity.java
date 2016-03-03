package cfms.module.party.domain.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by longzhiyou on 2016-02-25.
 */
@Entity
@Table(name = "party", schema = "", catalog = "cfms")
public class PartyEntity {
    private Integer partyId;

    @Id
    @Column(name = "PARTY_ID", nullable = false, insertable = true, updatable = true, precision = 0)
    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartyEntity that = (PartyEntity) o;

        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return partyId != null ? partyId.hashCode() : 0;
    }
}
