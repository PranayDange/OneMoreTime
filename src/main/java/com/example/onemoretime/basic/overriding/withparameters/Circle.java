package com.example.onemoretime.basic.overriding.withparameters;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void draw(int radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
