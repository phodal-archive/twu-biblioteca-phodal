package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

public class LibraryBookBuilder {
    private String name;
    private String author;
    private String publishDate;

    public LibraryBookBuilder addName(LibraryBook book) {
        this.name = book.getName();
        return this;
    }

    public LibraryBookBuilder addAuthor(LibraryBook book) {
        this.author = book.getAuthor();
        return this;
    }

    public LibraryBookBuilder addPublishDate(LibraryBook book) {
        this.publishDate = book.getPublishDate();
        return this;
    }

    public String build() {
        return this.name + "," +
                this.author + "," +
                this.publishDate + "\n";
    }
}
