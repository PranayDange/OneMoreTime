package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
       /* Input:
        mat = [[1, 2],[3, 4]],r = 1, c = 4
        Output: [[1, 2, 3, 4]]


        Input:
        mat = [[1, 2],[3, 4]],r = 2, c = 4
        Output: [[1, 2],[3, 4]]*/

        int[][] mat = {{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;
        matrixReshape(mat, r, c);
    }


    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMatrix = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[r].length; j++) {
                newMatrix[i][j] = mat[i][j];

            }
        }
        System.out.println(Arrays.deepToString(newMatrix));
        return newMatrix;
    }
}
