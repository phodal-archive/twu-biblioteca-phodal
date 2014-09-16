package com.twu.biblioteca;

/**
 * Created by fdhuang on 9/16/14.
 */
public class User {
    private String password;
    private String ID;

    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
