package com.twu.biblioteca.user;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fdhuang on 9/16/14.
 */
public class User {
    private String phone;
    private String email;
    private String name;
    private String password;
    private String ID;
    private List<String> userLibrary = new ArrayList<>();

    public User(String ID, String password) {
        this.ID = ID;
        this.password = password;
    }
    public User(String ID, String password, String phone, String email, String name) {
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.password = password;
        this.ID = ID;

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


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
