package com.hillel.hometask13;

public class Bookshelf {
    private static final int TOTAL_BOOK_COUNT = 10;
    private static int counter;
    private static Book[] arrBooks = new Book[TOTAL_BOOK_COUNT];

    public void add(Book book) {
        if (counter > TOTAL_BOOK_COUNT) {
            System.out.println("Its impossible to add more than 10 books, bookshelf has already completed");
            return;
        }
        arrBooks[counter] = book;
        counter++;
    }

    public static void showAllBooks() {
        for (Book b : arrBooks) {
            String author = b.getAuthor().getName();
            String nameBook = b.getNameBook();
            int pages = b.getNumberOfPages();
            System.out.printf("%s - %s \n", nameBook, author);
        }
    }
}