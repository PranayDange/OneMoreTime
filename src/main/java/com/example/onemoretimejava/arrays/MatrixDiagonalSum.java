package com.example.onemoretimejava.arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        diagonalSum(matrix);
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
            if (i != n - 1 - i) {
                sum = sum + mat[i][n - 1 - i];
            }

        }
        System.out.println(sum);
        return sum;
    }


}



