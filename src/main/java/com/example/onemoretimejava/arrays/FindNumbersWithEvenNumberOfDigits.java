package com.example.onemoretimejava.arrays;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
       /* Input: nums = [12,345,2,6,7896]
        Output: 2*/
        int[] arr = {12, 345, 2, 6, 7896};
        findNumbers(arr);
    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int num : nums) {
            //if (num % 2 == 0 && num / 10 != 0) {
            if (getSingleDigit(num) % 2 == 0) {
                ans++;
            }
        }
        System.out.println(ans);
        return ans;
    }

    static int getSingleDigit(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
