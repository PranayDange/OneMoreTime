package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class SwapArrays {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        // swapArr(arr, 1, 3);
        swapArr(arr);
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
        for (int i = 0; i < length/2 ; i++) {
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

}
