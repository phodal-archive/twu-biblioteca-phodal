package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/15/14.
 */
public class Movies extends Artistic{
    private String director;
    private int rating;

    public Movies(String name, int publishDate, String director, int rating) {
        super(name, publishDate);
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
