package com.hillel.hometask7;

public class MinMaxDouble {
    public static double getMin(double[] aDoubleNums) {
        double len = aDoubleNums.length;
        double[] minNum = {0};
        for (int i = 0; i < len; i++) {
            if (aDoubleNums[i] < minNum[0]) {
                minNum[0] = aDoubleNums[i];
            }
        }
        return minNum[0];
    }

    public static double getMax(double[] aDoubleNums) {
        double len = aDoubleNums.length;
        double[] maxNum = {0};
        for (int i = 0; i < len; i++) {
            if (aDoubleNums[i] > maxNum[0]) {
                maxNum[0] = aDoubleNums[i];
            }
        }
        return maxNum[0];
    }
}
