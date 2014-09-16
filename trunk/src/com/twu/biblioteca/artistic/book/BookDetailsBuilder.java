package com.twu.biblioteca.artistic.book;

/**
 * Created by fdhuang on 9/9/14.
 */

public class BookDetailsBuilder {
    private String name;
    private String author;
    private int publishDate;

    public BookDetailsBuilder addName(Book book) {
        this.name = book.getName();
        return this;
    }

    public BookDetailsBuilder addAuthor(Book book) {
        this.author = book.getAuthor();
        return this;
    }

    public BookDetailsBuilder addPublishDate(Book book) {
        this.publishDate = book.getPublishDate();
        return this;
    }

    public String build() {
        return this.name + "," +
                this.author + "," +
                this.publishDate + "\n";
    }
}
