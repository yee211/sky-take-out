package com.sky.vo;

import lombok.Builder;

import java.io.Serializable;
@Builder
public class SetmealOverViewVO implements Serializable {

    private Integer sold;
    private Integer discontinued;

    public SetmealOverViewVO() {
    }

    public SetmealOverViewVO(Integer sold, Integer discontinued) {
        this.sold = sold;
        this.discontinued = discontinued;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        this.discontinued = discontinued;
    }
}
