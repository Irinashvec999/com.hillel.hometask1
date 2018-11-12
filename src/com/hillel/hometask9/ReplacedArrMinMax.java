package com.hillel.hometask9;

public class ReplacedArrMinMax {
    public static void main(String[] args) {
        double[] arr = {12.5, 25.1, 28.7, 3.4, 60.5, 25.3, 76.1};

        int minIndex = 0;
        double minNum = arr[minIndex];
        int maxIndex = 0;
        double maxNum = arr[maxIndex];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minIndex = i;
            }
            if (arr[i] > maxNum) {
                maxIndex = i;
            }
        }
        double min = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = min;
        for (double e:arr){
            System.out.print(e + ", ");
        }
    }
}
