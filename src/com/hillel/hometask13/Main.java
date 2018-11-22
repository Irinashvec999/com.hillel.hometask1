package com.hillel.hometask13;

public class Main {
    public static void main(String[] args) {
        System.out.println("Most recommended books for Java beginners:");
        Book book1 = new Book();
        book1.setName("Effective Java");
        Book book2 = new Book();
        book2.setName("Clean Code");
        Book book3 = new Book();
        book3.setName("Java Concurrency in Practice");
        Book book4 = new Book();
        book4.setName("Head First Design Patterns");
        Book book5 = new Book();
        book5.setName("Spring in Action");
        Book book6 = new Book();
        book6.setName("Test Driven");
        Book book7 = new Book();
        book7.setName("The Definitive Guide to Java Performance");
        Book book8 = new Book();
        book8.setName("Head First Java");
        Book book9 = new Book();
        book9.setName("Head First Object-Oriented Analysis and Design");
        Book book10 = new Book();
        book10.setName("Java: A Beginner's Guide" + "\n");

        System.out.println("This books were written by really cool authors as:");

        Author author1 = new Author();
        author1.getName("Joshua Bloch");
        Author author2 = new Author();
        author2.getName("Robert C. Martin");
        Author author3 = new Author();
        author3.getName("Brian Goetz's");
        Author author4 = new Author();
        author4.getName("Craig Walls");
        Author author5 = new Author();
        author5.getName("Herbert Schildt");
    }
}
