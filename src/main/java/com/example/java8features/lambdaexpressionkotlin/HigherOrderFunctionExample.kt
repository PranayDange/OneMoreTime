package com.example.java8features.lambdaexpressionkotlin

fun main() {
    val fu1: (a: Double, b: Double) -> Double = ::sum
    val fu2 = ::sum
    // println(fu1(2.0, 2.0))
    //println(fu2(2.0, 2.0))
    println(calculatoer2(4.0, 2.0, ::sum))
    println(calculatoer2(4.0, 2.0, { a, b -> a + b }))
    println(calculatoer2(4.0, 2.0) { a, b -> a + b })

}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun calculatoer2(a: Double, b: Double, qa: (Double, Double) -> Double) {
    val result = qa(a, b)
    println(result)
}