package com.example.onemoretime.shallowanddeep;

public class ShallowCopyExample {
    public static void main(String[] args) {

        ShallowCopy shallowCopy = new ShallowCopy();
        ShallowCopy shallowCopy1 = shallowCopy;

        shallowCopy1.x = 150;

        System.out.println("shallow copy " + shallowCopy.x);

    }
}
