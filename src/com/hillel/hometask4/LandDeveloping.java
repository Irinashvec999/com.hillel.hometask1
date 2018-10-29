package com.hillel.hometask4;

public class LandDeveloping {
    public static double Perimeter(double x, double y ){
        double p = 2 * x + 2 * y;
        return p;}
        public static double Square(double x, double y){
        double s = x * y;
        return s;
    }

    public static void main(String[] args){
       double per = Perimeter(16,8);
        double sq = Square(16,8);
        System.out.println("Necessary " + per + "  meters of fence and " + sq +" square meters of lawn should buy");
    }
}
