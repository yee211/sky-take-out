package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class OrderOverViewVO implements Serializable {

    private Integer waitingOrders;
    private Integer deliveredOrders;
    private Integer completedOrders;
    private Integer cancelledOrders;
    private Integer allOrders;

    public OrderOverViewVO() {
    }

    public OrderOverViewVO(Integer waitingOrders, Integer deliveredOrders, Integer completedOrders, Integer cancelledOrders, Integer allOrders) {
        this.waitingOrders = waitingOrders;
        this.deliveredOrders = deliveredOrders;
        this.completedOrders = completedOrders;
        this.cancelledOrders = cancelledOrders;
        this.allOrders = allOrders;
    }

    public Integer getWaitingOrders() {
        return waitingOrders;
    }

    public void setWaitingOrders(Integer waitingOrders) {
        this.waitingOrders = waitingOrders;
    }

    public Integer getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(Integer deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }

    public Integer getCompletedOrders() {
        return completedOrders;
    }

    public void setCompletedOrders(Integer completedOrders) {
        this.completedOrders = completedOrders;
    }

    public Integer getCancelledOrders() {
        return cancelledOrders;
    }

    public void setCancelledOrders(Integer cancelledOrders) {
        this.cancelledOrders = cancelledOrders;
    }

    public Integer getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(Integer allOrders) {
        this.allOrders = allOrders;
    }
}
