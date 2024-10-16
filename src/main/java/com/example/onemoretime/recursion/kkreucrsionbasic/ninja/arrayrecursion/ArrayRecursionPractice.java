package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.arrayrecursion;

public class ArrayRecursionPractice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //  System.out.println(isSorted(arr, 0));
        // System.out.println(arraySum(arr, 0));
        // reverseArray(arr,0);
       // System.out.println(checkNumber(arr, 7, 0));
        System.out.println(findFirstIndex(arr, 7, 0));
    }

    //1 check if Array isSorted
    static boolean isSorted(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;

        }
        if (arr[si] > arr[si + 1]) {
            return false;
        }
        return isSorted(arr, si + 1);
    }

    // 2 Array Sum
    static int arraySum(int[] arr, int si) {
        if (si == arr.length) {
            return 0;
        }
        return arr[si] + arraySum(arr, si + 1);
    }

    //3 print array in reverse
    static void reverseArray(int[] arr, int si) {
        if (si == arr.length) {
            return;
        }
        reverseArray(arr, si + 1);
        System.out.println(arr[si]);
    }

    //4 check if number is present
    public static boolean checkNumber(int input[], int x, int si) {
        if (si == input.length) {
            return false;
        }

        if (x == input[si]) {
            return true;
        }

        return checkNumber(input, x, si + 1);

    }

    public static int findFirstIndex(int input[], int x, int si) {
        if (si == input.length) {
            return -1;
        }
        if (x == input[si]) {
            return si;
        }
        return findFirstIndex(input, x, si+1);
    }


}
