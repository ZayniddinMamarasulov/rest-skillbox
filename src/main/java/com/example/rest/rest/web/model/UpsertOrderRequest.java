package com.example.rest.rest.web.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpsertOrderRequest {


    @NotNull(message = "Client id is required")
    @Positive(message = "Client id must be >0")
    private Long clientId;

    @NotBlank(message = "product name is required")
    private String product;

    @NotNull(message = "cost is required")
    @Positive(message = "cost is more than zero")
    private BigDecimal cost;
}
