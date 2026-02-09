package com.example.goodReads;

import java.util.ArrayList;
public interface BookRepository {

    public ArrayList<Book> getBooks();

    Book getBookById(int bookId);

}
