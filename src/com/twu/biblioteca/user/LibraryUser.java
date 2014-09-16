package com.twu.biblioteca.user;

import com.twu.biblioteca.artistic.Artistic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fdhuang on 9/16/14.
 */
public class LibraryUser extends User{
    private List<String> userLibrary = new ArrayList<>();

    public LibraryUser(String ID, String password) {
        super(ID, password);
    }

    public LibraryUser(String ID, String password, String phone, String email, String name) {
        super(ID, password, phone, email, name);
    }

    public void checkoutArtistic(Artistic artistic, String type) {
        userLibrary.add(artistic.getName());
    }

    public void returnArtistic(Artistic artistic, String type) {
        userLibrary.remove(artistic.getName());
    }

    public String listAllArtistic() {
        String results = "";
        for(int i=0; i< userLibrary.size(); i++) {
            results += userLibrary.get(i) + "\n";
        }
        return results;
    }
}
