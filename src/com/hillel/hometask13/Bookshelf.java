package com.hillel.hometask13;

import java.util.Arrays;

public class Bookshelf {
    private static int totalCount = 4;
    private static int counterBooks;
    private int counter;
    private static Book[] arrBooks = new Book[totalCount];

    // for excluding error "null pointer exception" filling array some values
    public Bookshelf() {
        Book fillValues = new Book("Filling values",100,new Author("Fill",1960));
        Arrays.fill(arrBooks, fillValues);
    }


    public void add(Book book) {
        for (Book b:arrBooks) {
            if (book.equals(b)) {
                return;
            } else {
                arrBooks[counter] = book;
            }
        }
        counter++;
        counterBooks++;
    }

    public int getCounterBooks() {
        return counterBooks;
    }
    public static int getTotalCounterBooks(Bookshelf bookshelf1,Bookshelf bookshelf2,Bookshelf bookshelf3){
        int totalCounterBooks = bookshelf1.getCounterBooks() + bookshelf2.getCounterBooks() + bookshelf3.getCounterBooks();
        return totalCounterBooks;
    }

    public static void showAllBooks(Bookshelf bookshelf) {
        for (int i = 0; i <= counterBooks ; i++) {
            String author = arrBooks[i].getAuthor().getName();
            String nameBook = arrBooks[i].getNameBook();
            System.out.printf("%s - %s \n", nameBook, author);
        }
    }
}
