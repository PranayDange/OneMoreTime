package com.example.onemoretimejava.arrays;

public class ArrayBasic2D {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        // int[][] arr5 = new int[3][];//num of rows is mandatory not col
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                //  System.out.print("  " + arr1[i][j]);
            }
            System.out.println();
        }

        int[][] arr2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // System.out.print(" " + arr2[i][j]);
            }
            System.out.println();
        }


        int[][] arr3 = {{1, 2, 3, 4},
                {4, 5, 6, 5, 6},
                {7, 8, 9}};
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(" " + arr3[row][col]);
            }
            System.out.println();
        }
    }
}
