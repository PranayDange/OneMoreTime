package com.example.onemoretime.constructors;

public class MathUtils {
    //example to demonstrate if static method can be overloaded

    //static method can be overloaded but cannot be overridden
    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
}

