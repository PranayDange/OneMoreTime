package com.example.onemoretime.arraysk.linearsearch;

public class FindNumberswithEvenNumberOfDigitsKk {
    public static void main(String[] args) {

        //Input: nums = [12,345,2,6,7896]
        //Output: 2
        int[] arr = {12, 345, 2, 6, 7896, 66};
        int ans = findNumbers(arr);
        System.out.println(ans);
        System.out.println(digits(7896));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
      /*  for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }*/

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }


        return count;
    }

    //function to check weather to check a number contains even digits or not

    static boolean even(int num) {
        int numberOfDIgits = digits(num);
        if ((numberOfDIgits % 2) == 0) {
            return true;
        }
        return false;

    }

    //count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        //  System.out.println(count);
        return count;

    }
    static int digits2(int num){
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)+1);
    }
}
