package com.hillel.hometask4;

public class Converter {
    public static double Conversion(long x, long y) {
        long n = x * 100 + y;// swap from hryvnia to kopeyka
        double z = (double)n / 2830D; // currency conversion
        return z;
    }

    public static void main(String [] args){
        double result = Converter.Conversion(260,82);
        long Integer;
        double Fractionalpart;
        Integer = (long) result;
        Fractionalpart = ((double)result - Integer)*100;
        System.out.println("You can buy " + Integer + " dollars and " + (long)Fractionalpart + " penny" );
    }
}
