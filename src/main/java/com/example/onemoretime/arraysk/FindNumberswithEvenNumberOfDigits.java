package com.example.onemoretime.arraysk;

public class FindNumberswithEvenNumberOfDigits {
    public static void main(String[] args) {
        /*Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
                Therefore only 12 and 7896 contain an even number of digits.*/
        int[] arr = {12, 345, 2, 6, 7896};
        findNumbers(arr);
     //   findNumbers1(arr);

    }

    static int findNumbers(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int numDigits = 0;
            while (nums[i] > 0) {

                nums[i] = nums[i] / 10;
                numDigits++;
                //  nums[i] /= 10;

                // ans++;
                // break;
            }
            if (numDigits % 2 == 0) {
                // System.out.println("even digits");
                ans++;
            }
        }
        System.out.println(ans);
        return ans;

    }

    static int findNumbers1(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
