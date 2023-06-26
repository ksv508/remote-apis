package com.example.remoteapis;

public class MovieResponse {
    private int budget;
    private String imbd_id;
    private String original_title;

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getImbd_id() {
        return imbd_id;
    }

    public void setImbd_id(String imbd_id) {
        this.imbd_id = imbd_id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;

    }

    public MovieResponse() {
    }

    public MovieResponse(int budget, String imbd_id, String original_title) {
        this.budget = budget;
        this.imbd_id = imbd_id;
        this.original_title = original_title;
    }
}
