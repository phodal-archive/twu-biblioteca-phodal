package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by fdhuang on 9/16/14.
 */
public class AppMenu {
    private final Library library;

    public AppMenu(Library library) {
        this.library = library;
    }

    public String showMenu() {
        String choice = "Choose you Menu, Enter the Number to Continue, Enter 'Quit' to quit app" + ":";
        String listBooks = "1. List All Books";
        String listAllArtistic = "2. List All Books & Movies";
        return choice + "\n" + listBooks + "\n" + listAllArtistic + "\n";
    }

    public void handlerInput() {
        String key = "";
        while(key.equals("Quit") != true) {
            Scanner sc = new Scanner(System.in);
            key = sc.nextLine();

            System.out.println("You Select Menu: " + key);
            String results = HandlerMenuInput(key);
            System.out.println(results);
        }
    }

    public String HandlerMenuInput(String key) {
        switch (key) {
            case "1":
                return library.getAllBookDetails();
            case "2":
                return library.getAllBookDetails() + library.getAllMovies();
            case "Quit":
                return "";
            default:
                return "Input Error, No such Key\n" + showMenu();
        }
    }
}
