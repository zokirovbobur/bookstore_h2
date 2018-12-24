package com.bbro.bookstore.TextBook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TextBookRepo extends CrudRepository<TextBook,String> {
    public List<TextBook> findByBookBookId(int bookId);
    public TextBook findByTextbookId(int textBookId);
    public void deleteByTextbookId(int textBookId);
}
