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
            result = successfulCheckout("book");
        } else {
            result = unsuccessfulCheckout("book");
        }
        return result;
    }

    public String returnBook(LibraryBook book) {
        String result;
        if(book.isBookInLibrary() == true){
            result = successfulReturn("book");
        } else {
            book.setBookReturn();
            result = unsuccessfulReturn("book");
        }
        return result;
    }

    public String checkoutMovie(LibraryMovies movie) {
        String result;
        if(movie.isArtisticInLibrary() == true){
            movie.setArtisticCheckout();
            result = successfulCheckout("movie");
        } else {
            result = unsuccessfulCheckout("movie");
        }
        return result;
    }

    public String returnMovie(LibraryMovies movie) {
        String result;
        if(movie.isArtisticInLibrary() == true){
            result = successfulReturn("movie");
        } else {
            movie.setArtisticReturn();
            result = unsuccessfulReturn("movie");
        }
        return result;
    }

    private String unsuccessfulCheckout(String artistic) {
        return "That " + artistic + " is not available.";
    }

    private String successfulCheckout(String artistic) {
        return "Thank you! Enjoy the " + artistic;
    }

    private String unsuccessfulReturn(String artistic) {
        return "Thank you for returning the " + artistic + ".";
    }

    private String successfulReturn(String artistic) {
        return "That is not a valid " + artistic + " to return.";
    }
}

