package com.example.onemoretime.basic.overriding.withparameters;

public class Main {
    public static void main(String[] args) {
        /*        In Java, method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.
                This allows the subclass to provide a specific implementation of the method while still maintaining the same method signature as the superclass.*/
        Shape shape = new Shape();
        //shape.draw();  // Output: "Drawing a shape"

        Circle circle = new Circle();
        circle.draw();  // Output: "Drawing a circle"
        circle.draw(5);  // Output: "Drawing a circle with radius 5"

        Shape shape1 = new Circle();
        shape1.draw();
        // Circle circle1=  new Shape();//this cannot be done
        // circle1.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();  // Output: "Drawing a rectangle"
        rectangle.draw(3, 4);  // Output: "Drawing a rectangle with width 3 and height 4"
    }
}
