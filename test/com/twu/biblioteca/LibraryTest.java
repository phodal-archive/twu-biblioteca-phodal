package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private LibraryBook book = new LibraryBook("Design IOT", "Phodal", 2014);
    private LibraryBook book2 = new LibraryBook("Design IOT 2", "Phodal", 2014);
    private List<LibraryMovies> movies = new ArrayList<>();
    private LibraryMovies movie1 = new LibraryMovies("design patterns",1994,"GOF",10);
    private LibraryMovies movie2 = new LibraryMovies("design patterns 2",1996,"GOF",10);
    private List<LibraryBook> allBooks = new ArrayList<>();
    private Library library = new Library(allBooks, movies);

    @Before
    public void setUp(){
        allBooks.add(book);
        movies.add(movie1);
    }

    @Test
    public void shouldReturnAllBooks() {
        String ActualResults = library.getAllBookName();
        String exceptResults = "Design IOT\n";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnAllMovies() {
        String ActualResults = library.getAllMovies();
        String exceptResults = "design patterns\n";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnAllBooksWithAuthorAndYear() {
        String ActualResults = library.getAllBookDetails();
        String exceptResults = "Design IOT,Phodal,2014\n";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnSuccessfulMessageBookWhenBookCheckedOutSuccessful() throws Exception {
        allBooks.add(book2);
        String ActualResults = library.checkoutBook(book2);
        String exceptResults = "Thank you! Enjoy the book";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageWhenBookCheckedOutUnsuccessful() throws Exception {
        allBooks.add(book2);
        book2.setBookCheckout();
        String ActualResults = library.checkoutBook(book2);
        String exceptResults = "That book is not available.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnSuccessfulMessageWhenBookReturnSuccessful() throws Exception {
        allBooks.add(book2);
        book2.setBookCheckout();
        String ActualResults = library.returnBook(book2);
        String exceptResults = "Thank you for returning the book.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnSuccessfulMessageWhenBookReturnUnSuccessful() throws Exception {
        allBooks.add(book2);
        book2.setBookReturn();
        String ActualResults = library.returnBook(book2);
        String exceptResults = "That is not a valid book to return.";
        assertEquals(exceptResults, ActualResults);
    }


    @Test
    public void shouldReturnSuccessfulMessageMovieWhenBookCheckedOutSuccessful() throws Exception {
        allBooks.add(book2);
        String ActualResults = library.checkoutBook(book2);
        String exceptResults = "Thank you! Enjoy the movie";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageWhenMovieCheckedOutUnsuccessful() throws Exception {
        allBooks.add(book2);
        book2.setBookCheckout();
        String ActualResults = library.checkoutBook(book2);
        String exceptResults = "That movie is not available.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnSuccessfulMessageWhenMovieReturnSuccessful() throws Exception {
        allBooks.add(book2);
        book2.setBookCheckout();
        String ActualResults = library.returnBook(book2);
        String exceptResults = "Thank you for returning the movie.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnSuccessfulMessageWhenMovieReturnUnSuccessful() throws Exception {
        allBooks.add(book2);
        book2.setBookReturn();
        String ActualResults = library.returnBook(book2);
        String exceptResults = "That is not a valid movie to return.";
        assertEquals(exceptResults, ActualResults);
    }
}