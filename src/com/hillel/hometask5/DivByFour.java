package com.hillel.hometask5;

public class DivByFour {
    public static long bitDivByFour(long x, long y) {
        long result = x >> y;
        return result;
    }

    public static void main(String[] args) {
        System.out.println( bitDivByFour(100,2));
    }
}
