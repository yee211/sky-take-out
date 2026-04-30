package com.sky.vo;

import java.io.Serializable;

public class OrderStatisticsVO implements Serializable {

    private Integer toBeConfirmed;
    private Integer confirmed;
    private Integer deliveryInProgress;

    public OrderStatisticsVO() {
    }

    public OrderStatisticsVO(Integer toBeConfirmed, Integer confirmed, Integer deliveryInProgress) {
        this.toBeConfirmed = toBeConfirmed;
        this.confirmed = confirmed;
        this.deliveryInProgress = deliveryInProgress;
    }

    public Integer getToBeConfirmed() {
        return toBeConfirmed;
    }

    public void setToBeConfirmed(Integer toBeConfirmed) {
        this.toBeConfirmed = toBeConfirmed;
    }

    public Integer getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Integer confirmed) {
        this.confirmed = confirmed;
    }

    public Integer getDeliveryInProgress() {
        return deliveryInProgress;
    }

    public void setDeliveryInProgress(Integer deliveryInProgress) {
        this.deliveryInProgress = deliveryInProgress;
    }
}
