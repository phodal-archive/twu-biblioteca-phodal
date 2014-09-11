package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryBookTest {
    LibraryBook book = new LibraryBook("Design IOT", "Phodal", "2014");

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