package com.example.onemoretimejava.search.linear;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        System.out.println(search(arr, target));
        System.out.println(Arrays.toString(searchArrayIndex(arr, target)));
    }

    static boolean search(int[][] arr, int target) {
        int ans = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //return array index if found
    static int[] searchArrayIndex(int[][] arr, int target) {
        int ans = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
