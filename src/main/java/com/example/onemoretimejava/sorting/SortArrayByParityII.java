package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 ) {
                result[evenIndex] = nums[i];
                evenIndex+=2;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 ) {
                result[oddIndex] = nums[i];
                oddIndex-=2;
            }
        }
        return result;
    }
}
