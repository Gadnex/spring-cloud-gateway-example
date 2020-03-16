package net.binarypaper.gateway.service;

import java.util.List;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Autowired
    private RouteDefinitionLocator locator;

    @Bean
    public void apisDefinitions() {
        List<RouteDefinition> routeDefinitions = locator.getRouteDefinitions().collectList().block();
        routeDefinitions.stream()
                .filter(routeDefinition -> routeDefinition.getId().matches(".*-service"))
                .forEach(routeDefinition -> {
                    String name = routeDefinition.getId().replaceAll("-service", "");
                    GroupedOpenApi.builder()
                            .pathsToMatch("/" + name + "/**")
                            .setGroup(name)
                            .build();
                });
    }
}
