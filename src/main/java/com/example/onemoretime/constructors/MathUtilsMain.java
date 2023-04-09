package com.example.onemoretime.constructors;

public class MathUtilsMain {
    public static void main(String[] args) {
        int sum1 = MathUtils.add(2, 3); // calls add(int, int) method
        double sum2 = MathUtils.add(2.5, 3.5); // calls add(double, double) method
        int sum3 = MathUtils.add(2, 3, 4); // calls add(int, int, int) method

        System.out.println(sum1); // Output: 5
        System.out.println(sum2); // Output: 6.0
        System.out.println(sum3); // Output: 9
    }
}
