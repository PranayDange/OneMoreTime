package com.example.onemoretime.arraysk;

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        // Input: m = 2, n = 3, indices = [[0,1],[1,1]]
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};
        oddCells(m, n, indices);

    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {

            //row is constant
            for (int j = 0; j < n; j++) {
                ans[indices[i][0]][j]++;
            }

            //column is constant
            for (int j = 0; j < m; j++) {
                ans[j][indices[i][1]]++;
            }

        }
        // Counting ODD numbers in the final Matrix
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
