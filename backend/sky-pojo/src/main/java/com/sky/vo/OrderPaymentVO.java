package com.sky.vo;

import java.io.Serializable;

public class OrderPaymentVO implements Serializable {

    private String nonceStr;
    private String paySign;
    private String timeStamp;
    private String signType;
    private String packageStr;

    public OrderPaymentVO() {
    }

    public OrderPaymentVO(String nonceStr, String paySign, String timeStamp, String signType, String packageStr) {
        this.nonceStr = nonceStr;
        this.paySign = paySign;
        this.timeStamp = timeStamp;
        this.signType = signType;
        this.packageStr = packageStr;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPackageStr() {
        return packageStr;
    }

    public void setPackageStr(String packageStr) {
        this.packageStr = packageStr;
    }
}
