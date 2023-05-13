package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
       /* Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [[1,4,7],[2,5,8],[3,6,9]]*/
        // int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //or
        //are same
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(matrix);

    }

    static int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] ans = new int[numCols][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(ans));
        return ans;

    }
}
