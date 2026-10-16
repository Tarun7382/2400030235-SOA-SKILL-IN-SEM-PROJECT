package com.klu.controller;

import com.klu.model.Order;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public String createOrder(@Valid @RequestBody Order order) {
        return "Order created successfully!";
    }
}