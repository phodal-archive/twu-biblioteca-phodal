package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

public class Book extends Artistic{
    private String author;

    public Book(String name, String author, int publishDate) {
        super(name, publishDate);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
