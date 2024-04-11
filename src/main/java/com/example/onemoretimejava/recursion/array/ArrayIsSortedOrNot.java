package com.example.onemoretimejava.recursion.array;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9};
        int index = 0;
        //int[] arr = {1, 13, 6, 9};
        System.out.println(sorted(arr, index));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;

        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
