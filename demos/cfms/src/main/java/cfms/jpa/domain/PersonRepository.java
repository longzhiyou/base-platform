package cfms.jpa.domain;

import cfms.jpa.domain.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, String> {



}
