package com.hillel.hometask4;

public class MainEquation {
    public static void main (String[] args){
       double D = SquareEquation.Discriminant(3,14,5);
        double C1 = SquareEquation.Condition1(3,14, 5);
        double C11 = SquareEquation.Condition11(3,14, 5);
        double C2 = SquareEquation.Condition2(3,14);
        if (D>0){
            System.out.println( " X1 =" + C1 + " ; X2 = " + C11);
        }
        if (D==0){
            System.out.println(" X = " + C2);
        }
        else {
            System.out.println("The equation has no radix!");
        }
    }
}
