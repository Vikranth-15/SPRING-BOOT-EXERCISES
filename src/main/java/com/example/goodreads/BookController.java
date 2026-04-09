package com.example.goodreads;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {
    BookService bs=new BookService();
    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
        return bs.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable("bookId") int id){
        return bs.getBook(id);
    }
}
