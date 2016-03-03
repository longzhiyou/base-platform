package cfms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {

    @Query("select u from UserEntity u where u.username = ?1")
    UserEntity getByName(String username);
}
