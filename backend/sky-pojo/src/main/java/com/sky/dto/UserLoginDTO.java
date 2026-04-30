package com.sky.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * C端用户登录
 */
public class UserLoginDTO implements Serializable {

    private String code;

    public UserLoginDTO() {
    }

    @JsonCreator
    public UserLoginDTO(@JsonProperty("code") String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
