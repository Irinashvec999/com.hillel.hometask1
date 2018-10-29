package com.hillel.hometask4;

public class Converter {
    public static double Conversion(long x, long y) {
        long n = x * 100 + y;// swap from hryvnia to kopeyka
        double z = (double)n / 2830D; // currency conversion
        return z;
    }
   }
