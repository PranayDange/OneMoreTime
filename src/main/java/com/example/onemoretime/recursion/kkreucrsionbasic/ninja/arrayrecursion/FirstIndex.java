package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.arrayrecursion;

public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {9, 10, 8};
        int x = 8;
        System.out.println(firstIndex(arr, x, 0));
    }

    public static int firstIndex(int input[], int x, int si) {
        if (si == input.length) {
            return -1;
        }

        if (input[si] == x) {
            return si;
        }
        return firstIndex(input, x, si + 1);

    }


}
