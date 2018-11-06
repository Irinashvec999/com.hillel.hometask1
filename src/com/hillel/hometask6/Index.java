package com.hillel.hometask6;

public class Index {
    public static void main(String[] args) {
        String inStr = "Одесса мой город родной";
        int len = inStr.length();
        int indexO = inStr.indexOf("о"); // 8
        char f = inStr.charAt(indexO); // o

        for (indexO = 0; indexO <= len; indexO++) {
            int lookForInd = inStr.indexOf(f, indexO + 1);//looking for "o" from 8
            System.out.print(lookForInd + " ");
        }
    }
}

