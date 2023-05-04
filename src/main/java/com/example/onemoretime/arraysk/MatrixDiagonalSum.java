package com.example.onemoretime.arraysk;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        /*Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
        Output: 25
        Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
        Notice that element mat[1][1] = 5 is counted only once.*/
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));

    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {

            sum += mat[i][i];
            sum += mat[i][mat.length - 1 - i];

        }
        if (mat.length % 2 == 0) {
            return sum;
        } else {
            return sum - mat[mat.length / 2][mat.length / 2];
        }


    }
}
