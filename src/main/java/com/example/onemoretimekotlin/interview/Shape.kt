package com.example.onemoretimekotlin.interview

sealed class Shape {
    class Circle(var radius: Float) : Shape()

    //class Circle : Shape()
    //data object Circle : Shape()
    class Square(var side: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
    object NotAShape : Shape()//singleton object in kotlin

    // sealed interface Draw
    // sealed class Line :Shape()
}
//the subclassess can be data class,regular class,object class,or even another sealed class
//or even sealed interface
//sealed class ensures type safety by restricting the set of types at compile time
//sealed class is implicitly an abstract class which cannot be instantiated
//by default constructor of sealed class is private and we cannot make it as non private

fun main(args: Array<String>) {
    var circle = Shape.Circle(3.0f)
    var sq = Shape.Square(3)
    var rec = Shape.Rectangle(3, 4)

    val notAShape = Shape.NotAShape
    extracted(notAShape)
}

private fun extracted(shape: Shape) {
    when (shape) {
        is Shape.Circle -> println("Area of circle is ${shape.radius}")
        is Shape.Square -> println("Area of sq is ${shape.side}")
        is Shape.Rectangle -> println("Area of circle is ${shape.length}  ${shape.breadth} ")
        // is Shape.NotAShape -> println("no shape is found ")
        Shape.NotAShape -> println("no shape is found ")
    }
}