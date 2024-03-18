package com.example.onemoretimejava.sorting;

import java.util.Arrays;

public class RProblem {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 5, 5, 7, 9, 9};
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                index++;
                arr[index] = arr[i];

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }
}
//output {2,3,4,5,7,9,7,9,9} and index=6