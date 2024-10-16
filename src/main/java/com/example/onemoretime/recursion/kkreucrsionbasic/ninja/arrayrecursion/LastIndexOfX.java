package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.arrayrecursion;

public class LastIndexOfX {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10, 8};
        System.out.println(lastIndex(arr, 8, 0));
    }

    public static int lastIndex(int input[], int x, int si) {
        if (si == input.length) {
            return -1;
        }
        int smallAns = lastIndex(input, x, si + 1);
        if(smallAns !=-1){
            return smallAns;
        }
        if(input[si]==x){
            return si;
        }else {
            return  -1;
        }

    }
}
