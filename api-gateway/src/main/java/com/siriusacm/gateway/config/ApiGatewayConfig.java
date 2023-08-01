package com.siriusacm.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

  @Bean
  public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {

    return builder.routes()
        .route(p -> p
            .path("/get")
            .uri("http://httpbin.org"))
        .route(p -> p.path("/mails/**")
            .uri("lb://mail-services"))
        .build();
  }
}
