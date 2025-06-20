package com.example.leetcode150.twopointers;

public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
//Input: numbers = [2,7,11,15], target = 9
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum2(arr, target);
        for (int a : ints) {
            System.out.print(a);
        }
    }

    //brute force approach
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        }
        return arr;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int s = 0;
        int end = numbers.length - 1;
        while (s <= end) {
            int sum = numbers[s] + numbers[end];
            if (sum == target) {
                return new int[]{s + 1, end + 1};
            }
            if (sum < target) {
                s++;
            } else {
                end--;
            }
        }
        return new int[]{};
    }


}
