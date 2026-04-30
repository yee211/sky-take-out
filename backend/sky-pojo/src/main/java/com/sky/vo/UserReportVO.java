package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class UserReportVO implements Serializable {

    private String dateList;
    private String totalUserList;
    private String newUserList;

    public UserReportVO() {
    }

    public UserReportVO(String dateList, String totalUserList, String newUserList) {
        this.dateList = dateList;
        this.totalUserList = totalUserList;
        this.newUserList = newUserList;
    }

    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public String getTotalUserList() {
        return totalUserList;
    }

    public void setTotalUserList(String totalUserList) {
        this.totalUserList = totalUserList;
    }

    public String getNewUserList() {
        return newUserList;
    }

    public void setNewUserList(String newUserList) {
        this.newUserList = newUserList;
    }
}
