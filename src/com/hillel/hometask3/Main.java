package com.hillel.hometask3;

public class Main {
    public static void main (String[] args){
       int result = Evennes.parity(101);

       if (result==0){
            System.out.println("You entered an even number");
        } else {
            System.out.println( "You entered an add number");
        }
    }
}
