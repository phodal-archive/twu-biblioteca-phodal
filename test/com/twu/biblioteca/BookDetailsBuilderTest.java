package com.twu.biblioteca;

import com.twu.biblioteca.artistic.book.Book;
import com.twu.biblioteca.artistic.book.BookDetailsBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookDetailsBuilderTest {

    @Test
    public void shouldReturnABookDetail() throws Exception {
        BookDetailsBuilder builder = new BookDetailsBuilder();
        Book book = new Book("Design IOT", "Phodal", 2014);
        String result = "";
        result = builder.addName(book)
                .addAuthor(book)
                .addPublishDate(book)
                .build();
        assertEquals(result, "Design IOT,Phodal,2014\n");
    }

}