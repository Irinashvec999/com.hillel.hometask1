package com.hillel.hometask9;
public class EvenOddNumOfArray {
    public static int getEvenNum (int []a){
        int evenNum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0){
                evenNum = a[i]+evenNum;
            }
        }
        return evenNum;
    }

    public static int getOddNum (int []a) {
        int oddNum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                oddNum = a[i] + oddNum;
            }
        }return oddNum;
    }

    public static void main(String[] args) {
        int [] a = {15,21,32,100,18,91};
        System.out.println(getEvenNum(a) - getOddNum(a));
    }
}
