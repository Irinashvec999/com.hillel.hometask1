package com.hillel.hometask12;
import com.hillel.hometask10.Selection;

public class BinarySearch {
    private static final int NUMBER = 8;

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 9, 10, 3, 1, 4, 6};
        Selection.getMin(arr);
        show(arr);
    }

    public static boolean contains(int[] a, int n) {
        int firstElemOfSearch = 0;
        int lastElemOfSearch = a.length;
        int middle = lastElemOfSearch / 2;

        do {
            if (middle < n && n < lastElemOfSearch) {
                firstElemOfSearch = middle;
                middle = (lastElemOfSearch + firstElemOfSearch) / 2;
            } else if (middle > n && n > firstElemOfSearch) {
                lastElemOfSearch = middle;
                middle = (lastElemOfSearch + firstElemOfSearch) / 2;
            }else if (n > lastElemOfSearch || n < firstElemOfSearch){
                return false;
            }
        } while (middle != n);
        return true;
    }

    public static void show ( int[] arr){

        if (contains(arr, NUMBER)){
            System.out.println("Number is present in the array");
        }else {
            System.out.println("Number is absent in the array");
        }
    }
}



