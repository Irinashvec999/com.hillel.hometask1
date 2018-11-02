package com.hillel.hometask5;

public class SeasonsFor {
       public static void main(String[] args) {
        int x = 12;
        if (3 <= x && x <= 5){
        System.out.println(" Spring ");
        }else if (6 <= x && x <= 8){
            System.out.println(" Summer ");
        }else if (9 <= x && x <= 11){
            System.out.println(" Outumn ");
        }else if (x==12 && x==1 && x==2){
            System.out.println(" Winter ");
        }else {
            System.out.println(" There is no such season of the year");
        }
    }
}
