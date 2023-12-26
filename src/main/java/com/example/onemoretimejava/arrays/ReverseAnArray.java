package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void reverse2DArray(int[][] arr) {
        int len = arr.length;
        ;
        //  int[][] resArr=new int[len][];
        for (int i = 0; i < len; i++) {
            int rowLength = arr[i].length;

            for (int j = 0; j < rowLength / 2; j++) {
                int temp = arr[i][j];
                // arr[i][j] = arr[i][arr[i].length - 1 - j];
                arr[i][j] = arr[i][rowLength - 1 - j];
                arr[i][rowLength - 1 - j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
