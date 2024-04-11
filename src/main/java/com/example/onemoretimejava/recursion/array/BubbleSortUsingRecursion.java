package com.example.onemoretimejava.recursion.array;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 5, 6};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                //SWAP
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }
}
