package com.circuitec.cardview.model;

public class Post {

    private String title;
    private String post;
    private int image;

    public Post(){}

    public Post(String title, String post, int image) {
        this.title = title;
        this.post = post;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
