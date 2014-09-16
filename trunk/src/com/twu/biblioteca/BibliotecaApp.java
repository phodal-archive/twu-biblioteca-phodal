package com.twu.biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private static Book book = new Book("Design IOT", "Phodal", 2014);
    private static Book book2 = new Book("Design IOT 2", "Phodal", 2014);
    private static List<Movies> movies = new ArrayList<>();
    private static Movies movie1 = new Movies("design patterns",1994,"GOF",10);
    private static Movies movie2 = new Movies("design patterns 2",1996,"GOF",10);
    private static List<Book> allBooks = new ArrayList<>();
    private static Library library = new Library(allBooks, movies);
    private static AppMenu menu = new AppMenu(library);
    private static String welcomeMessage = "Welcome to Biblioteca Library";

    public static void main(String[] args) throws IOException {
        initLibrary();
        System.out.println(welcomeMessage);

        System.out.println(menu.showMenu());
        menu.handlerInput();
    }

    private static void initLibrary() {
        allBooks.add(book);
        allBooks.add(book2);
        movies.add(movie1);
        movies.add(movie2);
    }
}

