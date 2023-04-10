package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    // Input: nums = [0,2,1,5,3,4]
    // Output: [0,1,2,4,5,3]

   // Input: nums = [5,0,1,2,3,4]
   // Output: [4,5,0,1,2,3]
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
         buildArray(nums);
      //  buildArrayWay2(nums);

    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }


    public static void buildArrayWay2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
           // System.out.print(nums[i] + " " + " abs");
        }

        for (int i = 0; i < n; i++) {
            nums[i] /= n;
            System.out.print(nums[i] + " ");
        }
        /*This optimized method has the same time complexity as the original method (O(n)),
                but it uses less memory since it doesn't create a new array.*/


    }
}
