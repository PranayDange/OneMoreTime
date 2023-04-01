package com.example.onemoretime.shallowanddeep;

public class DeepCopyExample {
    public static void main(String[] args) {
        //deep copy

        DeepCopy deepCopy = new DeepCopy();
        DeepCopy deepCopy1 = new DeepCopy();
        deepCopy.y = 100;
        System.out.println("Deep copy  " + deepCopy1.y);
    }
}
