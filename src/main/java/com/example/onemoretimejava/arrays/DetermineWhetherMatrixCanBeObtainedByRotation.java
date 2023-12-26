package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
       /* Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
        Output: true*/
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        // int[][] abc = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //rotate90DegreesClockwise(abc); //for array rotation clockwise to 90 degree
        findRotation(mat, target);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int rotation = 0; rotation < 4; rotation++) {
           // if (Arrays.deepEquals(mat, target)) {
            if (checkMatrixAreEqual(mat, target)) {
                return true;
            }
            mat = rotate90DegreesClockwise(mat);
        }

        return false;
    }
    //method for rotating matrix

    public static int[][] rotate90DegreesClockwise(int[][] mat) {
        int rows = mat.length;
        //int col=mat[0].length;
        int[][] rotatedArr = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                rotatedArr[j][rows - 1 - i] = mat[i][j];
            }
        }
        //System.out.println(Arrays.toString(rotatedArr));
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.println(Arrays.toString(rotatedArr[i]));
        }
        return rotatedArr;
    }

    //  [[I@7ad041f3, [I@251a69d7]
    //method to check matrix are equal
    public static boolean checkMatrixAreEqual(int[][] mat1, int[][] mat2) {
        //for edge case
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            return false;
        }

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
