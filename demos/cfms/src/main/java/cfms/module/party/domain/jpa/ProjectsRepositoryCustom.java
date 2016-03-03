package cfms.module.party.domain.jpa;

import cfms.module.party.domain.jpa.entity.ProjectsEntity;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by longzhiyou on 2016-03-03.
 */
public interface ProjectsRepositoryCustom {

    void saveNode(ProjectsEntity parent,ProjectsEntity node);
}
