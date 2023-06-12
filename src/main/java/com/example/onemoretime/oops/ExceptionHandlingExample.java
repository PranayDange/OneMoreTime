package com.example.onemoretime.oops;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
