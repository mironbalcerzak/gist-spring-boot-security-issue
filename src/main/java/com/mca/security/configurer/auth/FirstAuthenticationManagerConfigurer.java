package com.mca.security.configurer.auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

public class FirstAuthenticationManagerConfigurer
        extends SecurityConfigurerAdapter<AuthenticationManager, AuthenticationManagerBuilder> {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user1").password("password").roles("SYSTEM");
    }
}
