package com.bbro.bookstore.Book;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    int bookId;

    String name;
    String category;
    int cost;

    public Book(String name, String category, int cost) {
        this.name = name;
        this.category = category;
        this.cost = cost;
    }

    public Book(int bookId){ this.bookId = bookId;}

    public Book(){}

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

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
