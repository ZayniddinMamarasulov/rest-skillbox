package com.example.rest.rest.web.model;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

    private Long id;

    private String product;

    private BigDecimal cost;
}
