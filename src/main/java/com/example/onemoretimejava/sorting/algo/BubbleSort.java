package com.example.onemoretimejava.sorting.algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort   //Exchange sort  //sinking sort
        //Worst-case Time Complexity:O(n^2)
        //Best-case Time Complexity:O(n)
        //bubble sort is a stable sorting algorithm
        //Stable sorting means -- order should be same when values are same
        //order is maintained when values are same


        // int[] arr = {5, 4, 3, 2, 1};
        // int[] arr = {1, 2, 3, 4, 5};
        //int[] arr = {1, 2, 3, 5, 4};
        int[] arr = {4,5,6,7,8,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {
        int n= arr.length;
        System.out.println(n);
        boolean swapped;
        //run for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each steps max item will come at the last resp index
            for (int j = 1; j < arr.length - i; j++) {
                //or
                // for (int j = 1; j <= arr.length-1-1 ; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if you do not swap for a particular value of i it means the array is sorted hence stop the program
            if (!swapped) {//!swapped =true
                break;
            }

        }
    }
}
