package com.example.onemoretimejava.arrays;

public class MaxItemInRangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 17, 1, 5, 4, 44, 55, 33, 76, 34};
        maxItemInRange(arr, 2, 9);
    }

    public static void maxItemInRange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
    }

}
