package com.bbro.bookstore.TextBook;

import com.bbro.bookstore.Book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TextBookController {

    @Autowired
    private TextBookService textBookService;

    
    @RequestMapping("/sample/textbook")
    public TextBook getSampleTextBook(){
        return new TextBook();
    }
    
    @RequestMapping("/textbooks")
    public List<TextBook> getAllTextBooks(){
        return textBookService.getAllTextBooks();
    }

    @RequestMapping("/books/{bookId}/textbooks")
    public List<TextBook> getAllTextBooksByBookId(@PathVariable int bookId){
        return textBookService.getAllTextBooksByBookId(bookId);
    }

    @RequestMapping("/textbooks/{textBookId}")
    public TextBook getTextBook(@PathVariable int textBookId){
        return textBookService.getTextBook(textBookId);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/books/{bookId}/textbooks")
    public void addTextBook(@RequestBody TextBook textBook, @PathVariable int bookId){
        textBook.setBook(new Book(bookId));
        textBookService.addTextBook(textBook);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/textbooks/{textBookId}")
    public void updateTextBook(@RequestBody TextBook textBook, @PathVariable int textBookId){
        textBookService.updateTextBook(textBookId, textBook);
    }

    @RequestMapping(method=RequestMethod.DELETE, value = "/textbooks/{textBookId}")
    public void deleteTextBook(@PathVariable int textBookId){
        textBookService.deleteTextBook(textBookId);
    }
}
