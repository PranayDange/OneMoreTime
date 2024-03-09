package com.example.onemoretimejava.sorting.algo;

import java.util.Arrays;

public class CyclicSort {
    //it has to be continuous array
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        //int[] arr = {3, 54, 12, 111, 49};//this will give error as cyclic sort can be implemented in continuous manner
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swapArray(arr, i, correctIndex);
            } else {
                i++;
            }

        }
    }

    static void swapArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
