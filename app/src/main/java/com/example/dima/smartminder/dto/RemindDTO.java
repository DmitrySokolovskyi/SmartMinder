package com.example.dima.smartminder.dto;

/**
 * Created by dima on 11/1/16.
 */

public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
