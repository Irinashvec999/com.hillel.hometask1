package com.hillel.hometask5;

public class SeasonsSwitch {
    public static int month(int x){
        for (int i = 1; i <= 12; i++);
        return x;
    }


    public static void main(String[] args) {
        int getMonth = month(3);
        switch (getMonth){
            case 3:
            case 4:
            case 5:
                System.out.println(" Spring ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Summer ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Outumn ");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(" Winter ");
                break;
                default:
                    System.out.println( " There is no such season of the year ");
        }
    }
}
