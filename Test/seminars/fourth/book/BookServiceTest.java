package seminars.fourth.book;


import fourth.book.BookRepository;
import fourth.book.BookService;
import org.junit.jupiter.api.BeforeEach;
import fourth.book.Book;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Mock
    Book bookMock;
    @Mock
    List<Book> bookListMock;
    BookRepository bookRepositoryMock = mock(BookRepository.class);
    BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    void checkFindBookById() {
        when(bookRepositoryMock.findById("1")).thenReturn(bookMock);
        assertEquals(bookService.findBookById("1"), bookMock);
    }

    @Test
    void checkFindAllBooks() {
        when(bookRepositoryMock.findAll()).thenReturn(bookListMock);
        assertEquals(bookService.findAllBooks(), bookListMock);
    }
}