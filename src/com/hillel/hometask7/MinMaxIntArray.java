package com.hillel.hometask7;

public class MinMaxIntArray {
    public static void main(String[] args) {
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};
        int len = aIntNums.length;
        int[] minNum = {0};
        int[] maxNum = {0};
        for (int i = 0; i < len; i++) {
            if (aIntNums[i] < minNum[0]) {
                minNum[0] = aIntNums[i];
            }
            if (aIntNums[i] > maxNum[0]) {
                maxNum[0] = aIntNums[i];
            }
        }
        System.out.println("Minimum number in array: " + minNum[0] + "\n" + "Maximum number in array: " + maxNum[0]);
    }
}
