package com.example.goodReads;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class BookController {
    BookService bs=new BookService();
    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
      return  bs.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public  Book getBookById(@PathVariable("bookId") int bookId){
      return bs.getBookById(bookId);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
      return bs.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable("bookId") int bookId,@RequestBody Book book){
        return bs.updateBook(bookId,book);
    }

    @DeleteMapping("/books/{bookId}")

    public void deleteBook(@PathVariable("bookId") int bookId){
        bs.deleteBook(bookId);
    }

}
