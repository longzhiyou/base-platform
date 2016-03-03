package cfms.module.party.domain.jpa;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by longzhiyou on 2016-03-03.
 */
public class NestSetRepositoryCustomImpl<T>  implements NestSetRepositoryCustom<T> {

    @Autowired
    JpaNestedSet<T,Long>  jpaNestedSet;

    public  void saveNestSet(T node){

    }

}
