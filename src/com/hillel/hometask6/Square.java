package com.hillel.hometask6;

import com.hillel.Utils.GetRandom;

public class Square {
    public static void main(String[] args) {
        for (int row=0; row < 5; row++){
            for (int column=0; column < 5; column++){
                System.out.print(GetRandom.getRandom(0,1) + " ");
            } System.out.println();
        }
    }
}
