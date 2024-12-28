package com.example.onemoretime.ninja.arrayrecursion;

public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {9, 10, 8};
        int target = 8;
        System.out.println(firstIndex(arr, target, 0));
    }

    public static int firstIndex(int input[], int target, int si) {
        if (si == input.length) {
            return -1;
        }

        if (input[si] == target) {
            return si;
        }
        return firstIndex(input, target, si + 1);

    }


}
