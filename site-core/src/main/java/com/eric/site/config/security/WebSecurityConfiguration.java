package com.eric.site.config.security;

import com.eric.site.core.security.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Eric
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    UserDetailsService userService() {
        return new CustomUserService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //解决不允许显示在iframe的问题
        http.headers().frameOptions().disable();

        http
                .authorizeRequests()
                .antMatchers("/static/**", "/favicon.ico", "/", "/index").permitAll()
//                .anyRequest().authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .defaultSuccessUrl("/index")
                .failureUrl("/login")
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();

        http.sessionManagement().invalidSessionUrl("/login");
        http.sessionManagement().maximumSessions(1).expiredUrl("/login");
    }
}
