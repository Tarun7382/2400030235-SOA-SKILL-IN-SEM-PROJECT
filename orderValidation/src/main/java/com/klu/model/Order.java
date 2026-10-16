package com.klu.model;

import jakarta.validation.constraints.*;

public class Order {

    @NotBlank
    private String customerName;

    @NotBlank
    private String productName;

    @NotNull
    @Positive
    private Integer quantity;

    @NotNull
    @Positive
    private Double price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}