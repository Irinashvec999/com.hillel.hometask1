package com.hillel.hometask8;

public class ArithProg {
    public static int firstNumber(int f){
        return f;
    }
    public static int residualNumber (int r){
        return r;
    }

    public static int quantityNumber (int q ) {
        return q;
    }
    public static void main(String[] args) {
        int firstNum = firstNumber(1);
        int residual = residualNumber(2);
        int quantity = quantityNumber(4);
        System.out.println(firstNum);

            for (int i = firstNum; i < quantity; i++) {
                int nextNum = firstNum + residual*i;
                System.out.println( nextNum );

            }
        }
    }

