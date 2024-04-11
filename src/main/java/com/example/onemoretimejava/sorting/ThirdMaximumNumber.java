package com.example.onemoretimejava.sorting;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4, 5, 6,6,8,9,7,12};
        System.out.println(thirdMax(nums));
        System.out.println(thirdMaxxx(nums));
    }

    /* Given an integer array nums, return the third distinct maximum number in this array.
     If the third maximum does not exist, return the maximum number.



             Example 1:

     Input: nums = [3,2,1]
     Output: 1
     Explanation:
     The first distinct maximum is 3.
     The second distinct maximum is 2.
     The third distinct maximum is 1.


     Example 2:

     Input: nums = [1,2]
     Output: 2
     Explanation:
     The first distinct maximum is 2.
     The second distinct maximum is 1.
     The third distinct maximum does not exist, so the maximum (2) is returned instead.
     Example 3:

     Input: nums = [2,2,3,1]
     Output: 1
     Explanation:
     The first distinct maximum is 3.
     The second distinct maximum is 2 (both 2's are counted together since they have the same value).
     The third distinct maximum is 1.
 */
    public static int thirdMax(int[] nums) {
        // int maxElement = nums[0];
        // int maxElement = Integer.MIN_VALUE;
            int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;

            } else if (num > thirdMax && num != firstMax && num != secondMax) {
                thirdMax = num;
            }
        }
        //System.out.println(maxElement);
        int result = Math.max(firstMax, thirdMax);
        //  int result = (thirdMax != Integer.MIN_VALUE) ? thirdMax : firstMax;

        return result;
    }

    //this is the soultion for third max element
    public static int thirdMaxxx(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != firstMax && num != secondMax) {
                thirdMax = num;
            }
        }

        if (thirdMax != Integer.MIN_VALUE) {
            return thirdMax;
        } else {
            return firstMax; // If there are less than three elements, return the maximum element
        }
    }

}
