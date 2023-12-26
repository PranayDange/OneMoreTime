package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] indices = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(indices);
    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ansArr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ansArr[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(ansArr[i]));
        }
        return ansArr;
    }
}
