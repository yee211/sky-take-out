package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class BusinessDataVO implements Serializable {

    private Double turnover;
    private Integer validOrderCount;
    private Double orderCompletionRate;
    private Double unitPrice;
    private Integer newUsers;

    public BusinessDataVO() {
    }

    public BusinessDataVO(Double turnover, Integer validOrderCount, Double orderCompletionRate, Double unitPrice, Integer newUsers) {
        this.turnover = turnover;
        this.validOrderCount = validOrderCount;
        this.orderCompletionRate = orderCompletionRate;
        this.unitPrice = unitPrice;
        this.newUsers = newUsers;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Integer getValidOrderCount() {
        return validOrderCount;
    }

    public void setValidOrderCount(Integer validOrderCount) {
        this.validOrderCount = validOrderCount;
    }

    public Double getOrderCompletionRate() {
        return orderCompletionRate;
    }

    public void setOrderCompletionRate(Double orderCompletionRate) {
        this.orderCompletionRate = orderCompletionRate;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getNewUsers() {
        return newUsers;
    }

    public void setNewUsers(Integer newUsers) {
        this.newUsers = newUsers;
    }
}
