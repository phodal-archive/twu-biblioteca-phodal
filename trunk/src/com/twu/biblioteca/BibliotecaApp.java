package com.twu.biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private static Book book = new Book("Design IOT", "Phodal", 2014);
    private static Book book2 = new Book("Design IOT 2", "Phodal", 2014);
    private static List<Movies> movies = new ArrayList<>();
    private static Movies movie1 = new Movies("design patterns",1994,"GOF",10);
    private static Movies movie2 = new Movies("design patterns 2",1996,"GOF",10);
    private static List<Book> allBooks = new ArrayList<>();
    private static Library library = new Library(allBooks, movies);

    private static String welcomeMessage = "Welcome to Biblioteca Library";

    public static void main(String[] args) throws IOException {
        initLibrary();
        System.out.println(welcomeMessage);
        System.out.println("Choose you Menu, Enter the Number to Continue:");
        System.out.println("1. List All Books");
        System.out.println("2. List All Books & Movies");

        String key = "";
        while(key.equals("Quit") != true) {
            Scanner sc = new Scanner(System.in);
            key = sc.nextLine();

            System.out.println("You Select Menu: " + key);
            String results = HandlerMenuInput(key);
            System.out.println(results);
        }
    }

    private static void initLibrary() {
        allBooks.add(book);
        allBooks.add(book2);
        movies.add(movie1);
        movies.add(movie2);
    }

    private static String HandlerMenuInput(String key) {
        switch (key) {
            case "1":
                return library.getAllBookDetails();
            case "2":
                return library.getAllBookDetails() + library.getAllMovies();
            case "Quit":
                return "";
            default:
                return "Input Error, No such Key";
        }
    }
}

