package com.hillel.hometask2;

public class Starter {
    public static void main(String[] args) {
        double w = Calculator.exercise1(2D,4D,6D);
        System.out.println(" a + b * ( c / 2 ) =" + w);
        double x = Calculator.exercise2(4D,3D);
        System.out.println(" ( a^2 + b^2 ) % 2 =" + x);
        double y = Calculator.exercise3(2D,4D,6D);
        System.out.println("( a + b ) / 12 * c % 4 + b =" + y);
        double z = Calculator.exercise4(-7D,4.5,4D);
        System.out.println(" (a - b * c ) / ( a + b ) % c =" + z);
    }
}
