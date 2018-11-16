package com.hillel.hometask11;

import com.hillel.Utils.MathUtil;


public class PasswordGenerator {

    public static void main(String[] args) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char symbol = 0;
        int maxLength = 8;

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < maxLength; j++) {
                j = MathUtil.getRandom(0, 62);
                char x = symbols.charAt(j);
                symbol = x;
            }
            System.out.print(symbol);
        }
    }
}
