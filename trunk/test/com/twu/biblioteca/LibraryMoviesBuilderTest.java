package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryMoviesBuilderTest {
    String name = "design patterns";
    int year = 1994;
    String director = "GOF";
    int rating = 10;
    Movies movie = new Movies(name, year, director, rating);


    @Test
    public void shouldReturnABookDetail() throws Exception {
        LibraryMoviesBuilder builder = new LibraryMoviesBuilder();
        String result = "";
        result = builder.addName(movie)
                .addYear(movie)
                .addDirector(movie)
                .addRating(movie)
                .build();
        assertEquals(result, "design patterns,1994,GOF,10\n");
    }

}