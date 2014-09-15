package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

public class LibraryBookBuilder {
    private String name;
    private String author;
    private int publishDate;

    public LibraryBookBuilder addName(Book book) {
        this.name = book.getName();
        return this;
    }

    public LibraryBookBuilder addAuthor(Book book) {
        this.author = book.getAuthor();
        return this;
    }

    public LibraryBookBuilder addPublishDate(Book book) {
        this.publishDate = book.getPublishDate();
        return this;
    }

    public String build() {
        return this.name + "," +
                this.author + "," +
                this.publishDate + "\n";
    }
}
