package com.sky.dto;

import java.io.Serializable;

public class OrdersRejectionDTO implements Serializable {

    private Long id;
    private String rejectionReason;

    public OrdersRejectionDTO() {
    }

    public OrdersRejectionDTO(Long id, String rejectionReason) {
        this.id = id;
        this.rejectionReason = rejectionReason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
}
