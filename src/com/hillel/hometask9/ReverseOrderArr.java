package com.hillel.hometask9;

public class ReverseOrderArr {
    public static void main(String[] args) {
        int[] a = {15, 25, 16, 30, 45, 78};
        int lastInd = a.length;

        for (int i = 0; i < lastInd / 2; i++) {
            int newPlace = a[lastInd - i - 1];
            a[lastInd - i - 1] = a[i];
            a[i] = newPlace;

        }
        for (int i = 0; i < lastInd; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
