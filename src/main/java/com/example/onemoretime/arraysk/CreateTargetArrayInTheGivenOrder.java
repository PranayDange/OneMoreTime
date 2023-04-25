package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        /*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        Output: [0,4,1,3,2]
        Explanation:
        nums       index     target
        0            0        [0]
        1            1        [0,1]
        2            2        [0,1,2]
        3            2        [0,1,3,2]
        4            1        [0,4,1,3,2]*/

        int[] index = {0, 1, 2, 2, 1};
        int[] nums = {0, 1, 2, 3, 4};
        createTargetArray(nums, index);
       // createTargetArray1(nums, index);


    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            for (int j = target.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        System.out.println(Arrays.toString(target));
        return target;
    }


    public static int[] createTargetArray1(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        int[] target = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            target[i] = targetList.get(i);
        }
        System.out.println(Arrays.toString(target));
        return target;
    }



   /* public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        return target.stream().mapToInt(i -> i).toArray();
    }*/

}
