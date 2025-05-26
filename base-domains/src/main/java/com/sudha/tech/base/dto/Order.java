package com.sudha.tech.base.dto;

import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String orderName;
    private String qty;
    private double price;
}
