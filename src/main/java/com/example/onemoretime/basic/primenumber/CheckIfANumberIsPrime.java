package com.example.onemoretime.basic.primenumber;

public class CheckIfANumberIsPrime {
    public static void main(String[] args) {
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
        int num = 3;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        boolean flag =true;
        if (num == 0) {
            return false;
        }
       /* if (num % 1 == 0) {
            return true;
        }*/
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag= false;
            }
        }
        return flag;
    }
}
