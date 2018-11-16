package com.hillel.hometask10;
import com.hillel.Utils.Swap;

public class Selection {
    public static void getMin(int[]arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
                minIndex = i;
            for (int j = minIndex + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                Swap.swap(arr, minIndex,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 0, 2, 4, 1};
        getMin(arr);
        show(arr);
    }

    public static void show ( int[] arr){
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }
}
