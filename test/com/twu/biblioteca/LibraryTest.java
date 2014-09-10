package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Book book = new Book("Design IOT", "Phodal", "2014");
    private Book book2 = new Book("Design IOT 2", "Phodal", "2014");
    private List<Book> allBooks = new ArrayList<>();
    private Library library = new Library(allBooks);

    @Before
    public void setUp(){
        allBooks.add(book);
    }

    @Test
    public void shouldReturnAllBooks() {
        String ActualResults = library.getAllBookName();
        String exceptResults = "Design IOT\n";
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
        book2.setBookCheckoutStatus(true);
        String ActualResults = library.checkoutBook(book2);
        String exceptResults = "That book is not available.";
        assertEquals(exceptResults, ActualResults);
    }
}