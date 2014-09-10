package com.twu.biblioteca;

import java.util.List;

/**
 * Created by fdhuang on 9/9/14.
 */

class Library {
    private final List<Book> books;

    public Library(List<Book> books){
        this.books = books;
    }

    public String getAllBookName() {
        String results = "";
        for(int i=0; i< books.size(); i++) {
            results += books.get(i).getName() + "\n";
        }
        return results;
    }

    public String getAllBookDetails() {
        String results = "";

        for(int i=0; i< books.size(); i++) {
            BookBuilder builder = new BookBuilder();
            Book book = books.get(i);
            results += builder
                    .addName(book)
                    .addAuthor(book)
                    .addPublishDate(book)
                    .build();
        }
        return results;
    }
}

