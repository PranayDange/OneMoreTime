package com.example.onemoretime.oops.inheritance;

public interface Shape {
    double calculateArea();

    double calculatePerimeter();

    static void printShapeInfo() {
        System.out.println("This is a shape.");
    }
}
