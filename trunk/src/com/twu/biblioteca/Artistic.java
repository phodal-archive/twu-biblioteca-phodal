package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/15/14.
 */
public abstract class Artistic {
    private String name;
    private int publishDate;

    public Artistic(String name, int publishDate){
        this.name = name;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}
