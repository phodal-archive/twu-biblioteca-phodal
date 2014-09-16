package com.twu.biblioteca.user;

public class UserDetailsBuilder {
    private String phone;
    private String email;
    private String name;

    public UserDetailsBuilder addPhone(User user) {
        this.phone = user.getPhone();
        return this;
    }

    public UserDetailsBuilder addEmail(User user) {
        this.email = user.getEmail();
        return this;
    }

    public UserDetailsBuilder addName(User user) {
        this.name = user.getName();
        return this;
    }

    public String build() {
        return this.phone + "\n" +
                this.email + "\n" +
                this.name + "\n";

    }
}