package com.example.onemoretime.ninja.arrayrecursion;

public class CheckNumberRecursively03 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10};
        int x = 8;
        System.out.println(checkNumber(arr, x,0));
    }

    public static boolean checkNumber(int input[], int x, int si) {
        if (si == input.length) {
            return false;
        }
        if (input[si] == x) {
            return true;
        }
        return checkNumber(input, x, si + 1);
    }
}
