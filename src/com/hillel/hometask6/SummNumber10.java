package com.hillel.hometask6;

import com.hillel.Utils.GetRandom;

public class SummNumber10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int number = GetRandom.getRandom(-10,9);
            sum= number;
        }
        System.out.println(sum);
    }
}