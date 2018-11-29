package com.hillel.hometask13;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Effective Java", 121,  new Author("Joshua Bloch", 1976));
        Book book2 = new Book("Clean Code", 432, new Author("Robert C. Martin", 1963));
        Book book3 = new Book("Java Concurrency in Practice", 253, new Author("Brian Goetz's", 1958));
        Book book4 = new Book("Head First Design Patterns", 365, new Author("Craig Walls", 1960));
        Book book5 = new Book("Spring in Action", 361, new Author("Stefanie Kurtz", 1959));
        Book book6 = new Book("Test Driven", 298, new Author("Eddie Nelson", 1965));
        Book book7 = new Book("The Definitive Guide to Java Performance", 283, new Author("Roben Klarck", 1970));
        Book book8 = new Book("Head First Java", 428, new Author("Daniel Still", 1963));
        Book book9 = new Book("Head First Object-Oriented Analysis and Design", 289, new Author("Roger Pattisson", 1953));
        Book book10 = new Book("Java: A Beginner's Guide", 369, new Author("Edgar Dallas", 1965));

        Bookshelf.showAllBooks(book1);
    }
}
