package com.bbro.bookstore.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;


    public List<Book> getAllBooks(){

        List<Book> books = new ArrayList<>();
        bookRepo.findAll().forEach(books::add);
        return books;
    }
    public Optional<Book> getBook(String bookId){ return bookRepo.findById(bookId); }
    public Book getBookById(int bookId){ return bookRepo.getBookByBookId(bookId); }
    public Book findByBookId(int bookId){ return bookRepo.findByBookId(bookId); }

    public void addBook(Book book){
        bookRepo.save(book);
    }
    public void updateBook(String bookId, Book book){
        bookRepo.save(book);
    }

    public void deleteBook(String bookId) {
        bookRepo.deleteById(bookId);
    }

}
