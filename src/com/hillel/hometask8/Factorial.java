package com.hillel.hometask8;

public class Factorial {
    public static int number (int x){
        return x;
    }

    public static void main(String[] args) {
        int num = number(5);
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
