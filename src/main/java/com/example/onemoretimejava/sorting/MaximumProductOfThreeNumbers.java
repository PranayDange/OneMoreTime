package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3};
        // int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // System.out.println(maximumProduct(nums));
        //System.out.println(maximumProduct2(nums));
        System.out.println(Arrays.toString(maximumProduct2ve(nums)));
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

    public static int[] maximumProduct2ve(int[] nums) {
      /*  for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1; // Convert negative number to positive
            }
        }*/
        Arrays.sort(nums);
        return nums;
    }

    //temp solution
    public static int maximumProduct2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] *= -1; // Convert negative number to positive
            }
        }


        int ans = 1;
        Arrays.sort(nums);


        for (int i = nums.length - 1; i >= nums.length - 3; i--) {
            ans *= nums[i];
        }
        return ans;
    }

}
