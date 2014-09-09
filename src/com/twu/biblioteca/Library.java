package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/9/14.
 */

class Library {
    Books book = new Books("Design IOT", "Phodal", "2014");

    public String getAllBookName() {
        return book.getName();
    }
}
