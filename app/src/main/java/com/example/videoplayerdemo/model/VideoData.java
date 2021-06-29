package com.example.videoplayerdemo.model;

public class VideoData {

    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public VideoData(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
