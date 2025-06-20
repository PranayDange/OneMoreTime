package com.example.java8features.lambdaexpressionkotlin

class Example1 {
}

//lambda are anonymous function
fun main() {
    println("hello")


    val lambda1 = { x: Int, y: Int -> x + y }
    //val lambda2: (Int) -> Int = { x -> x * x }
    val lambda2: (Int) -> Int = { x -> x * x }

    println(lambda1(5, 3))
    println(lambda2(5))


    val multiLineLambda = {
        println("pranay")
        val a = 2 + 3
        "Hello pranay"
        // 2
    }
    println(multiLineLambda())

    //lambda inside a function

    // calculator(2,2,(a,b)->a*b))

}

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}