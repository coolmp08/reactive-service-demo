package io.devsense.reactive_service_demo;

import io.devsense.reactive_service_demo.entity.GreetingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;


@Configuration(proxyBeanMethods = false)
public class GreetingRouter {

    @Bean
    RouterFunction<ServerResponse> route(GreetingHandler handler){

        return RouterFunctions.route(GET("/hello").and(accept(MediaType.APPLICATION_JSON)), handler::hello);
    }
}
