package com.shivamsingh.portfolioapp.SliderData;

public class SliderData {
    private String imgUrl;
    private String description;

    public SliderData(String imgUrl, String description) {
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescription() {
        return description;
    }
}
