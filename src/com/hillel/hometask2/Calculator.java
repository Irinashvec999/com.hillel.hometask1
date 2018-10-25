package com.hillel.hometask2;

public class Calculator {
    public static double exercise1(double a, double b, double c) {
        double result = a + b * ( c / 2 );
        return result; }

    public static double exercise2(double a, double b) {
        double result = ( Math.pow(a,2) + Math.pow(b,2) ) % 2;
        return result; }

    public static double exercise3(double a, double b, double c) {
        double result = ( a + b ) / 12 * c % 4 + b;
        return result; }

    public static double exercise4(double a, double b, double c) {
        double result = (a - b * c ) / ( a + b ) % c;
        return result; }
}
