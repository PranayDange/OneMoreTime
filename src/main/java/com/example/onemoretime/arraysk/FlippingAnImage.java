package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        // Output: [[1,0,0],[0,1,0],[1,1,1]]
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ;
        System.out.println(Arrays.deepToString(flipAndInvertImage(array)));

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        // int[][] flipImage=new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int temp = image[row][col] ;
                image[row][col] = image[row][n - col - 1];
                image[row][n - col - 2] = temp;
            }
        }
        // System.out.println();
        return image;
    }

    /*public static int[][] flipAndInvertImage(int[][] image) {
        // int[][] flipImage = new int[][];
         int[][] flipImage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int num=0;
            for (int j = image[0].length-1; j >0; --j) {
                flipImage[i][num] = 1-image[i][j];
                num++;
            }
            num=0;

        }
        //System.out.println(Arrays.deepToString(image));
        return flipImage;


    }*/
}
