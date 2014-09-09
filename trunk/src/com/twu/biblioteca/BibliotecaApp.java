package com.twu.biblioteca;

public class BibliotecaApp {
    static Library library = new Library();

    public static void main(String[] args) {
        System.out.println(Welcome());
        System.out.println("Hi, There is All Books:");
        System.out.println(ListAllBooks());
    }

    public static String Welcome(){
        return "Welcome to Biblioteca Library";
    }

    public static String ListAllBooks(){
        return library.getAllBookName();
    }

    public static String ListAllBooksWithDetails() {
        String results = "Design IOT,Phodal,2014";
        return results;
    }
}

