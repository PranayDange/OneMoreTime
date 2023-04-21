package com.example.onemoretime.recursion.kkreucrsionbasic;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        //find the Nth fibonacci number
        // 0 1 1 2 3 5 8 13...
        int ans =fibo(4);
      //  System.out.println(fibo(6));
        System.out.println(ans);

    }

    static int fibo(int n) {
        //base condition
       /* if (n == 1 || n == 0){

            return n;
        }*/
        if (n < 2) {
            return n;
        }

        //this is not tail recursion because this is not not function call
        //  fibo(n - 1) first this function is called then fibo(n - 2) then this function is called
        //and then both addition is done and return the value
        return fibo(n - 1) + fibo(n - 2);
    }
}
