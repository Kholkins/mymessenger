package com.example.mymessenger;

public class AwesomeMessage {

    private String text;
    private String name;
    private String imageURL;

    public AwesomeMessage() {
    }

    public AwesomeMessage(String text, String name, String imageURL) {
        this.text = text;
        this.name = name;
        this.imageURL = imageURL;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
