package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class OrderReportVO implements Serializable {

    private String dateList;
    private String orderCountList;
    private String validOrderCountList;
    private Integer totalOrderCount;
    private Integer validOrderCount;
    private Double orderCompletionRate;

    public OrderReportVO() {
    }

    public OrderReportVO(String dateList, String orderCountList, String validOrderCountList, Integer totalOrderCount, Integer validOrderCount, Double orderCompletionRate) {
        this.dateList = dateList;
        this.orderCountList = orderCountList;
        this.validOrderCountList = validOrderCountList;
        this.totalOrderCount = totalOrderCount;
        this.validOrderCount = validOrderCount;
        this.orderCompletionRate = orderCompletionRate;
    }

    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public String getOrderCountList() {
        return orderCountList;
    }

    public void setOrderCountList(String orderCountList) {
        this.orderCountList = orderCountList;
    }

    public String getValidOrderCountList() {
        return validOrderCountList;
    }

    public void setValidOrderCountList(String validOrderCountList) {
        this.validOrderCountList = validOrderCountList;
    }

    public Integer getTotalOrderCount() {
        return totalOrderCount;
    }

    public void setTotalOrderCount(Integer totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
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
}
