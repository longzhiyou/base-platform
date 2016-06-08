package com.lzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * Created by longzhiyou on 2015-08-24.
 */
@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("bill").password("abc123").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("root123").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("dba").password("root123").roles("ADMIN","DBA");

        }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.
                csrf().disable().
                sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).
                and().
                authorizeRequests().
                antMatchers("/index.html", "/", "/frontend/**").permitAll().
        // Allow anonymous logins
                antMatchers("/user/login").permitAll().
//                antMatchers(actuatorEndpoints()).hasRole(backendAdminRole).
                anyRequest().authenticated()
//                and().
//                anonymous().disable()
        ;


//        http.authorizeRequests()
//                .antMatchers("/index.html", "/", "/frontend/**").permitAll()
//                        // Allow anonymous resource requests
//                .antMatchers("/").permitAll()
//                .antMatchers("/favicon.ico").permitAll()
//                .antMatchers("/**/*.html").permitAll()
//                .antMatchers("/**/*.css").permitAll()
//                .antMatchers("/**/*.js").permitAll()
//
//                // Allow anonymous logins
//                .antMatchers("/user/login").permitAll()
//               .anyRequest().authenticated().and()
//                // Custom Token based authentication based on the header previously given to the client
//                .addFilterAfter(new JwtFilter(), UsernamePasswordAuthenticationFilter.class)
//                .csrf()
//                .csrfTokenRepository(csrfTokenRepository()).and()
//                .addFilterAfter(csrfHeaderFilter(), CsrfFilter.class);
    }

}
