package com.example.onemoretime.arraysk;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int[] index = {0, 1, 2, 2, 1};
        int[] nums = {0, 1, 2, 3, 4};
        createTargetArray(nums, index);


    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ansArr = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            ansArr.add(index[i], nums[i]);
        }
        int target[] = new int[ansArr.size()];
        for (int i = 0; i < ansArr.size(); i++) {
            target[i] = ansArr.get(i);
        }
        System.out.println(Arrays.toString(target));
        return target;

    }


}

