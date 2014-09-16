package com.twu.biblioteca.artistic.book;

import com.twu.biblioteca.artistic.Artistic;

/**
 * Created by fdhuang on 9/9/14.
 */

public class Book extends Artistic {
    private final String type;
    private String author;

    public Book(String name, String author, int publishDate) {
        super(name, publishDate);
        this.author = author;
        this.type = "book";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }
}
