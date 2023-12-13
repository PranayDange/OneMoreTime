package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class SwapArrays {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[][] arr2D = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        // swapArr(arr, 1, 3);
        // swapArr(arr);
        reverse2DArray(arr2D);

    }

    public static void swapArr(int[] arr, int index1, int index2) {
        int[] original = arr;
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void swapArr(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
 /*   If you choose to iterate the entire array without dividing the length by 2,
    it will result in swapping elements twice, effectively making no change to the array.
    This is because when you swap elements from both ends and move towards the center,
    you will end up swapping them back again.*/

    public static void reverse2DArray(int[][] arr) {
        int len = arr.length;
        ;
        //  int[][] resArr=new int[len][];
        for (int i = 0; i < len; i++) {
            int rowLength = arr[i].length;

            for (int j = 0; j < rowLength / 2; j++) {
                int temp = arr[i][j];
                // arr[i][j] = arr[i][arr[i].length - 1 - j];
                arr[i][j] = arr[i][rowLength - 1 - j];
                arr[i][rowLength - 1 - j] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
