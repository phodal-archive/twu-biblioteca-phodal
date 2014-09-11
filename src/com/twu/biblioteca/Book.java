package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

public abstract class Book {
    private final String author;
    private final String bookName;
    private final String publishDate;

    public Book(String bookName, String author, String publishDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }

}
