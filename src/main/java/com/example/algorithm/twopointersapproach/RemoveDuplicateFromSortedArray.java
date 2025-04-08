package com.example.algorithm.twopointersapproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        // int[] arr = {0, 1, 0, 3, 12};

        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int[] uniqueArray = removeDuplicatesAndReturnArray(nums);

        System.out.println(Arrays.toString(uniqueArray));
    }

    static int[] removeDuplicatesAndReturnArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, index);
    }
}
