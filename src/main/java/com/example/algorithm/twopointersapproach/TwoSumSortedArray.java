package com.example.algorithm.twopointersapproach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 6};
        //int target = 6;
        //System.out.println(Arrays.toString(twoSum(arr, target)));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sorted array
        int target = 10;

        List<int[]> pairs = allPairsTwoSum(arr, target);
        for (int[] pair : pairs) {
            System.out.println("Pair: (" + arr[pair[0]] + ", " + arr[pair[1]] + ")");
        }
    }

    static int[] twoSum(int[] arr, int target) {
        int s = 0, end = arr.length - 1;
        while (s <= end) {
            int sum = arr[s] + arr[end];
            if (sum == target) {
                return new int[]{s, end};
            }
            if (sum < target) {
                s++;
            } else {
                end--;
            }
        }
        return new int[]{};
    }

    //for list of pairs
    static List<int[]> allPairsTwoSum(int[] arr, int target) {
        int s = 0, end = arr.length - 1;
        List<int[]> result = new ArrayList<>();
        while (s < end) {
            int sum = arr[s] + arr[end];
            if (sum == target) {
                result.add(new int[]{s, end});
                s++;
                end--;
            } else if (s < target) {
                s++;
            } else {
                end--;
            }
        }
        return result;
    }
}
