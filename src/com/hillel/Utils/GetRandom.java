package com.hillel.Utils;

public class GetRandom {
    public static int getRandom (int min, int max){
        int r = (int)(Math.random()*(max-min +1))+min;
        return r;
    }
}
