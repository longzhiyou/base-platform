package cfms.module.party.domain.jpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by longzhiyou on 2016-03-02.
 */
@Entity
@Table(name = "projects", schema = "", catalog = "cfms")
public class ProjectsEntity {
    private Integer id;
    private String name;
    private String description;
    private String homepage;
    private Byte isPublic;
    private Integer parentId;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    private String identifier;
    private Integer status;
    private Integer lft;
    private Integer rgt;
    private Byte inheritMembers;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "homepage", nullable = true, insertable = true, updatable = true, length = 255)
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Basic
    @Column(name = "is_public", nullable = false, insertable = true, updatable = true)
    public Byte getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Byte isPublic) {
        this.isPublic = isPublic;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, insertable = true, updatable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "created_on", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "updated_on", nullable = true, insertable = true, updatable = true)
    public Timestamp getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Basic
    @Column(name = "identifier", nullable = true, insertable = true, updatable = true, length = 255)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "lft", nullable = true, insertable = true, updatable = true)
    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    @Basic
    @Column(name = "rgt", nullable = true, insertable = true, updatable = true)
    public Integer getRgt() {
        return rgt;
    }

    public void setRgt(Integer rgt) {
        this.rgt = rgt;
    }

    @Basic
    @Column(name = "inherit_members", nullable = false, insertable = true, updatable = true)
    public Byte getInheritMembers() {
        return inheritMembers;
    }

    public void setInheritMembers(Byte inheritMembers) {
        this.inheritMembers = inheritMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectsEntity that = (ProjectsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (homepage != null ? !homepage.equals(that.homepage) : that.homepage != null) return false;
        if (isPublic != null ? !isPublic.equals(that.isPublic) : that.isPublic != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (createdOn != null ? !createdOn.equals(that.createdOn) : that.createdOn != null) return false;
        if (updatedOn != null ? !updatedOn.equals(that.updatedOn) : that.updatedOn != null) return false;
        if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lft != null ? !lft.equals(that.lft) : that.lft != null) return false;
        if (rgt != null ? !rgt.equals(that.rgt) : that.rgt != null) return false;
        if (inheritMembers != null ? !inheritMembers.equals(that.inheritMembers) : that.inheritMembers != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
        result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (updatedOn != null ? updatedOn.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lft != null ? lft.hashCode() : 0);
        result = 31 * result + (rgt != null ? rgt.hashCode() : 0);
        result = 31 * result + (inheritMembers != null ? inheritMembers.hashCode() : 0);
        return result;
    }
}
