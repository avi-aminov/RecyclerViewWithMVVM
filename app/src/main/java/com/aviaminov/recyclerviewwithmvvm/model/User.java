package com.aviaminov.recyclerviewwithmvvm.model;

public class User {

    private String title;
    private String description;
    private String imgIcon;

    public User(String title, String description, String imgIcon) {
        this.title = title;
        this.description = description;
        this.imgIcon = imgIcon;
    }

    public User() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgIcon(String imgIcon) {
        this.imgIcon = imgIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImgIcon() {
        return imgIcon;
    }
}
