package com.hillel.hometask15;

public class Train extends Vehicle {
    private String RailwayDrive;

    public Train(String mechanism) {
        super(mechanism);
    }

    public void tipeSelection(int distance){
        if (distance > 700 ){
            System.out.println( "Train is long-distance");
        }else if (distance >= 150 && distance <= 700){
            System.out.println("Train is local");
        }else if (distance < 150){
            System.out.println("Train is shuttle");
        }
    }
}
