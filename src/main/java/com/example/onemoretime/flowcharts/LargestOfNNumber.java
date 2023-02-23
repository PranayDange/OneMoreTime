package com.example.onemoretime.flowcharts;

public class LargestOfNNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 44, 33, 22, 55, 6, 76, 34};
        int largest = arr[0];
        // int largest = Integer.MIN_VALUE

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] > largest) {

                    // break;
                    largest = arr[j];
                }
            }

        }
        System.out.print(largest);


        //System.out.print(arr[0] + " " + arr[1]);
    }
}
