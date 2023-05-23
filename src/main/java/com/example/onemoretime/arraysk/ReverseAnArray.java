package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
      //  int[] array = {1,2,3,4,5};
        int[] array = {7,5,8,9,12,3};
       // reverseArray(array);
        reverseArray1(array);

    }
    /*static void reverseArray(int[] arr){
        int[] target = new int[arr.length];
        for (int i = arr.length; i >0 ; i--) {
           // System.out.print(Arrays.toString(i));
            target[i] = arr[i];

        }
        System.out.print(Arrays.toString(target));
    }*/


    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        return  arr;
    }

    public static int[] reverseArray1(int[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(" "+arr[i]);
        }
       // System.out.println();
        return arr;
    }

}
