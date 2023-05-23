package com.example.onemoretime.interview;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        output(arr);
    }
    static void output(int[] array){
        int n = array.length-1;
      //  int[] newArray = new int[n];
        for (int i = n; i >=0 ; i--) {
//            newArray[i]=array[i];
            System.out.print(array[i]);
        }
       // System.out.println(Arrays.toString(newArray));

    }
}
