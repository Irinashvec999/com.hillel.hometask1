package com.hillel.hometask13;

public class Book {
    private String nameBook;
    private int numberOfPages;
    private Author author;
    private static int counterAddedBook;


    public Book(String nameBook, int numberOfPages, Author author) {
        this.nameBook = nameBook;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }
    @Override
    public boolean equals(Object obj) {
        Book incomeBook = (Book) obj;
        boolean compareName = nameBook.equals(incomeBook);
        boolean compareAuthor = author.equals(incomeBook);
        if (compareAuthor && compareName){
            return true;
        }
        return false;
    }
    public static void countAddedBooks(Book book){


    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

}
