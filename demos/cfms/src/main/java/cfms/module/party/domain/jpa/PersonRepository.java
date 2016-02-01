package cfms.module.party.domain.jpa;

import cfms.module.party.domain.jpa.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, String> {

}
