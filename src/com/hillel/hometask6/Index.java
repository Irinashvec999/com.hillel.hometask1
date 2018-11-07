package com.hillel.hometask6;

public class Index {
    public static void main(String[] args) {
        String inStr = "Одесса мой город родной";
        int indFirst = inStr.indexOf("о"); // 8
        int indLast = inStr.lastIndexOf("о");

        for (int i = indFirst; i <= indLast; i++) {
            char i1 = inStr.charAt(i);
            if (i1 == 'о') {
                    System.out.print(inStr.indexOf("о",i) + " ");

            }
        }
    }
}





