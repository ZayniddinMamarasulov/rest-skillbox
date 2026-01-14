package com.example.rest.rest.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private Long id;
    private String name;
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    private void removeOrder(Long id) {
        orders = orders.stream().filter(order -> !order.getId().equals(id)).collect(Collectors.toList());
    }
}
