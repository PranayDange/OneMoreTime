package com.example.onemoretime.arraysk;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9};
        plusOne(digits);
        plusOne1(digits);

    }

    //this method gets failed when int[] digits = {9};
    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] >= 9) {
                digits[i] = 0;
                if (i != 0) {
                    digits[i - 1] = digits[i - 1] + 1;

                }
                //  digits[i - 1] = digits[i - 1] + 1;
                break;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        System.out.println(Arrays.toString(digits));
       // System.out.println(Arrays.toString(newDigits));
        return newDigits;
    }


    static int[] plusOne1(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else
                digits[i] = 0;
        }

        // The array has only '9'
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        return newDigits;
    }
}
