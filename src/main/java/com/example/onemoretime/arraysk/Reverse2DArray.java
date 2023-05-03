package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 0}, {1, 1, 1}, {0, 0, 0}};
       // flipAndInvertImage(array);
        reverseColumns2DArray(array);
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int numRows=image.length;
        int numCols=image[0].length;
        for (int i = 0; i < numRows/2; i++) {
            int[] temp=image[i]  ;
            image[i]=image[numRows-1-i];
            image[numRows-1-i] =temp;

        }
        System.out.println(Arrays.deepToString(image));
       /* for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }*/
        return image;
    }

    public static void reverseColumns2DArray(int[][] arr) {
        int numRows = arr.length;
        int numCols = arr[0].length;

        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows/2 ; i++) {
                int temp = arr[i][j];
                arr[i][j] = arr[numRows - 1 - i][j];
                arr[numRows - 1 - i][j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

}
