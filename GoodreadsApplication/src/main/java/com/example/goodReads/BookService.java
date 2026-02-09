package com.example.goodReads;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
public class BookService implements BookRepository{
    private HashMap<Integer,Book> hm=new HashMap<>();

    public BookService() {
        Book b1=new Book(1,"Harry-Potter","Harry-Potter.jpg");
        Book b2=new Book(2,"Rise","rise.jpg");
        hm.put(b1.getId(),b1);
        hm.put(b2.getId(),b2);
    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> book =hm.values();
        ArrayList<Book> books=new ArrayList<>(book);
        return books;
    }

    @Override
    public Book getBookById(int bookId) {
        Book book=hm.get(bookId);
        if(book==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return book;
    }


}
