package com.mca.security;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import({
        DefaultWebSecurityConfigurerAdapter.class,
})
public class ApplicationBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationBootstrap.class).run(args);
    }


}

