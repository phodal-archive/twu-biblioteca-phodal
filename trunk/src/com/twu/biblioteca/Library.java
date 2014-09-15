package com.twu.biblioteca;

import java.util.List;

/**
 * Created by fdhuang on 9/9/14.
 */

public class Library {
    private final List<LibraryBook> books;
    private final List<LibraryMovies> movies;

    public Library(List<LibraryBook> books) {
        this(books, null);
    }

    public Library(List<LibraryBook> books, List<LibraryMovies> movies){
        this.books = books;
        this.movies = movies;
    }

    public String getAllBookName() {
        List<LibraryBook> books1 = books;
        String results = "";
        for(int i=0; i< books1.size(); i++) {
            results += books1.get(i).getName() + "\n";
        }
        return results;
    }

    public String getAllMovies() {
        List<LibraryMovies> movies1 = movies;
        String results = "";
        for(int i=0; i< movies1.size(); i++) {
            results += movies1.get(i).getName() + "\n";
        }
        return results;
    }

    public String getAllBookDetails() {
        String results = "";

        for(int i=0; i< books.size(); i++) {
            LibraryBookBuilder builder = new LibraryBookBuilder();
            LibraryBook book = books.get(i);
            if(book.isBookInLibrary() == true) {
                results += builder
                        .addName(book)
                        .addAuthor(book)
                        .addPublishDate(book)
                        .build();
            }
        }
        return results;
    }

    public String checkoutBook(LibraryBook book) {
        String result;
        if(book.isBookInLibrary() == true){
            book.setBookCheckout();
            result = successfulCheckout();
        } else {
            result = unsuccessfulCheckout();
        }
        return result;
    }

    public String returnBook(LibraryBook book) {
        String result;
        if(book.isBookInLibrary() == true){
            result = successfulReturn();
        } else {
            book.setBookReturn();
            result = unsuccessfulReturn();
        }
        return result;
    }

    private String unsuccessfulCheckout() {
        return "That book is not available.";
    }

    private String successfulCheckout() {
        return "Thank you! Enjoy the book";
    }

    private String unsuccessfulReturn() {
        return "Thank you for returning the book.";
    }

    private String successfulReturn() {
        return "That is not a valid book to return.";
    }

}

