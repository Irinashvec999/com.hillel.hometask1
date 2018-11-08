package com.hillel.hometask6;
import com.hillel.Utils.MathUtil;

public class SumOfNum20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int number = MathUtil.getRandom(-20, 20);
            sum= sum+number;
        }
        System.out.println(sum);
    }
}
