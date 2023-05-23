package com.example.onemoretime.searching.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 19},
                {17, 41}
        };
        int target = 41;
        int[] ans = searchTarget(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchTarget(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};

    }
}
