package com.scurtis.reactiveangular.route;

import com.scurtis.reactiveangular.model.Stock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Steve Curtis
 * Date: Apr 19, 2020
 **/

@Slf4j
public class StockHandler implements HandlerFunction<ServerResponse> {

    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        List<Stock> stocks = new ArrayList<>();
        Stock stock = new Stock("AAPL", "Apple", "Apple Incorporated");
        stocks.add(stock);
        stock = new Stock("COST", "Costco", "Costco Incorporated");
        stocks.add(stock);
        stock = new Stock("MA", "Mastercard", "Mastercard Incorporated");
        stocks.add(stock);
        stock = new Stock("ZNGA", "Zinga", "Zinga Incorporated");
        stocks.add(stock);
        return ServerResponse.ok()
                .bodyValue(stocks);
    }
}
