package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class SwapArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swapArr(arr,1,3);
    }
    public static void swapArr(int[] arr,int index1,int index2){
        int[] original = arr;
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
        System.out.println(Arrays.toString(arr));
    }
}
