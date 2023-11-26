package com.example.onemoretime.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //armstrong number = 370,371
        int num = 372;
        // isArmstrong(num);
        if (isArmstrong(num)) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int s = num % 10;
            sum +=  Math.pow(s, 3);
            num /= 10;
        }
        return originalNum == sum;
    }
}
