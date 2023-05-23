package com.example.onemoretime.searching.linearsearch;


public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 3},
                {4, 225, 6},
                {7, 8, 9, 19},
                {17, 41, 100}
        };
        System.out.println(maxElement(arr));
    }

    static int maxElement(int[][] arr) {
        //int max = Integer.MIN_VALUE;
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
