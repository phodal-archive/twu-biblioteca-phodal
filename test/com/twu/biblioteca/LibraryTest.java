package com.twu.biblioteca;

import com.twu.biblioteca.artistic.book.Book;
import com.twu.biblioteca.artistic.movie.Movies;
import com.twu.biblioteca.user.LibraryUser;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book = new Book("Design IOT", "Phodal", 2014);
    private Book book2 = new Book("Design IOT 2", "Phodal", 2014);
    private List<Movies> movies = new ArrayList<>();
    private Movies movie1 = new Movies("design patterns",1994,"GOF",10);
    private Movies movie2 = new Movies("design patterns 2",1996,"GOF",10);
    private List<Book> allBooks = new ArrayList<>();
    private Library library = new Library(allBooks, movies);
    private LibraryUser user = new LibraryUser("123-3423", "phodal", "18209219631", "h@phodal.com", "phodal");

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
        String ActualResults = library.setArtisticCheckout(book2, book2.getType());
        String exceptResults = "Thank you! Enjoy the book";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageWhenBookCheckedOutUnsuccessful() throws Exception {
        allBooks.add(book2);
        book2.setArtisticCheckout();
        String ActualResults = library.setArtisticCheckout(book2, book2.getType());
        String exceptResults = "That book is not available.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnSuccessfulMessageWhenBookReturnSuccessful() throws Exception {
        allBooks.add(book2);
        book2.setArtisticCheckout();
        String ActualResults = library.setArtisticReturn(book2, book2.getType());
        String exceptResults = "Thank you for returning the book.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnSuccessfulMessageWhenBookReturnUnSuccessful() throws Exception {
        allBooks.add(book2);
        book2.setArtisticReturn();
        String ActualResults = library.setArtisticReturn(book2, book2.getType());
        String exceptResults = "That is not a valid book to return.";
        assertEquals(exceptResults, ActualResults);
    }


    @Test
    public void shouldReturnSuccessfulMessageMovieWhenBookCheckedOutSuccessful() throws Exception {
        movies.add(movie2);
        String ActualResults = library.setArtisticCheckout(movie2, movie2.getType());
        String exceptResults = "Thank you! Enjoy the movie";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnsuccessfulMessageWhenMovieCheckedOutUnsuccessful() throws Exception {
        movies.add(movie2);
        movie2.setArtisticCheckout();
        String ActualResults = library.setArtisticCheckout(movie2, movie2.getType());
        String exceptResults = "That movie is not available.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnSuccessfulMessageWhenMovieReturnSuccessful() throws Exception {
        movies.add(movie2);
        movie2.setArtisticCheckout();
        String ActualResults = library.setArtisticReturn(movie2, movie2.getType());
        String exceptResults = "Thank you for returning the movie.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnUnSuccessfulMessageWhenMovieReturnUnSuccessful() throws Exception {
        movies.add(movie2);
        movie2.setArtisticReturn();
        String ActualResults = library.setArtisticReturn(movie2, movie2.getType());
        String exceptResults = "That is not a valid movie to return.";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnAllUserCheckoutBook() throws Exception {
        allBooks.add(book2);
        book2.setArtisticCheckout();
        user.checkoutArtistic(book2, book2.getType());
        library.setArtisticCheckout(book2, book2.getType());
        String exceptResults = "Design IOT 2\n";
        assertEquals(exceptResults, user.listAllArtistic());
    }
}
