package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryBookBuilderTest {
    LibraryBook book = new LibraryBook("Design IOT", "Phodal", "2014");

    @Test
    public void shouldReturnABookDetail() throws Exception {
        LibraryBookBuilder builder = new LibraryBookBuilder();
        String result = "";
        result = builder.addName(book)
                .addAuthor(book)
                .addPublishDate(book)
                .build();
        assertEquals(result, "Design IOT,Phodal,2014\n");
    }

}