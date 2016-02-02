package cfms.module.party.controler;

import cfms.module.party.domain.jpa.PersonRepository;
import cfms.module.party.domain.jpa.entity.PersonEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 当事人控制器
 * Created by longzhiyou on 2016-02-01.
 */
@RestController
public class PersonController {

    private static Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private  PersonRepository personRepository=null;


    @RequestMapping(value="/party/people", method= RequestMethod.GET)
    public @ResponseBody List<PersonEntity> people(){

        List<PersonEntity> personEntities = (List<PersonEntity>) personRepository.findAll();
        return personEntities;

    }

}
