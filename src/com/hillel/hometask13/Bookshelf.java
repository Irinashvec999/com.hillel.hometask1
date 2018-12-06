package com.hillel.hometask13;

public class Bookshelf {
    private static int counter;
    private static Book[] arrBooks = new Book[10];

    public void add(Book book) {

        for (Book b:arrBooks) {
            if (book.equals(b)) {
                return;
            }else {
                arrBooks[counter] = book;
            }
        }
        counter++;

    }


    public static void showAllBooks() {
        for (Book b : arrBooks) {
            String author = b.getAuthor().getName();
            String nameBook = b.getNameBook();
            System.out.printf("%s - %s \n", nameBook, author);
        }
    }
}
