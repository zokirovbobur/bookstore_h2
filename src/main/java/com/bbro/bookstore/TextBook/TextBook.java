package com.bbro.bookstore.TextBook;

import com.bbro.bookstore.Book.Book;

import javax.persistence.*;

@Entity
public class TextBook {
    @Id
    @GeneratedValue
    int textbookId;

    String name;
    String category;
    int cost;

    @ManyToOne
    Book book;

    public TextBook(String name, String category, int cost,int bookId) {
        this.name = name;
        this.category = category;
        this.cost = cost;
        Book book= new Book();
        book.setBookId(bookId);
        this.book = book;
    }

    public TextBook(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTextbookId() {
        return textbookId;
    }

    public void setTextbookId(int textbookId) {
        this.textbookId = textbookId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
