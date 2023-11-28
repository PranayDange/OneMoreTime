package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
      /*  Input: nums = [0,2,1,5,3,4]
        Output: [0,1,2,4,5,3]*/
        int[] arr = {0, 2, 1, 5, 3, 4};
        buildArray(arr);
    }

    static int[] buildArray(int[] arrNums) {
        int n = arrNums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arrNums[arrNums[i]];
        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
