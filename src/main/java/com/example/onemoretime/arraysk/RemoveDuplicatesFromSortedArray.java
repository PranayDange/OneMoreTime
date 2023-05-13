package com.example.onemoretime.arraysk;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
      /*  Input: nums = [1,1,2]
        Output: 2, nums = [1,2,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
                It does not matter what you leave beyond the returned k (hence they are underscores).*/

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);
    }

    static int removeDuplicates(int[] nums) {
        int totalElements = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {

            if (nums[totalElements] != nums[i]) {
                totalElements++;
                nums[totalElements] = nums[i];

                break;
            }

        }


        System.out.println(totalElements + 1);
        return totalElements + 1;
    }
}
