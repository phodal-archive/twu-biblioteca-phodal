package com.twu.biblioteca.menu;

import com.twu.biblioteca.Library;

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
        String userlogin = "3. Login";
        return choice + "\n" + listBooks + "\n" + listAllArtistic + "\n" + userlogin + "\n";
    }

    public String handleEvent(String key) {
        switch (key) {
            case "1":
                return library.getAllBookDetails();
            case "2":
                return library.getAllBookDetails() + library.getAllMovies();
            case "3":
                return LoginMenu();
            case "Quit":
                return "";
            default:
                return "Input Error, No such Key\n" + showMenu();
        }
    }

    private String LoginMenu() {
        System.out.print("ID:");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.out.print("Password:");
        Scanner sc2 = new Scanner(System.in);
        String password = sc2.nextLine();
        return library.login(id, password);
    }
}
