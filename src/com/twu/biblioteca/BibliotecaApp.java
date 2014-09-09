package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {
    static Library library = new Library();
    static MainMenu menu = new MainMenu();

    public static void main(String[] args) throws IOException {
        System.out.println(Welcome());
        System.out.println("Choose you Menu:");
        System.out.println("1. List All Books");
        char key = (char) System.in.read();
        System.out.println(HandlerMenuInput(key));
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


    public static String HandlerMenuInput(char key) {
        System.out.println("You Choose " + key);
        String result = "";
        if(key == '1'){
            result += library.getAllBookDetails();
        }
        return result;
    }
}

