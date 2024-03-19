package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        // int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(maximumProduct(nums));
    }

   /* public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

    }*/


    //bruteforce
    public static int maximumProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int product = nums[i] * nums[j] * nums[k];
                    maxProduct = Math.max(maxProduct, product);
                    //or
                    /*if (product > maxProduct) {
                        maxProduct = product;
                    }*/
                }
            }
        }
        return maxProduct;
    }

    //temp solution
    public static int maximumProduct1(int[] nums) {
        int ans = 1;
        for (int i = nums.length - 3; i < nums.length; i++) {
            ans = ans * nums[i];
        }
        return ans;
    }

}
