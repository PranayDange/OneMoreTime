package com.example.onemoretime.arraysk;

public class TwoDMatrixPrinting {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[2][j] + " ");//o/p = 123
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            //if (matrix[i].length > 0) {
                System.out.print(matrix[i][0]);
            //}
        }
    }
}
