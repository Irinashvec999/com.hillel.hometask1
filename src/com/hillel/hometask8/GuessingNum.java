package com.hillel.hometask8;

import com.hillel.Utils.MathUtil;

public class GuessingNum {
    public static void main(String[] args) {

        int randomNam = MathUtil.getRandom(1, 10);
        int e = 0;
        System.out.println("Try to guess the number from 1 to 10: ");
        for (int i = 0; ;i++) {
            do {
                int enterNum = MathUtil.getInputNumb();
                if (enterNum < randomNam) {
                    System.out.println("Your number is smaller. Try again!");
                } else if (enterNum > randomNam) {
                    System.out.println("Your number is bigger. Try again!");
                } else {
                    System.out.println("You guess!!!");
                }
                e = enterNum;
            }
            while (e == randomNam);
        }
    }
}
