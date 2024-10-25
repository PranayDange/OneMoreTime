package com.example.onemoretime.recursion.kkreucrsionbasic.ninja.basic;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZerosRec(1020));

    }

    public static int countZerosRec(int input) {
        if (input==1) {
            return 0;
        }
        int count = 0;
        while (input>0) {

            int single = (input % 10) + countZerosRec(input / 10);
            if (single == 0) {
                count++;
                //count = count + i;
            }
        }
        return count;
    }


    public static int countZerosRec2(int input) {
        // Base case: if input becomes 0, return 0
        if (input == 0) {
            return 0;
        }

        // Recursive case: check the last digit
        int lastDigit = input % 10;

        // Recursively call for the rest of the digits
        int zerosInRest = countZerosRec2(input / 10);

        // If the last digit is 0, add 1 to the count
        if (lastDigit == 0) {
            return 1 + zerosInRest;
        } else {
            return zerosInRest;
        }
    }

}
