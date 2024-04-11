package com.example.onemoretimejava;

import java.util.Arrays;


public class Practice {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 4, 5};
        //int[] arr = {3, 54, 12, 111, 49};//this will give error as cyclic sort can be implemented in continuous manner
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int max = getMarIndex(arr, 0, lastIndex);
            swap(arr, max, lastIndex);

        }
    }

    private static void swap(int[] arr, int first, int lastIndex) {
        int temp = arr[first];
        arr[first] = arr[lastIndex];
        arr[lastIndex] = temp;
    }

    private static int getMarIndex(int[] arr, int first, int last) {
        int ans = 0;
        for (int i = first; i <= last; i++) {
            if (arr[ans] < arr[i]) {
                ans = i;
            }
        }
        return ans;
    }


}
