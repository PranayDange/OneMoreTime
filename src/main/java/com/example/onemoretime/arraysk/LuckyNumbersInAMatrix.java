package com.example.onemoretime.arraysk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
     /*   Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        Output: [15]
        Explanation: 15 is the only lucky number since
        it is the minimum in its row and the maximum in its column.*/
        int[][] mat = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        luckyNumbers(mat);


    }

    static List<Integer> luckyNumbers(int[][] matrix) {


        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find the minimum value in each row
        int[] minInRow = new int[rows];
        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            minInRow[i] = min;
        }
        System.out.println(Arrays.toString(minInRow));

        // Find the maximum value in each column
        int[] maxInCol = new int[cols];
        for (int j = 0; j < cols; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxInCol[j] = max;
        }
        System.out.println(Arrays.toString(maxInCol));


        // Find the intersection of the minInRow and maxInCol arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}



