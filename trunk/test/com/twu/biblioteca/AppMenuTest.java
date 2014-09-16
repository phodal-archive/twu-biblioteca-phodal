package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AppMenuTest {
    private Book book = new Book("Design IOT", "Phodal", 2014);
    private Movies movie = new Movies("Design IOT",2014, "Phodal", 10);
    private List<Book> allBooks = new ArrayList<>();
    private List<Movies> allMovies = new ArrayList<>();
    private Library library = new Library(allBooks, allMovies);
    AppMenu menu =new AppMenu(library);

    @Before
    public void setUp() throws Exception {
        allBooks.add(book);
        allMovies.add(movie);
    }

    @Test
    public void testShowMenu() throws Exception {
        assertEquals("Choose you Menu, Enter the Number to Continue, Enter 'Quit' to quit app:\n" +
                "1. List All Books\n" +
                "2. List All Books & Movies\n", menu.showMenu());
    }

    @Test
    public void testHandler() throws Exception {

    }

    @Test
    public void testHandlerMenuInput1() throws Exception {
        assertEquals("Design IOT,Phodal,2014\n", menu.HandlerMenuInput("1"));
    }

    @Test
    public void testHandlerMenuInput2() throws Exception {
        assertEquals("Design IOT,Phodal,2014\n" +
                "Design IOT\n", menu.HandlerMenuInput("2"));
    }

    @Test
    public void testHandlerMenuInputQuit() throws Exception {
        assertEquals("", menu.HandlerMenuInput("Quit"));
    }

    @Test
    public void testHandlerMenuInputError() throws Exception {
        assertEquals("Input Error, No such Key\n" +
                "Choose you Menu, Enter the Number to Continue, Enter 'Quit' to quit app:\n" +
                "1. List All Books\n" +
                "2. List All Books & Movies\n", menu.HandlerMenuInput("q"));
    }

}