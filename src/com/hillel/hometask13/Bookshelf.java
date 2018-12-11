package com.hillel.hometask13;

import java.util.Arrays;

public class Bookshelf {
    private static int totalCount = 4;
    private int counter;
    private static Book[] arrBooks = new Book[totalCount];

    // for excluding error "null pointer exception" filling array some values
    public Bookshelf() {
        Book fillValues = new Book("Filling values",100,new Author("Fill",1960));
        Arrays.fill(arrBooks, fillValues);
    }


    public void add(Book book) {
        for (Book b : arrBooks) {
            if (book == b){
                counter++;
                return;
            }else if (book.equals(b)) {
                arrBooks[counter] = null;
                return;
            }else {
                arrBooks[counter] = book;
            }
        }
        counter++;
    }


    public int getCounter() {
        return counter;
    }
    public static int getTotalCounterBooks(Bookshelf bookshelf1,Bookshelf bookshelf2,Bookshelf bookshelf3){
        int totalCounterBooks = bookshelf1.getCounter() + bookshelf2.getCounter() + bookshelf3.getCounter();
        return totalCounterBooks;
    }

    public static void showAllBooks(Bookshelf bookshelf) {
        for (int i = 0; i <= bookshelf.counter-1 ; i++) {
            String author = arrBooks[i].getAuthor().getName();
            String nameBook = arrBooks[i].getNameBook();
            System.out.printf("%s - %s \n", nameBook, author);
        }
    }
}
