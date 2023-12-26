package com.example.onemoretimejava.arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
      /*  Input: digits = [1,2,3]
        Output: [1,2,4]*/
        int[] arr = {2,5};
        // plusOne(arr);
        plusOneOp(arr);

    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] ansArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (int) (digits[i] * Math.pow(10, n - 1 - i));
        }
        sum = sum + 1;
        // System.out.println(sum);
        // System.out.println("----------------------");
        /*int i = 0;
        while (sum != 0) {
           *//* sum = sum / 10;
            ansArr[i] = sum;
            i++;*//*
            ansArr[i] = sum % 10; // Extract the last digit
            sum = sum / 10;       // Remove the last digit
            i++;
        }*/

        for (int i = ansArr.length - 1; i >= 0; i--) {
            ansArr[i] = sum % 10;
            sum = sum / 10;
            i++;
        }
        //  System.out.println(sum);
        System.out.println(Arrays.toString(ansArr));

        return ansArr;
    }


    public static int[] plusOneeBf(int[] digits) {
        int n = digits.length;

        // Iterate from right to left and add 1
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return the updated array
            } else {
                digits[i] = 0; // Set to 0 and continue the loop for carry
            }
        }

        // If we reach here, it means there was a carry to the leftmost digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the leftmost digit to 1
        System.out.println(Arrays.toString(result));
        return result;
    }


    public static int[] plusOneOp(int[] digits) {
        int n = digits.length;
        int[] ansArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (int) (digits[i] * Math.pow(10, n - 1 - i));
        }
        sum = sum + 1;
        String numStr = String.valueOf(sum);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(i));
           // result[i] = numStr.charAt(i) - '0';

        }

        //  System.out.println(sum);
        System.out.println(Arrays.toString(result));

        return result;
    }
}
