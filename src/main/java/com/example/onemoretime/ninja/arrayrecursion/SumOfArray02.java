package com.example.onemoretime.ninja.arrayrecursion;

public class SumOfArray02 {
    public static void main(String[] args) {
        //input =9 8 9
        //output =26
        int[] arr = {9, 8, 9};
        //System.out.println(sum(arr));
        System.out.println(sum2(arr,0));
    }

    public static int sumMy(int[] input) {
        if (input.length == input[0]) {//if array length is zero then return 0
            return 0;
        }
        int[] newArrary = new int[input.length - 1];
        int finalSum = 0;
        for (int i = 1; i < input.length - 1; i++) {
            newArrary[i - 1] = input[i];

        }
        finalSum = finalSum + sumMy(newArrary);

        return finalSum;

    }

    public static int sum2(int[] input, int si) {
        if (si == input.length) {
            return 0;

        }
        return input[si] + sum2(input, si + 1);

    }


    public static int sumGpt(int[] input) {
        if (input.length == 0) {
            return 0;
        }
        // Base case: when the array has only one element, return that element
        if (input.length == 1) {
            return input[0];
        }

        // Recursive case: sum the first element and the sum of the rest of the array
        int[] remainingArray = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            remainingArray[i - 1] = input[i];
        }

        return input[0] + sumGpt(remainingArray);

    }


}
