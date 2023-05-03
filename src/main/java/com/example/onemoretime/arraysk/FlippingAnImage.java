package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        // Input: image = [[1,1,0],[1,0,1],[0,0,0]]
        // Output: [[1,0,0],[0,1,0],[1,1,1]]
        int[][] array = {{1, 1, 0,1}, {1, 1,0,1}, {1,0, 0, 0}};
       ;
        System.out.println(Arrays.deepToString( flipAndInvertImage(array)));

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        // int[][] flipImage = new int[][];
         int[][] flipImage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int num=0;
            for (int j = image[0].length-1; j >0; --j) {
                flipImage[i][num] = image[i][j];
                num++;
            }
            num=0;

        }
        //System.out.println(Arrays.deepToString(image));
        return flipImage;


    }
}
