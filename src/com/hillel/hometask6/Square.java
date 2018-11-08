package com.hillel.hometask6;


public class Square {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (row == column) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}


