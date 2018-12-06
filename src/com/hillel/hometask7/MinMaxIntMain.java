package com.hillel.hometask7;

public class MinMaxIntMain {
    public static void main(String[] args) {
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};
        int minNum = MinMaxInt.getMin(aIntNums);
        int maxNum = MinMaxInt.getMax(aIntNums);
        System.out.println("Minimum number in array: " + minNum + "\n" + "Maximum number in array: " + maxNum);
    }
}
