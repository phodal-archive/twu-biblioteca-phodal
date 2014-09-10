package com.twu.biblioteca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private static Book book = new Book("Design IOT", "Phodal", "2014");
    private static Book book2 = new Book("Design IOT 2", "Phodal", "2014");
    private static List<Book> allBooks = new ArrayList<>();
    private static Library library = new Library(allBooks);
    private static String welcomeMessage = "Welcome to Biblioteca Library";

    public static void main(String[] args) throws IOException {
        initLibrary();
        System.out.println(welcomeMessage);
        System.out.println("Choose you Menu:");
        System.out.println("1. List All Books");

        char key = (char) System.in.read();
        System.out.println(HandlerMenuInput(key));
    }

    private static void initLibrary() {
        allBooks.add(book);
        allBooks.add(book2);
    }

    private static String HandlerMenuInput(char key) {
        System.out.println("You Input " + key);
        String result = "";
        if(key == '1'){
            result += library.getAllBookDetails();
        } else {
            result += "Input Error";
        }
        return result;
    }
}

