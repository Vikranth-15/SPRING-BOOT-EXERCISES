package com.example.goodreads;

import java.util.ArrayList;

public interface BookRepository {
    public ArrayList<Book> getBooks();

    public Book getBook(int id);

    Book addBook(Book book);

    Book updateBook(int bookId,Book book);

    void deleteBook(int bookId);
}
