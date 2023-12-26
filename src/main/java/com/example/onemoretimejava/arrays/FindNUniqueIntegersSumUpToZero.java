package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 2;
        sumZero(n);
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            arr[i] = i + 1;
            sum = sum + arr[i];
        }
        arr[n - 1] = -sum;
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}