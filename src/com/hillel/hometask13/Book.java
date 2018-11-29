package com.hillel.hometask13;

public class Book {
    private String nameBook;
    private int numberOfPages;
    private Author author;

    public Book(String nameBook, int numberOfPages, Author author) {
        this.nameBook = nameBook;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthor() {
        return author.getName();
    }
}
