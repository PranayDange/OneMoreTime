package com.example.onemoretimejava.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        // Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
        // Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        // Input: matrix = [[7,8],[1,2]]


        int[][] mat = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        luckyNumbers(mat);

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> forMinInRows = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        //int minInRow = 0;
        for (int i = 0; i < n; i++) {
            int minInRow = matrix[i][0];//assuming
            int colIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                //  minInRow = Math.min(minInRow, matrix[i][j]);
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    colIndex = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < n; k++) {
               /* if (matrix[k][matrix[i].length - 1 - i] > minInRow) {
                    isLucky = false;
                    break;
                }*/
                /*if (matrix[k][getIndex(matrix, minInRow)] > minInRow) {
                    isLucky = false;
                    break;
                }*/
                if (matrix[k][colIndex] > minInRow) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                list.add(minInRow);
            }
            forMinInRows.add(minInRow);
        }
        System.out.println(forMinInRows);
        System.out.println(list);
        return list;
    }

}
