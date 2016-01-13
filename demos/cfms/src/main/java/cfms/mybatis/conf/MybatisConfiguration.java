package cfms.mybatis.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 如果直接使用mybatis-spring-boot-starter 则不需要此文件
 * link:Spring Boot 集成MyBatis http://blog.csdn.net/isea533/article/details/50359390
 * Created by longzhiyou on 2016-01-12.
 */
//@Configuration
//@EnableTransactionManagement
public class MybatisConfiguration implements EnvironmentAware {
    private static Logger logger = LoggerFactory.getLogger(MybatisConfiguration.class);
    private RelaxedPropertyResolver propertyResolver;

    @Resource(name="dataSource")
    private DataSource mybatisDataSource;

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment,"mybatis.");

//        System.out.println( propertyResolver.getProperty("configLocation"));
//        System.out.println( propertyResolver.getProperty("typeAliasesPackage"));
//        System.out.println( propertyResolver.getProperty("mapperLocations"));

    }

    @Bean
    @ConditionalOnMissingBean
    public SqlSessionFactory sqlSessionFactory() {
        try {
            SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(mybatisDataSource);
            sessionFactory.setTypeAliasesPackage(propertyResolver.getProperty("typeAliasesPackage"));
            sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources(propertyResolver.getProperty("mapperLocations")));
            sessionFactory.setConfigLocation(new DefaultResourceLoader()
                    .getResource(propertyResolver.getProperty("configLocation")));

            return sessionFactory.getObject();
        } catch (Exception e) {
            logger.warn("Could not confiure mybatis session factory");
            return null;
        }
    }



}
