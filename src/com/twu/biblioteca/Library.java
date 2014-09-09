package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fdhuang on 9/9/14.
 */

class Library {
    private Books book = new Books("Design IOT", "Phodal", "2014");
    private Books book2 = new Books("Design IOT 2", "Phodal", "2014");
    private List<Books> allBooks = new ArrayList<>();

    public Library(){
        allBooks.add(book);
        allBooks.add(book2);
    }
    public String getAllBookName() {
        String results = "";
        for(int i=0;i<allBooks.size();i++) {
            results += allBooks.get(i).getName() + "\n";
        }
        return results;
    }

    public String getAllBookDetails() {
        String results = "";
        for(int i=0;i<allBooks.size();i++) {
            results += allBooks.get(i).getName() + ",";
            results += allBooks.get(i).getAuthor() + ",";
            results += allBooks.get(i).getPublishDate() + "\n";
        }
        return results;
    }
}
