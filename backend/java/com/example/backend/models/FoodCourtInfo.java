package com.example.backend.models;

public class FoodCourtInfo {
    private String imageUrl;
    private String title;
    private String[] details;

    // Constructors, Getters, and Setters
    public FoodCourtInfo(String imageUrl, String title, String[] details) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.details = details;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getDetails() {
        return details;
    }

    public void setDetails(String[] details) {
        this.details = details;
    }
}