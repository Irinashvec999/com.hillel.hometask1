package com.hillel.hometask8;

public class ArithProg {
    public static void main(String[] args) {
        int firstNum = 1;
        int residual = 2;
        int quantity = 4;
        System.out.println(firstNum);
            for (int i = 1; i < quantity; i++) {
                int nextNum = firstNum + residual*i;
                System.out.println( nextNum );
            }
        }
    }

