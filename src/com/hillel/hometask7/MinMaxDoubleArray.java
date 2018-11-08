package com.hillel.hometask7;

public class MinMaxDoubleArray {
    public static void main(String[] args) {
        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double len = aDoubleNums.length;
        double[] minNum = {0};
        double[] maxNum = {0};
        for (int i = 0; i < len; i++) {
            if (aDoubleNums[i] < minNum[0]) {
                minNum[0] = aDoubleNums[i];
            }
            if (aDoubleNums[i] > maxNum[0]) {
                maxNum[0] = aDoubleNums[i];
            }
        }
        System.out.println("Minimum number in array: " + minNum[0] + "\n" + "Maximum number in array: " + maxNum[0]);
    }
}

