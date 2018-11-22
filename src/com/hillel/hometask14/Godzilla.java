package com.hillel.hometask14;

public class Godzilla {
    private int stomachCapacity = 100;


    public int eatingPeople(int volumeEaten){
        int firstStomachCapacity = stomachCapacity;
        stomachCapacity = stomachCapacity - volumeEaten;

        if (stomachCapacity <= 10*firstStomachCapacity/100){
            System.out.println("Godzilla doesn't hungry already. It can't eating more");
        }else {
            System.out.println("Godzilla wants eating people");
        }
        return volumeEaten;
    }
}
