package com.example.leetcode150.arrayandstring;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums,3);
    }

    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;

        // Get the effective number of rotations:
        d = n - d;
        reverse(arr, 0, d - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("aaaa");

        //step 2:
        reverse(arr, d, n - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("bbbb");

        //step 3:
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("cccc");


    }

    static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
