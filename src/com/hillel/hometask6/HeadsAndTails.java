package com.hillel.hometask6;
import com.hillel.Utils.GetRandom;

public class HeadsAndTails {

    public static void main(String[] args) {
        int eagle = 0;
        int tale = 0;
        for (int i = 1; i <= 2000; i++) {
            int randomness = GetRandom.getRandom(0, 1);
            if (randomness == 0) {
                tale++;
            } else {
                eagle++;
            }
        }
                System.out.println("With 2000 coin flips, tails fell: " + tale +" times, "+" eagle fell: " + eagle + " times");
    }
}
