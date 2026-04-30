package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class SalesTop10ReportVO implements Serializable {

    private String nameList;
    private String numberList;

    public SalesTop10ReportVO() {
    }

    public SalesTop10ReportVO(String nameList, String numberList) {
        this.nameList = nameList;
        this.numberList = numberList;
    }

    public String getNameList() {
        return nameList;
    }

    public void setNameList(String nameList) {
        this.nameList = nameList;
    }

    public String getNumberList() {
        return numberList;
    }

    public void setNumberList(String numberList) {
        this.numberList = numberList;
    }
}
