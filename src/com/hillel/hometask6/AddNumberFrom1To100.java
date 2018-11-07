package com.hillel.hometask6;

import com.hillel.Utils.AddNumber;

public class AddNumberFrom1To100 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
           int defNum = AddNumber.Number(i);
                if (defNum==1){
                    defNum=i;
                System.out.println(defNum);
            }
        }
    }
}
