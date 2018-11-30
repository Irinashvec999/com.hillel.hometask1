package com.hillel.hometask13;

public class Bookshelf{
    private int roominess;

    public Bookshelf(int roominess) {
       this.roominess = 0;
    }
    public void add(Book book) {
        roominess++;
        if (roominess > 10) {
            System.out.println("Its impossible to add more than 10 books, bookshelf has already completed");
        }
    }
    public static void showAllBooks(Book book) {
        System.out.println(book.getNameBook() + " - " + book.getAuthor());
    }
}