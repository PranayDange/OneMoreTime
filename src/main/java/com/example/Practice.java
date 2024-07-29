package com.example;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int num = 3;
        shuffle(arr, num);
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];

        }
        return arr;
    }
}
