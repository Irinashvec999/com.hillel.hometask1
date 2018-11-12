package com.hillel.hometask9;

public class ReplacedArrIndex {

    public static void main(String[] args) {
        char[]  chArr =  {'r','o','l','o','c'};
        char firstNum = chArr[0];
        chArr[0] = chArr[chArr.length-1];
        chArr[chArr.length-1] = firstNum;
        System.out.println(chArr);
    }
}

