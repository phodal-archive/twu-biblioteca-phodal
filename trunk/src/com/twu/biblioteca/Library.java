package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fdhuang on 9/9/14.
 */

class Library {
    private Books book = new Books("Design IOT", "Phodal", "2014");
    private List<Books> allBooks = new ArrayList<>();

    public Library(){
        allBooks.add(book);
    }
    public String getAllBookName() {
        String results = "";
        for(int i=0;i<allBooks.size();i++) {
            results += allBooks.get(i).getName();
        }
        return results;
    }

    public String getAllBookDetails() {
        return allBooks.get(0).getAuthor().toString();
    }
}
