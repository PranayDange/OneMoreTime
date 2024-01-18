package com.example.onemoretimejava.search.linear;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
       /* Input: nums = [12,345,2,6,7896]
        Output: 2*/
        int[] arr = {12, 345, 2, 6, 7896,1234};
        findNumbers(arr);
    }

    static int findNumbers(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int num : nums) {
            //if (num % 2 == 0 && num / 10 != 0) {
           // if (getSingleDigit(num) % 2 == 0) {
            if (getSingleDigit1(num) % 2 == 0) {
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

    static int getSingleDigit1(int num) {
        /*int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }*/
        return (int) (Math.log10(num) + 1);
    }
}
