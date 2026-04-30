package com.sky.dto;

import java.io.Serializable;

public class OrdersCancelDTO implements Serializable {

    private Long id;
    private String cancelReason;

    public OrdersCancelDTO() {
    }

    public OrdersCancelDTO(Long id, String cancelReason) {
        this.id = id;
        this.cancelReason = cancelReason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
}
