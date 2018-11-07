package com.hillel.Utils;

import java.util.Scanner;

public class MathUtil {
    public static int getInputNumb() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int getRandom(int min, int max) {
        int r = (int) (Math.random() * (max - min + 1)) + min;
        return r;
    }
}
