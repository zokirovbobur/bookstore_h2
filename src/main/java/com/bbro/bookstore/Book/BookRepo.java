package com.bbro.bookstore.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,String> {
public Book getBookByBookId(int bookId);
    public Book findByBookId(int bookId);
}
