package cfms;

import cfms.mybatis.domin.UserDomin;
import cfms.service.impl.NestSetServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/** 
* CfmsApplication Tester. 
* Spring Boot Junit单元测试 http://blog.csdn.net/catoop/article/details/50752964
* @author lzy
* @since <pre>2016-01-12</pre>
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class RepositoryTest {


    @Autowired
    UserRepository userRepository;

    @Autowired
    NestSetServiceImpl nestSetService;

    @Autowired
    UserDomin userDomin;


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}


    @Test
    public void testJpaRepository() throws Exception {


//        List<ProjectEntity> projectEntityList = projectRepository.getSubTree(2);
//
//        System.out.println("-------------test------:" + projectEntityList.size());

//        UserEntity user = userRepository.getByName("admin");
//        assertEquals("admin",user.getUsername());


//        long count = userRepository.count();
//
//        assertEquals(1,count);

    }

    @Test
    public void testMybatis() throws Exception {
        long count = userDomin.getCount();

        assertEquals(1,count);

    }


} 
