package com.example.onemoretime.arraysk;

import jnr.ffi.annotations.In;

public class ArraySum2d {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 2, 1}, {3, 2, 1, 2}};
        maximumWealth(array);
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
        return max;
    }
}
