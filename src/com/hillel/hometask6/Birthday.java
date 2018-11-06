package com.hillel.hometask6;

import com.hillel.Utils.GetNumber;

public class Birthday {
    public static void main(String[] args) {
        System.out.println("Please, enter your year of birth: " );
        int year = GetNumber.getInputNumb();
        int age = 2018- year;
        System.out.println("Your age: " + age);

    }
}
