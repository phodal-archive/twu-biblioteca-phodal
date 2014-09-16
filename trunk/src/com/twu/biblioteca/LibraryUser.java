package com.twu.biblioteca;

import java.util.List;

/**
 * Created by fdhuang on 9/16/14.
 */
public class LibraryUser {
    private List<User> users;

    public LibraryUser(List<User> users) {
        this.users = users;
    }

    public String login(User user) {

        for(int i=0; i< users.size(); i++) {
            User everyUser = users.get(i);
            if(isLoginSuccess(user, everyUser)){
                return "success";
            }else {
                return "failed";
            }
        }
        return "";
    }

    private boolean isLoginSuccess(User user, User everyUser) {
        return everyUser.getID() == user.getID() && user.getPassword() == everyUser.getPassword();
    }
}
