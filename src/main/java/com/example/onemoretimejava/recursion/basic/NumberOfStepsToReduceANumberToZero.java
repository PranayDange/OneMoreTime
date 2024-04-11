package com.example.onemoretimejava.recursion.basic;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        //if number is even then divide by 2 or subtract 1 from it
        //we are making this helper function because we need to pass this values in this recursive calls
        //and we can only pass values in recursion calls
        //and we can only pass values in recursion calls is through argument
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
