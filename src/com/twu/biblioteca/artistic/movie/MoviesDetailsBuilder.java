package com.twu.biblioteca.artistic.movie;

/**
 * Created by fdhuang on 9/15/14.
 */
public class MoviesDetailsBuilder {
    private String name;
    private int year;
    private String director;
    private int rating;

    public MoviesDetailsBuilder addName(Movies movie) {
        this.name = movie.getName();
        return this;
    }

    public MoviesDetailsBuilder addYear(Movies movie) {
        this.year = movie.getPublishDate();
        return this;
    }

    public MoviesDetailsBuilder addDirector(Movies movie) {
        this.director = movie.getDirector();
        return this;
    }

    public MoviesDetailsBuilder addRating(Movies movie) {
        this.rating = movie.getRating();
        return this;
    }

    public String build() {
        return this.name + "," +
                this.year + "," +
                this.director + "," +
                this.rating + "\n";
    }
}
