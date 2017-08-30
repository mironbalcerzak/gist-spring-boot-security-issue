package com.mca.security;

import com.mca.security.configurer.auth.FirstAuthenticationManagerConfigurer;
import com.mca.security.configurer.auth.SecondAuthenticationManagerConfigurer;
import com.mca.security.configurer.http.FirstHttpSecurityConfigurer;
import com.mca.security.configurer.http.SecondHttpSecurityConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DefaultWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    private FirstHttpSecurityConfigurer firstHttpSecurityConfigurer = new FirstHttpSecurityConfigurer();
    private SecondHttpSecurityConfigurer secondHttpSecurityConfigurer = new SecondHttpSecurityConfigurer();

    private FirstAuthenticationManagerConfigurer firstAuthenticationManagerConfigurer = new FirstAuthenticationManagerConfigurer();
    private SecondAuthenticationManagerConfigurer secondAuthenticationManagerConfigurer = new SecondAuthenticationManagerConfigurer();

    protected void configure(HttpSecurity http) throws Exception {
        http.apply(firstHttpSecurityConfigurer).and()
                .apply(secondHttpSecurityConfigurer);
    }

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.apply(firstAuthenticationManagerConfigurer).and()
                .apply(secondAuthenticationManagerConfigurer);
    }

}
