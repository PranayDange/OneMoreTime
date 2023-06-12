package com.example.onemoretime.oops.inheritance;

public class Circle implements Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
//WRONG
    // Shape circle = new Shape();
    // Shape.printShapeInfo();


    //correct
    /*public static void main(String[] args) {
        Shape.printShapeInfo();
    }*/
}
