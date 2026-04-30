package com.sky.dto;

import java.io.Serializable;

public class SetmealPageQueryDTO implements Serializable {

    private int page;
    private int pageSize;
    private String name;
    private Integer categoryId;
    private Integer status;

    public SetmealPageQueryDTO() {
    }

    public SetmealPageQueryDTO(int page, int pageSize, String name, Integer categoryId, Integer status) {
        this.page = page;
        this.pageSize = pageSize;
        this.name = name;
        this.categoryId = categoryId;
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
