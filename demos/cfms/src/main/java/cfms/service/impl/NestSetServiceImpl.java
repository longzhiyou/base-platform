package cfms.service.impl;

import cfms.module.party.domain.jpa.ProjectRepository;
import cfms.module.party.domain.jpa.ProjectsRepository;
import cfms.module.party.domain.jpa.entity.ProjectEntity;
import cfms.module.party.domain.jpa.entity.ProjectsEntity;
import cfms.service.NestSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * Created by longzhiyou on 2016-03-02.
 */
@Service
public class NestSetServiceImpl implements NestSetService {

    @Autowired
    private ProjectsRepository projectsRepository;

    @Override
    public void addNode() {

        /**
         *1.查找父节点
         * 2.左右节点+2
         * 3.新节点的lft=parent.rgt+1 node.rgt=parent.rgt+2
         * [2016-03-03 add by longzhiyou]
         */

        ProjectsEntity parent =  projectsRepository.findOne(18);

        ProjectsEntity node = new  ProjectsEntity();
        node.setName("new third");
        node.setParentId(parent.getId());
        node.setIsPublic((byte)1);
        node.setInheritMembers((byte)0);
        node.setStatus(1);

        projectsRepository.saveNode(parent,node);
//        projectRepository.save(node);

//        projectEntity.setName(projectEntity.getName()+"change");
//        projectRepository.save(projectEntity);

//        int ret = projectRepository.updateRightValue(5);
        System.out.println("-------------updateNode------:" + 1);
    }
}
