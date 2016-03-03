package cfms.module.party.domain.jpa;

import cfms.module.party.domain.jpa.entity.ProjectsEntity;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.transaction.annotation.Transactional;

//@Transactional(readOnly = true)
public interface ProjectsRepository extends JpaNestedSet<ProjectsEntity, Integer>,ProjectsRepositoryCustom {

}
