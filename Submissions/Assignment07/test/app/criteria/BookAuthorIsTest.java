package app.criteria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import app.entity.Book;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookAuthorIsTest {
    BookAuthorIs criteria;
    ArrayList<Book> books;

    @BeforeEach
    void setUp() {
        criteria = new BookAuthorIs("William Shakespeare");

        books = new ArrayList<>();
        books.add(new Book("All's Well That Ends Well", "William Shakespeare", "comedy"));
        books.add(new Book("Paintings and Drawings", "Leonardo da Vinci", "comedy"));
    }

    @Test
    void satisfiedReturnsTrueIfTheTitleEquals() {
        boolean actual = criteria.satisfied(books.get(0), books);
        assertTrue(actual);
    }

    @Test
    void satisfiedReturnsFalseIfTheTitleDoesNotEqual() {
        boolean actual = criteria.satisfied(books.get(1), books);
        assertFalse(actual);
    }
}