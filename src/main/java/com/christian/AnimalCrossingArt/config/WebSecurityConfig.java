package com.christian.AnimalCrossingArt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
   /*     http.requiresChannel()
                .requestMatchers(r -> r.getHeader("X-Forwarded-Proto") != null)
                .requiresSecure();*/
        http.authorizeRequests()
                .antMatchers("/").anonymous()
                .antMatchers("/list").anonymous()
                .antMatchers("/search").anonymous()
                .antMatchers("/hello").anonymous()
                .anyRequest().authenticated();
    }
}
