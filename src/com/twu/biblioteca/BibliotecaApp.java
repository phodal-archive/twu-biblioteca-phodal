package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {
    static Library library = new Library();
    static MainMenu menu = new MainMenu();

    public static void main(String[] args) throws IOException {
        System.out.println(Welcome());
        System.out.println("Choose you Menu:");
        char getKey = (char) System.in.read();
        System.out.println("You Choose " + getKey);
    }

    public static String Welcome(){
        return "Welcome to Biblioteca Library";
    }

    public static String ListAllBooks(){
        return library.getAllBookName();
    }

    public static String ListAllBooksWithDetails() {
        return library.getAllBookDetails();
    }
}

