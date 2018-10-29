package com.hillel.hometask4;

public class Number {
    public static int Numbers (int x, int y, int z){
        int n = x%10 + y%10 + z%10;
        return n;
    }
    public static void main(String[] args){
       int result = Numbers(2,8,6);
        System.out.println(result);
    }

}
