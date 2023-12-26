package com.example.onemoretimejava.arrays;

public class FlippingAnImage {
    /* Input: image = [[1,1,0],[1,0,1],[0,0,0]]
     Output: [[1,0,0],[0,1,0],[1,1,1]]
     Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
     Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]*/
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipAndInvertImage(arr);
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            int rowLen = image[i].length;
            for (int j = 0; j < (rowLen + 1) / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][rowLen - 1 - j] ^ 1;
                image[i][rowLen - 1 - j] = temp;
            }


        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return image;

    }

}


