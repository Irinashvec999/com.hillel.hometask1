package com.hillel.hometask11;
import com.hillel.Utils.MathUtil;

import java.util.Arrays;


public class PasswordGenerator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String UNDERSCORE = "_";

    public static void main(String[] args) {
        char [] password = new char[]{findRandomUpper(),findRandomLower(),findRandomDigits(),findUnderscore(),findRandomLower(),findRandomUpper(),findRandomDigits(),findRandomUpper()};
//Let's doing password unique
        int counter = 0;
        for (int rand = 0; rand < password.length; rand++) {
            rand = MathUtil.getRandom(0,password.length-1);
            if (isUnique (rand,password)){
                password[counter]= password[rand];
                counter++;
            }
        }
        System.out.println(password);
    }

    public static boolean isUnique(int rand, char[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == rand){
                return false;
            }
        }
        return true;
    }


    public static char findRandomUpper() {
        int randomUpper = MathUtil.getRandom(0, UPPER.length()-1);
        char upperSymbol = UPPER.charAt(randomUpper);
        return upperSymbol;
    }

    public static char findRandomLower() {
        int randomLower = MathUtil.getRandom(0, LOWER.length()-1);
        char lowerSymbol = LOWER.charAt(randomLower);
        return lowerSymbol;
    }

    public static char findRandomDigits() {
        int randomDigits = MathUtil.getRandom(0, DIGITS.length()-1);
        char digits = DIGITS.charAt(randomDigits);
        return digits;
    }

    public static char findUnderscore() {
        char underscore = UNDERSCORE.charAt(0);
        return underscore;
    }



}
