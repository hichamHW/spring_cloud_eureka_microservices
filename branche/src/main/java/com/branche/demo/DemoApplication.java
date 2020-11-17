package com.branche.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



    /// configuration statique
    @Bean
    RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return  routeLocatorBuilder.routes().route((r)->r.path("/products/**")
                .uri("http://localhost:8001"))
                .route((r)->r.path("/users/**")
                        .uri("http://localhost:8002"))
                .build();
    }
}
