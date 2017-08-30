package com.mca.security.configurer.http;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;

public class SecondHttpSecurityConfigurer
        extends AbstractHttpConfigurer<SecondHttpSecurityConfigurer, HttpSecurity> {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .anonymous().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
