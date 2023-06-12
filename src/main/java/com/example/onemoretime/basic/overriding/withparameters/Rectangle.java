package com.example.onemoretime.basic.overriding.withparameters;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void draw(int width, int height) {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}
