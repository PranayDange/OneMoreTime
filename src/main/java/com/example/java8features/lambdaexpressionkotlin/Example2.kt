package com.example.java8features.lambdaexpressionkotlin

fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
    println(isOdd(3))
    println(isOdd(2))

    val lsit = nums.filter(fun(a: Int): Boolean {
        return a % 2 != 0
    })

    val list2 = nums.filter { a -> a % 2 != 0 }

    val list3 = nums.map { a -> a * a }
    println(lsit)
    println(list2)
    println(list3)

    println(nums.forEach { it })



}

fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}

