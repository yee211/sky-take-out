package com.sky.dto;

import java.io.Serializable;

public class GoodsSalesDTO implements Serializable {

    private String name;
    private Integer number;

    public GoodsSalesDTO() {
    }

    public GoodsSalesDTO(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
