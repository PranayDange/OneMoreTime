package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
       /* Input: mat = [[1,2],[3,4]], r = 1, c = 4
        Output: [[1,2,3,4]]*/
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        matrixReshape(mat, r, c);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newArr = new int[r][c];
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newArr[i][j] = mat[i][j];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr));
        }
        return newArr;
    }

}
