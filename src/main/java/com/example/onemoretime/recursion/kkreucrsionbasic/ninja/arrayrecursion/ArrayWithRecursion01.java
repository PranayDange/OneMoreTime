package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.arrayrecursion;

public class ArrayWithRecursion01 {
    //how to use recursion problems related to recursion
    //Que -- Given an array check if array is sorted or not
    public static void main(String[] args) {
        int[] arr1 = {1, 6, 2, 3, 4, 5};
        System.out.println(isSorted(arr1));
        System.out.println(isSorted2(arr1, 0));

    }

    //way1
    public static boolean isSorted(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int[] newArrayy = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArrayy[i - 1] = arr[i];
        }
        boolean isArraySorted = isSorted(newArrayy);
        return isArraySorted;

    }

    //way2
    //si -->start index
    public static boolean isSorted2(int[] arr, int si) {
        /*if (arr.length-1 == si) {
            return true;
        }*/
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        }

        boolean isSmallIndex = isSorted2(arr, si + 1);
        return isSmallIndex;
    }


}
