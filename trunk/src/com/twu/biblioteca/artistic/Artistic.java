package com.twu.biblioteca.artistic;

/**
 * Created by fdhuang on 9/15/14.
 */
public abstract class Artistic {
    private String name;
    private int publishDate;
    private boolean isArtisticInLibrary;

    public Artistic(String name, int publishDate){
        this.name = name;
        this.publishDate = publishDate;
        isArtisticInLibrary = true;
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

    public void setArtisticCheckout() {
        this.isArtisticInLibrary = false;
    };

    public void setArtisticReturn() {
        this.isArtisticInLibrary = true;
    };

    public boolean isInLibrary() {
        return isArtisticInLibrary;
    }
}
