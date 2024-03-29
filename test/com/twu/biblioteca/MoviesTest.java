package com.twu.biblioteca;

import com.twu.biblioteca.artistic.movie.Movies;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MoviesTest {
    String name = "design patterns";
    int year = 1994;
    String director = "GOF";
    int rating = 10;
    Movies movies = new Movies(name, year, director, rating);

    @Test
    public void testGetName() throws Exception {
        assertEquals(name, movies.getName());
    }

    @Test
    public void testSetName() throws Exception {
        movies.setName(this.name);
        assertEquals(this.name, movies.getName());
    }

    @Test
    public void testGetYear() throws Exception {
        assertEquals(year, movies.getPublishDate());
    }

    @Test
    public void testSetYear() throws Exception {
        movies.setPublishDate(this.year);
        assertEquals(this.year, movies.getPublishDate());
    }

    @Test
    public void testGetDirector() throws Exception {
        assertEquals(director, movies.getDirector());
    }

    @Test
    public void testSetDirector() throws Exception {
        movies.setDirector(this.director);
        assertEquals(this.director, movies.getDirector());
    }

    @Test
    public void testGetRating() throws Exception {
        assertEquals(rating, movies.getRating());
    }

    @Test
    public void testSetRating() throws Exception {
        movies.setRating(this.rating);
        assertEquals(this.rating, movies.getRating());
    }
}