package cfms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 *
 * Created by longzhiyou on 2015-08-24.
 */
@Configuration
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Autowired
    private LoginFailureHandler loginFailureHandler;
    @Autowired
    private LoginSuccessHandler loginSuccessHandler;
    @Autowired
    private CustomAuthenticationEntryPoint customAuthenticationEntryPoint;


    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("USER", "ADMIN", "READER", "WRITER")
                .and()
                .withUser("audit").password("audit").roles("USER", "ADMIN", "READER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.exceptionHandling().authenticationEntryPoint(customAuthenticationEntryPoint);

        http.authorizeRequests()
                .antMatchers("/index.html", "/", "/app/**").permitAll()
                .antMatchers(HttpMethod.OPTIONS, "/login").permitAll()
                .anyRequest().authenticated()
                .and()
//                .formLogin().loginPage("/").loginProcessingUrl("/login")
                .formLogin()
//                .loginProcessingUrl("/login")//Not necesary because is the default
                .successHandler(loginSuccessHandler)
                .failureHandler(loginFailureHandler)
//                .and().addFilterBefore(new CorsFilter(),UsernamePasswordAuthenticationFilter.class)

        ;
    }


}
