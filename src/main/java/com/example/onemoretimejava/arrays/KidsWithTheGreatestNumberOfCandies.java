package com.example.onemoretimejava.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        /*Input: candies = [2,3,5,1,3], extraCandies = 3
        Output: [true,true,true,false,true]*/
        int[] arr = {2, 3, 5, 1, 3};
        int n = 3;
        kidsWithCandies(arr, n);

    }

    public static List<Boolean> kidsWithCandies(int[] arr, int n) {
        int len = arr.length;
        Boolean[] resArr = new Boolean[len];
        for (int i = 0; i < len; i++) {
            boolean canHaveMaxCandies = true;

            for (int j = 0; j < len; j++) {
                if (arr[i] + n < arr[j]) {
                    canHaveMaxCandies = false;
                    break;
                }
            }
            resArr[i] = canHaveMaxCandies;

        }
        System.out.println(Arrays.toString(resArr));
        return List.of(resArr);

    }
}
