package com.twu.biblioteca;

import java.util.List;

/**
 * Created by fdhuang on 9/9/14.
 */

public class Library {
    private final List<Book> books;
    private final List<Movies> movies;

    public Library(List<Book> books) {
        this(books, null);
    }

    public Library(List<Book> books, List<Movies> movies){
        this.books = books;
        this.movies = movies;
    }

    public String getAllBookName() {
        List<Book> books1 = books;
        String results = "";
        for(int i=0; i< books1.size(); i++) {
            results += books1.get(i).getName() + "\n";
        }
        return results;
    }

    public String getAllMovies() {
        List<Movies> movies1 = movies;
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
            Book book = books.get(i);
            if(book.isInLibrary() == true) {
                results += builder
                        .addName(book)
                        .addAuthor(book)
                        .addPublishDate(book)
                        .build();
            }
        }
        return results;
    }

    public String checkoutArtistic(Artistic artistic, String artisticType) {
        String result;
        if(artistic.isInLibrary() == true){
            artistic.setArtisticCheckout();
            result = successfulCheckout(artisticType);
        } else {
            result = unsuccessfulCheckout(artisticType);
        }
        return result;
    }

    public String returnArtistic(Artistic artistic, String artisticType) {
        String result;
        if(artistic.isInLibrary() == true){
            result = successfulReturn(artisticType);
        } else {
            artistic.setArtisticReturn();
            result = unsuccessfulReturn(artisticType);
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

