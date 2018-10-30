package com.hillel.hometask4;

public class SquareEquation {
    public static double Discriminant (double a, double b, double c) {
        double d = b * b - 4 * a * c;
        return d;
    }
    public static double Condition1(double a, double b, double c){
        double x1 = (-b + Math.pow((b*b-4*a*c),1/2))/(2*a);
        return x1;
}
    public static double Condition11(double a, double b, double c){
        double x2=(-b - Math.pow((b*b-4*a*c),1/2))/(2*a);
        return x2;
}
    public static double Condition2(double a, double b){
        double x3 = (-b)/2*a;
        return x3;
    }
}
