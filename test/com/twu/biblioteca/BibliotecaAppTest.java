package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldReturnWelcomeMessage() {
        String ActualResults = BibliotecaApp.Welcome();
        String exceptResults = "Welcome to Biblioteca Library";
        assertEquals(exceptResults, ActualResults);
    }


    @Test
    public void shouldReturnAllBooks() {
        String ActualResults = BibliotecaApp.ListAllBooks();
        String exceptResults = "Design IOT";
        assertEquals(exceptResults, ActualResults);
    }

    @Test
    public void shouldReturnAllBooksWithAuthorAndYear() {
        String ActualResults = BibliotecaApp.ListAllBooksWithDetails();
        String exceptResults = "Design IOT,Phodal,2014";
        assertEquals(exceptResults, ActualResults);
    }

}