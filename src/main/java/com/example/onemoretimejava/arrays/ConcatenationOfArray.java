package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        /*Input: nums = [1,2,1]
        Output: [1,2,1,1,2,1]*/
        int[] arr = {1, 2, 1};
        getConcatenation(arr);
    }

    static int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
            newArr[i + n] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
