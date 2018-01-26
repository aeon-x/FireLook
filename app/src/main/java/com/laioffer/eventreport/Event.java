package com.laioffer.eventreport;

/**
 * Created by caoqian on 20/12/17.
 */


public class Event {
    /**
     * All data for a event.
     */
    private String title;
    private String address;
    private String description;

    private int like;
    private String id;
    private long time;
    private String username;
    private String imgUri;
    private int CommentNumber;

    public void setCommentNumber(int commentNumber) {
        CommentNumber = commentNumber;
    }

    public int getCommentNumber() {
        return CommentNumber;
    }

    public int getLike() {
        return like;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;

    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public String getUsername() {
        return username;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Event() {}

    /**
     * Constructor
     */
    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }

    private double latitude;
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}
