package com.example.goodreads;

import java.util.ArrayList;

public interface BookRepository {
    public ArrayList<Book> getBooks();

    public Book getBook(int id);

}
