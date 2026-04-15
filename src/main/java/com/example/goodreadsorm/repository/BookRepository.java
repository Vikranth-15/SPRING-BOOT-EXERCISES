package com.example.goodreadsorm.repository;

import com.example.goodreadsorm.model.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface BookRepository {

    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
    Book updateBook(int bookId,Book book);
    void deleteBook(int bookId);
}
