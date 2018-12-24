package com.bbro.bookstore.TextBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TextBookService {

    @Autowired
    private TextBookRepo textBookRepo;

    public List<TextBook> getAllTextBooks(){

        List<TextBook> textBooks = new ArrayList<>();
        textBookRepo.findAll().forEach(textBooks::add);
        return textBooks;
    }
    public List<TextBook> getAllTextBooksByBookId(int bookId){

        List<TextBook> textBooks = new ArrayList<>();
        textBookRepo.findByBookBookId(bookId).forEach(textBooks::add);
        return textBooks;
    }
    public TextBook getTextBook(int textBookId){
       return textBookRepo.findByTextbookId(textBookId);
    }

    public void addTextBook(TextBook textBook){
        textBookRepo.save(textBook);
    }
    public void updateTextBook(int bookId, TextBook textBook){
        textBookRepo.save(textBook);
    }

    public void deleteTextBook(int textBookId) {
        textBookRepo.deleteByTextbookId(textBookId);
    }
}
