package com.example.onemoretimejava.ninja.arrayrecursion;

public class CountPositiveInArray {
    public static void main(String[] args) {
        int[] input = {-1, 2, -3, 4};
        System.out.println(count(input, 0));


    }

    static int count(int[] arr, int si) {
        if (si == arr.length) {
            return 0;
        }
        int coun = 0;
        if (arr[si] > 0) {
            coun = 1;
        }


        return coun + count(arr, si + 1);

    }
}
