package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by fdhuang on 9/16/14.
 */
public class LibraryUserTest {
    List<User> users = new ArrayList<>();
    User user = new User("123456", "123-4356");
    User user2 = new User("654321", "123-4356");
    LibraryUser libraryUser = new LibraryUser(users);

    @Test
    public void testLoginSuccess() throws Exception {
        users.add(user);
        assertEquals("success", libraryUser.login(user));
    }
    
    @Test
    public void testLoginFailed() throws Exception {
        users.add(user);
        assertEquals("failed", libraryUser.login(user2));
    }
}
