package cfms.jpa.domain.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by longzhiyou on 2016-01-29.
 */
@Entity
@Table(name = "person", schema = "", catalog = "spring_security")
public class PersonEntity {
    private Integer partyId;
    private String name;
    private String gender;
    private Date birthDate;
    private Integer height;
    private Integer weight;
    private Integer socialSecurityNumber;
    private Integer currentPassportNumber;
    private Date currentPassportExpireDate;
    private Integer totalYearsWorkExperience;
    private String comments;

    @Id
    @Column(name = "PARTY_ID", nullable = false, insertable = true, updatable = true, precision = 0)
    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, insertable = true, updatable = true, length = 1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "BIRTH_DATE", nullable = true, insertable = true, updatable = true)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "HEIGHT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Basic
    @Column(name = "WEIGHT", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "SOCIAL_SECURITY_NUMBER", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Basic
    @Column(name = "CURRENT_PASSPORT_NUMBER", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getCurrentPassportNumber() {
        return currentPassportNumber;
    }

    public void setCurrentPassportNumber(Integer currentPassportNumber) {
        this.currentPassportNumber = currentPassportNumber;
    }

    @Basic
    @Column(name = "CURRENT_PASSPORT_EXPIRE_DATE", nullable = true, insertable = true, updatable = true)
    public Date getCurrentPassportExpireDate() {
        return currentPassportExpireDate;
    }

    public void setCurrentPassportExpireDate(Date currentPassportExpireDate) {
        this.currentPassportExpireDate = currentPassportExpireDate;
    }

    @Basic
    @Column(name = "TOTAL_YEARS_WORK_EXPERIENCE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTotalYearsWorkExperience() {
        return totalYearsWorkExperience;
    }

    public void setTotalYearsWorkExperience(Integer totalYearsWorkExperience) {
        this.totalYearsWorkExperience = totalYearsWorkExperience;
    }

    @Basic
    @Column(name = "COMMENTS", nullable = true, insertable = true, updatable = true, length = 255)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (partyId != null ? !partyId.equals(that.partyId) : that.partyId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (socialSecurityNumber != null ? !socialSecurityNumber.equals(that.socialSecurityNumber) : that.socialSecurityNumber != null)
            return false;
        if (currentPassportNumber != null ? !currentPassportNumber.equals(that.currentPassportNumber) : that.currentPassportNumber != null)
            return false;
        if (currentPassportExpireDate != null ? !currentPassportExpireDate.equals(that.currentPassportExpireDate) : that.currentPassportExpireDate != null)
            return false;
        if (totalYearsWorkExperience != null ? !totalYearsWorkExperience.equals(that.totalYearsWorkExperience) : that.totalYearsWorkExperience != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partyId != null ? partyId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (socialSecurityNumber != null ? socialSecurityNumber.hashCode() : 0);
        result = 31 * result + (currentPassportNumber != null ? currentPassportNumber.hashCode() : 0);
        result = 31 * result + (currentPassportExpireDate != null ? currentPassportExpireDate.hashCode() : 0);
        result = 31 * result + (totalYearsWorkExperience != null ? totalYearsWorkExperience.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        return result;
    }
}
