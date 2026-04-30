package com.sky.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrdersSubmitDTO implements Serializable {

    private Long addressBookId;
    private int payMethod;
    private String remark;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime estimatedDeliveryTime;
    private Integer deliveryStatus;
    private Integer tablewareNumber;
    private Integer tablewareStatus;
    private Integer packAmount;
    private BigDecimal amount;

    public OrdersSubmitDTO() {
    }

    public OrdersSubmitDTO(Long addressBookId, int payMethod, String remark, LocalDateTime estimatedDeliveryTime, Integer deliveryStatus, Integer tablewareNumber, Integer tablewareStatus, Integer packAmount, BigDecimal amount) {
        this.addressBookId = addressBookId;
        this.payMethod = payMethod;
        this.remark = remark;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.deliveryStatus = deliveryStatus;
        this.tablewareNumber = tablewareNumber;
        this.tablewareStatus = tablewareStatus;
        this.packAmount = packAmount;
        this.amount = amount;
    }

    public Long getAddressBookId() {
        return addressBookId;
    }

    public void setAddressBookId(Long addressBookId) {
        this.addressBookId = addressBookId;
    }

    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(LocalDateTime estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Integer getTablewareNumber() {
        return tablewareNumber;
    }

    public void setTablewareNumber(Integer tablewareNumber) {
        this.tablewareNumber = tablewareNumber;
    }

    public Integer getTablewareStatus() {
        return tablewareStatus;
    }

    public void setTablewareStatus(Integer tablewareStatus) {
        this.tablewareStatus = tablewareStatus;
    }

    public Integer getPackAmount() {
        return packAmount;
    }

    public void setPackAmount(Integer packAmount) {
        this.packAmount = packAmount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
