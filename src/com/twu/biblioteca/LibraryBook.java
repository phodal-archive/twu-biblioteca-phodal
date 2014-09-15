package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/10/14.
 */
public class LibraryBook extends Book {
    private Boolean isBookInLibrary;

    public LibraryBook(String bookName, String author, int publishDate) {
        super(bookName, author, publishDate);
        this.isBookInLibrary = true;
    }

    public void setBookCheckout() {
        this.isBookInLibrary = false;
    }

    public void setBookReturn() {
        this.isBookInLibrary = true;
    }

    public Boolean isBookInLibrary() {
        return isBookInLibrary;
    }
}

