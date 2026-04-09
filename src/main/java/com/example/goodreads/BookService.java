package com.example.goodreads;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class BookService implements BookRepository{
    HashMap<Integer,Book> hmap=new HashMap<>();

    BookService(){
        Book b1=new Book(1,"Atomic Hbits","Automic.jpg");
        Book b2=new Book(2,"Harry Potter","harrypotter.jpg");
        hmap.put(b1.getId(),b1);
        hmap.put(b2.getId(),b2);
    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> books=hmap.values();
        ArrayList<Book> book=new ArrayList<>(books);
        return book;
    }

    @Override
    public Book getBook(int id) {
        Book book=hmap.get(id);
        if(book==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Book not found");
        }
        return book;
    }
}
