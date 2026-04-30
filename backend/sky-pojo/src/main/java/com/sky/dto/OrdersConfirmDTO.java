package com.sky.dto;

import java.io.Serializable;

public class OrdersConfirmDTO implements Serializable {

    private Long id;
    private Integer status;

    public OrdersConfirmDTO() {
    }

    public OrdersConfirmDTO(Long id, Integer status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
