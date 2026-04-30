package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class TurnoverReportVO implements Serializable {

    private String dateList;
    private String turnoverList;

    public TurnoverReportVO() {
    }

    public TurnoverReportVO(String dateList, String turnoverList) {
        this.dateList = dateList;
        this.turnoverList = turnoverList;
    }

    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public String getTurnoverList() {
        return turnoverList;
    }

    public void setTurnoverList(String turnoverList) {
        this.turnoverList = turnoverList;
    }
}
