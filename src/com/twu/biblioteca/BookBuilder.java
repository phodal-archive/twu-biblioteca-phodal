package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

public class BookBuilder {
    private String name;
    private String author;
    private String publishDate;

    public BookBuilder() {

    }

    public BookBuilder addName(Book book) {
        this.name = book.getName();
        return this;
    }

    public BookBuilder addAuthor(Book book) {
        this.author = book.getAuthor();
        return this;
    }

    public BookBuilder addPublishDate(Book book) {
        this.publishDate = book.getPublishDate();
        return this;
    }

    public String build() {
        return this.name + "," +
                this.author + "," +
                this.publishDate + "\n";
    }
}
