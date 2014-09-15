package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/15/14.
 */
public class LibraryMoviesBuilder {
    private String name;
    private int year;
    private String director;
    private int rating;

    public LibraryMoviesBuilder addName(Movies movie) {
        this.name = movie.getName();
        return this;
    }

    public LibraryMoviesBuilder addYear(Movies movie) {
        this.year = movie.getPublishDate();
        return this;
    }

    public LibraryMoviesBuilder addDirector(Movies movie) {
        this.director = movie.getDirector();
        return this;
    }

    public LibraryMoviesBuilder addRating(Movies movie) {
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
