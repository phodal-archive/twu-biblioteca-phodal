package com.twu.biblioteca;

import com.twu.biblioteca.artistic.book.Book;
import com.twu.biblioteca.artistic.movie.Movies;
import com.twu.biblioteca.menu.AppMenu;
import com.twu.biblioteca.user.LibraryUser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp extends App {
    private static List<Movies> movies = new ArrayList<>();
    private static List<Book> allBooks = new ArrayList<>();
    private static Library library = new Library(allBooks, movies);
    private static AppMenu menu = new AppMenu(library);
    private static String welcomeMessage = "Welcome to Biblioteca library";

    public static void main(String[] args) throws IOException {
        (new BibliotecaApp()).run();
    }

    protected void init() {
        allBooks.add(new Book("Design IOT", "Phodal", 2014));
        allBooks.add(new Book("Design IOT 2", "Phodal", 2014));
        movies.add(new Movies("design patterns", 1994, "GOF", 10));
        movies.add(new Movies("design patterns 2",1996,"GOF",10));
        library.add(new LibraryUser("123-3423", "phodal", "18209219631", "h@phodal.com", "phodal"));
        System.out.println(welcomeMessage);
        System.out.println(menu.showMenu());
    }

    protected void loop() {
        String key = "";
        Scanner sc = new Scanner(System.in);
        key = sc.nextLine();

        System.out.println("You Select Menu: " + key);
        String results = menu.handleEvent(key);
        System.out.println(results);
        if(key.equals("Quit")){
            setQuit();
        }
    }

    protected void exit() {
        System.out.println("Quit Library");
    }
}

