package com.scurtis.reactiveangular.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Steve Curtis
 * Date: Apr 19, 2020
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private String symbol;
    private String name;
    private String description;
}
