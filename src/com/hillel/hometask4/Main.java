package com.hillel.hometask4;

public class Main {
    public static void main(String [] args){
        double result = Converter.Conversion(260,82);
        long Integer;
        double Fractionalpart;
        Integer = (long) result;
        Fractionalpart = ((double)result - Integer)*100;
        System.out.println("You can buy " + Integer + " dollars and " + (long)Fractionalpart + " penny" );
    }
}
