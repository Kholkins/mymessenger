package com.example.mymessenger;

public class AwesomeMessage {

    private String text;
    private String name;
    private String sender;
    private String recipient;
    private String imageURL;
    private boolean isMine;

    public AwesomeMessage() {
    }

    public AwesomeMessage(String text, String name, String sender, String recipient, String imageURL, boolean isMine) {
        this.text = text;
        this.name = name;
        this.sender = sender;
        this.recipient = recipient;
        this.imageURL = imageURL;
        this.isMine = isMine;
    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
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
