package com.demo.JAXRS.config;

import com.demo.JAXRS.controllers.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        return jerseyServlet;
    }
}
