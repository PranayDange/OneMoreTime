package com.example.onemoretime.basic;

public class ArmstrongWithMathPow {
    public static void main(String[] args) {
        //370,371
        //3 cube + 7 cube + 1 cube = 371
        int num = 370;
        armWithMathPow(num);
    }

    static void armWithMathPow(int num) {
        int temp = num;
        int sum = 1;
        while (num != 0) {
            int n = num % 10;
            //sum = sum + Math.pow(n, 3);
            // sum = (int) (sum + Math.pow(n, 3));
            //sum = sum + (int) Math.pow(n, 3);
            sum += Math.pow(n, 3);
            //or
           // sum += (n * n * n);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
