package com.twu.biblioteca.artistic.movie;

import com.twu.biblioteca.artistic.Artistic;

/**
 * Created by fdhuang on 9/15/14.
 */
public class Movies extends Artistic {
    private final String type;
    private String director;
    private int rating;

    public Movies(String name, int publishDate, String director, int rating) {
        super(name, publishDate);
        this.director = director;
        this.rating = rating;
        this.type = "movie";
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

    public String getType() {
        return type;
    }
}
