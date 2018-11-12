package com.hillel.hometask7;

public class MinMaxDoubleMain {
    public static void main(String[] args) {
        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double minNum = MinMaxDouble.getMin(aDoubleNums);
        double maxNum = MinMaxDouble.getMax(aDoubleNums);
        System.out.println("Minimum number in array: " + minNum + "\n" + "Maximum number in array: " + maxNum);
    }
}

