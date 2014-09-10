package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book = new Book("Design IOT", "Phodal", "2014");

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {
        assertEquals(book.getName(), "Design IOT");
    }

    @Test
    public void testGetAuthor() throws Exception {
        assertEquals(book.getAuthor(), "Phodal");
    }

    @Test
    public void testGetPublishDate() throws Exception {
        assertEquals(book.getPublishDate(), "2014");
    }
}