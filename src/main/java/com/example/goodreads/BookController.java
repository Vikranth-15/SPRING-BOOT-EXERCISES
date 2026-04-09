package com.example.goodreads;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        System.out.println("Controller reached");
        return bs.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable int bookId,
                           @RequestBody Book book){
        return bs.updateBook(bookId, book);
    }
//    @PutMapping("/books/{bookId}")
//    public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
//        return bs.updateBook(bookId, book);
//    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bs.deleteBook(bookId);
    }
}
