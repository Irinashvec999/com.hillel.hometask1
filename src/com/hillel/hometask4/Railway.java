package com.hillel.hometask4;

public class Railway {
    public static int Survivingtime1(int x){
        int t1 = 4000 / x; //how long does the train1 drives 4m
        return t1;
    }
    public static int Survivingtime2 (int y){
        int t2 = 6000 / y;//how long does the train2 drives 6m
        return t2;
}
public static void main(String[] args) {
    int h = Railway.Survivingtime1(50);
    int h2 = Railway.Survivingtime2(50);
    if (h >= h2) {
        System.out.println(" Railway accident!!!");
        } else {
        System.out.println("Yippee! Everyone saved! ");
    }
    }
}
