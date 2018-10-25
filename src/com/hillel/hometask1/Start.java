package com.hillel.hometask1;

public class Start {
    public static void main(String[] args) {
        double a = Calculator.add(5.2, 7.3);
        System.out.println(" x + y =" + a);
        double b = Calculator.sub(100.2, 35.1);
        System.out.println(" x - y =" + b);
        double c = Calculator.div(200.4, 50.1);
        System.out.println("x / y =" + c);
        double d = Calculator.mul(33.6, 3.3);
        System.out.println(" x * y =" + d);
    }
}
