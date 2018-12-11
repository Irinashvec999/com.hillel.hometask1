package com.hillel.hometask15;

public class Vehicle {
    private String tipe;
    private String driver;
    private String mechanism;

    public Vehicle(String mechanism) {
        this.mechanism = mechanism;
    }

    public int isMechanical(int powerEngine){
        if (powerEngine > 50 ){
            System.out.println("Vehicle is mechanical");
        }else if (powerEngine <= 50){
            System.out.println("Vehicle isn't mechanical");
        }
        return powerEngine;
    }
}
