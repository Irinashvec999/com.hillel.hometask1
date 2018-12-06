package com.hillel.hometask7;

public class MinMaxInt {
    public static int getMin(int [] aIntNums) {
        int len = aIntNums.length;
        int[] minNum = {0};
        for (int i = 0; i < len; i++) {
            if (aIntNums[i] < minNum[0]) {
                minNum[0] = aIntNums[i];
            }
        }
        return minNum[0];
    }
    public static int getMax(int [] aIntNums) {
        int len = aIntNums.length;
        int[] maxNum = {0};
        for (int i = 0; i < len; i++) {
            if (aIntNums[i] > maxNum[0]) {
                maxNum[0] = aIntNums[i];
            }
        }
        return maxNum[0];
    }
}
