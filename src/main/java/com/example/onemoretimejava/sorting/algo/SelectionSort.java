package com.example.onemoretimejava.sorting.algo;

import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args) {
        //  int[] arr = {4, 5, 6, 7, 8, 4, 5};
         int[] arr = {3, 1, 5, 4, 2};
        // int[] arr = {1};
        //int[] arr = {1, 2, 3, 4, 5};
       // int[] arr = {};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swapArray(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
