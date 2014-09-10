package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

public class Book {
    private final String author;
    private final String bookName;
    private final String publishDate;
    private Boolean bookStatus;

    public Book(String bookName, String author, String publishDate) {
        this.bookName = bookName;
        this.author = author;
        this.publishDate = publishDate;
        this.bookStatus = false;
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

    public Boolean isBookCheckout() {
        return bookStatus;
    }

    public void setBookCheckoutStatus(Boolean bool) {
        this.bookStatus = bool;
    }
}
