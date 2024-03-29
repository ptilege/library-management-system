package org.example.service;

import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    void addBook(Book book);

    List<BookEntity> getBooks();

    boolean deleteBook(Long id);

    Book getBookById(Long id);


}
