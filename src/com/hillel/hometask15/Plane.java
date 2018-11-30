package com.hillel.hometask15;

public class Plane extends Vehicle {
    private String flying;

    public Plane(String mechanism) {
        super(mechanism);
    }

    public void tipeSelection(int takeOffWeight){
        if (takeOffWeight > 136){
            System.out.println("Plane is heavy lift fixed-wing aircraft");
        }else if (takeOffWeight <= 136 && takeOffWeight >= 7){
            System.out.println("Plane is medium lift fixed-wing aircraft");
        }else if (takeOffWeight < 7){
            System.out.println("Plane is light lift fixed-wing aircraft");
        }
    }
}
