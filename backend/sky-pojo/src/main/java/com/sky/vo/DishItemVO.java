package com.sky.vo;

import java.io.Serializable;

public class DishItemVO implements Serializable {

    private String name;
    private Integer copies;
    private String image;
    private String description;

    public DishItemVO() {
    }

    public DishItemVO(String name, Integer copies, String image, String description) {
        this.name = name;
        this.copies = copies;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCopies() {
        return copies;
    }

    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
