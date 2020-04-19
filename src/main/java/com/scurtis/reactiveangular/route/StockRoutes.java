package com.scurtis.reactiveangular.route;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Author: Steve Curtis
 * Date: Apr 19, 2020
 **/

@Configuration
@RequiredArgsConstructor
public class StockRoutes {

    private final StockHandler stockHandler;

    @Bean
    RouterFunction<ServerResponse> stockList() {
        return RouterFunctions.route(RequestPredicates.GET("/stock/list"), stockHandler);
    }


}
