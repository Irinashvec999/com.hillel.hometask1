package com.hillel.hometask6;
import com.hillel.Utils.OddNumber;

public class UnevenNum {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int defNum = OddNumber.number(i);
                if (defNum==1){
                    defNum=i;
                System.out.println(defNum);
            }
        }
    }
}
