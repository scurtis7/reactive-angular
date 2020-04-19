package com.scurtis.reactiveangular.config;

import com.scurtis.reactiveangular.route.StockHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Author: Steve Curtis
 * Date: Apr 17, 2020
 **/

@Configuration
public class AppConfiguration {

    @Bean
    public StockHandler stockHandler() {
        return new StockHandler();
    }

    @Bean
    public RouterFunction<ServerResponse> htmlRouter(@Value("classpath:/public/index.html") Resource html) {
        return route(GET("/"),
                request -> ok()
                        .contentType(MediaType.TEXT_HTML)
                        .bodyValue(html)
        );
    }


}
