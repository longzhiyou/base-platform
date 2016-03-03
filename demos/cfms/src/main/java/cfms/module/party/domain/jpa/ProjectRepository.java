package cfms.module.party.domain.jpa;

import cfms.module.party.domain.jpa.entity.ProjectEntity;
//import org.springframework.transaction.annotation.Transactional;

//@Transactional(readOnly = true)
public interface ProjectRepository extends JpaNestedSet<ProjectEntity, Integer> {


}
