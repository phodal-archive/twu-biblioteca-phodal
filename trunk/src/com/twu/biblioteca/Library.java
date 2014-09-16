package com.twu.biblioteca;

import com.twu.biblioteca.artistic.Artistic;
import com.twu.biblioteca.artistic.book.Book;
import com.twu.biblioteca.artistic.book.BookDetailsBuilder;
import com.twu.biblioteca.artistic.movie.Movies;
import com.twu.biblioteca.user.LibraryUser;
import com.twu.biblioteca.user.User;
import com.twu.biblioteca.user.UserDetailsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fdhuang on 9/9/14.
 */

public class Library {
    private final List<Book> books;
    private final List<Movies> movies;
    private List<User> users = new ArrayList<>();

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
            BookDetailsBuilder builder = new BookDetailsBuilder();
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

    public String setArtisticCheckout(Artistic artistic, String artisticType) {
        String result;
        if(artistic.isInLibrary() == true){
            artistic.setArtisticCheckout();
            result = successfulCheckout(artisticType);
        } else {
            result = unsuccessfulCheckout(artisticType);
        }
        return result;
    }

    public String setArtisticReturn(Artistic artistic, String artisticType) {
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

    public String login(String id, String password) {
        for(int i=0; i< users.size(); i++) {
            User everyUser = users.get(i);
            if(everyUser.getID().equals(id) && everyUser.getPassword().equals(password)){
                UserDetailsBuilder userDetailsBuilder = new UserDetailsBuilder();
                return userDetailsBuilder.addEmail(everyUser)
                        .addName(everyUser)
                        .addPhone(everyUser)
                        .build();
            } else {
                return "failed";
            }
        }
        return "failed";
    }

    public void add(LibraryUser user) {
        users.add(user);
    }
}

