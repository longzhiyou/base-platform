package cfms.module.party.domain.jpa;

import cfms.module.party.domain.jpa.entity.ProjectsEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Soundbank;

/**
 *
 * Created by longzhiyou on 2016-03-03.
 */
public class ProjectsRepositoryImpl implements ProjectsRepositoryCustom {

    @Autowired
    ProjectsRepository  projectsRepository;

    @Override
    public void saveNode(ProjectsEntity parent,ProjectsEntity node) {

        Integer rgt = parent.getRgt();
        Integer lft = parent.getLft();
        projectsRepository.updateRightValue(rgt);
        projectsRepository.updateLeftValue(rgt);

        node.setLft(lft+1);
        node.setRgt(lft+2);

        projectsRepository.save(node);

        System.out.println("saveNode");
    }
}
