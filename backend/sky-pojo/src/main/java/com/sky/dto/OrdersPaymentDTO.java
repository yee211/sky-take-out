package com.sky.dto;

import java.io.Serializable;

public class OrdersPaymentDTO implements Serializable {

    private String orderNumber;
    private Integer payMethod;

    public OrdersPaymentDTO() {
    }

    public OrdersPaymentDTO(String orderNumber, Integer payMethod) {
        this.orderNumber = orderNumber;
        this.payMethod = payMethod;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }
}
