package com.mca.security.configurer.http;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class FirstHttpSecurityConfigurer
        extends AbstractHttpConfigurer<FirstHttpSecurityConfigurer, HttpSecurity> {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic();
    }
}
