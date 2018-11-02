package com.hillel.hometask5;

public class SeasonsFor {
    public static int month(int x){
        for (int i = 1; i <= 12; i++);
        return x;
    }


    public static void main(String[] args) {
        int x = month(12);
        if (3 <= x && x <= 5){
        System.out.println(" Spring ");
        }else if (6 <= x && x <= 8){
            System.out.println(" Summer ");
        }else if (9 <= x && x <= 11){
            System.out.println(" Outumn ");
        }else{
            System.out.println(" Winter ");
        }
    }
}
