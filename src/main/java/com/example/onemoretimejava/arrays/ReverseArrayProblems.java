package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class ReverseArrayProblems {
    public static void main(String[] args) {
        int[] arr = {56, 23, 8, 42, 17, 9, 34, 12, 67, 5, 28, 51, 19, 73, 2, 48, 14, 37, 62, 3};
        int[][] arr2D = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        rever1dArray(arr);
        System.out.println();

    }

    public static void rever1dArray(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; --i) {
            System.out.println(nums[i]);
        }
    }
}

   /* public static void reverse1dArrayUsingSwap(int[] nums) {


    }*/
