package cfms;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * User: longzhiyou
 * Date: 2016-06-07
 * Time: 17:31
 */
@Component
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/login")
//                .allowedOrigins("*")
//                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept")
//                .allowedMethods("POST", "OPTIONS")
//                .allowCredentials(true).maxAge(3600);
    }
}
