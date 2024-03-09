package com.example.onemoretimejava.sorting.algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertionSortt(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSortt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // for (int i = 0; i <= arr.length-2 ; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapArray(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
