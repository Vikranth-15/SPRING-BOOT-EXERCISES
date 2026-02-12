package com.example.goodReads;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

@Service
public class BookService implements BookRepository{
    private HashMap<Integer,Book> hm=new HashMap<>();
    int uniqueBookId=3;

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

    @Override
    public Book addBook(Book book) {
        book.setId(uniqueBookId);
        hm.put(uniqueBookId,book);
        uniqueBookId+=1;
        return book;


    }

    @Override
    public Book updateBook(int bookId, Book book) {
        Book existingBook = hm.get(bookId);
        if(existingBook==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if(book.getName()!=null){
            existingBook.setName(book.getName());
        }
        if(book.getImageUrl()!=null){
            existingBook.setImageUrl(book.getImageUrl());
        }

        return existingBook;
    }

    @Override
    public void deleteBook(int bookId) {
        Book book=hm.get(bookId);
        if(book==null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }else{
            hm.remove(bookId);
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
    }


}
