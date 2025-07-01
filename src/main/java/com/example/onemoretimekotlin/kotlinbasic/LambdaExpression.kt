package com.example.onemoretimekotlin.kotlinbasic

fun main() {
    val sum = { a: Int, b: Int -> a + b }
    println(sum(2, 3))

    val sum2: (Int, Int) -> Int = { a, b -> a * b }
    println(sum2(9, 9))

    //Passing lambda to a function
    fun calculate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
        return op(a, b)
    }

    val res = calculate(4, 5) { x, y -> x * y }
    println(res)

}


