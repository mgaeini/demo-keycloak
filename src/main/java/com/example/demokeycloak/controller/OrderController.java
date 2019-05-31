package com.example.demokeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {


    @GetMapping(path = "/orders")
    public List<String> getOrders(){
        return Arrays.asList("order-11", "order-2");
    }

}
