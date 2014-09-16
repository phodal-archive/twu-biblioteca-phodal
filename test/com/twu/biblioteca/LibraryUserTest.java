package com.twu.biblioteca;

import com.twu.biblioteca.artistic.book.Book;
import com.twu.biblioteca.artistic.movie.Movies;
import com.twu.biblioteca.user.LibraryUser;
import com.twu.biblioteca.user.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by fdhuang on 9/16/14.
 */
public class LibraryUserTest {
    List<User> users = new ArrayList<>();
    private LibraryUser user = new LibraryUser("123-3423", "phodal", "18209219631", "h@phodal.com", "phodal");
    LibraryUser user2 = new LibraryUser("123-4356", "654321");
    private Book book = new Book("Design IOT", "Phodal", 2014);
    private Book book2 = new Book("Design IOT 2", "Phodal", 2014);
    private List<Book> allBooks = new ArrayList<>();
    private List<Movies> movies = new ArrayList<>();
    private Library library = new Library(allBooks, movies);

    @Test
    public void shouldReturnUserDetailsWhenLoginSuccess() throws Exception {
        library.add(user);
        assertEquals("18209219631\n" +
                "h@phodal.com\n" +
                "phodal\n", library.login(user.getID(), user.getPassword()));
    }
    
    @Test
    public void testLoginFailed() throws Exception {
        library.add(user);
        assertEquals("failed", library.login(user2.getID(), user2.getPassword()));
    }

    @Test
    public void testUserCanCheckoutArtistic() throws Exception {
        user.checkoutArtistic(book, book.getType());
        assertEquals("Design IOT\n", user.listAllArtistic());
    }

    @Test
    public void testUserCanCheckoutArtisticReturnAndCheckoutAgain() throws Exception {
        user.checkoutArtistic(book, book.getType());
        user.returnArtistic(book, book.getType());
        user.checkoutArtistic(book, book.getType());
        assertEquals("Design IOT\n", user.listAllArtistic());
    }
}
