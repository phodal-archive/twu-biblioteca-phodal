package com.twu.biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private static LibraryBook book = new LibraryBook("Design IOT", "Phodal", "2014");
    private static LibraryBook book2 = new LibraryBook("Design IOT 2", "Phodal", "2014");
    private static List<LibraryBook> allBooks = new ArrayList<>();
    private static Library library = new Library(allBooks);
    private static String welcomeMessage = "Welcome to Biblioteca Library";

    public static void main(String[] args) throws IOException {
        initLibrary();
        System.out.println(welcomeMessage);
        System.out.println("Choose you Menu, Enter the Number to Continue:");
        System.out.println("1. List All Books");

        String key = "";
        while(key.equals("Quit") != true) {
            Scanner sc = new Scanner(System.in);
            key = sc.nextLine();

            System.out.println("You Select Menu: " + key);
            System.out.println(HandlerMenuInput(key));
        }
    }

    private static void initLibrary() {
        allBooks.add(book);
        allBooks.add(book2);
    }

    private static String HandlerMenuInput(String key) {
        switch (key) {
            case "1":
                return library.getAllBookDetails();
            case "Quit":
                return "";
            default:
                return "Input Error, No such Key";
        }
    }
}

