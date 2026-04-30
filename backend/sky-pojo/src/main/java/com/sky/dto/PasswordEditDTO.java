package com.sky.dto;

import java.io.Serializable;

public class PasswordEditDTO implements Serializable {

    private Long empId;
    private String oldPassword;
    private String newPassword;

    public PasswordEditDTO() {
    }

    public PasswordEditDTO(Long empId, String oldPassword, String newPassword) {
        this.empId = empId;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
