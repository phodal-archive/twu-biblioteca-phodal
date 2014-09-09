package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldReturnWelcomeMessage() {
        String exceptResults = BibliotecaApp.Welcome();
        String ActualResults = "Welcome to Biblioteca Library";
        assertEquals(exceptResults, ActualResults);
    }


    @Test
    public void shouldReturnAllBooks() {
        String exceptResults = BibliotecaApp.ListAllBooks();
        String ActualResults = "Design IOT";
        assertEquals(exceptResults, ActualResults);
    }


}