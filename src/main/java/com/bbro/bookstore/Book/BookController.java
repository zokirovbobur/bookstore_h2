package com.bbro.bookstore.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping("/books/{bookId}")
    public Book getBook(@PathVariable int bookId){
        return bookService.getBookById(bookId);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/books/{bookId}")
    public void addBook(@RequestBody Book book, @PathVariable String bookId){
        bookService.updateBook(bookId,book);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/books/{bookId}")
    public void deleteBook(@PathVariable String bookId){
        bookService.deleteBook(bookId);
    }
}
