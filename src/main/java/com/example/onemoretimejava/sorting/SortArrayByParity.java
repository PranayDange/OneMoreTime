package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[evenIndex] = nums[i];
                evenIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[oddIndex] = nums[i];
                oddIndex--;
            }
        }
        return result;
    }


}
