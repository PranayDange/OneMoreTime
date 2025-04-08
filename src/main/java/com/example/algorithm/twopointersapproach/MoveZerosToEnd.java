package com.example.algorithm.twopointersapproach;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        // 3. Move Zeros to the End

        int[] arr = {0, 1, 0, 3, 12};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
        //Output: [1, 3, 12, 0, 0].
    }

    static void moveZero(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++]=0;
        }
    }


}
