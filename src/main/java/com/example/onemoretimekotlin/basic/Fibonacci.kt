package com.example.onemoretimekotlin.basic

fun main(args: Array<String>) {
    val n = 5
    //fiboSeries(n)
    fiboSum(n)
}

fun fiboSeries(n: Int) {
    var a = 0
    var b = 1
    var c = 0
    for (i in 1..n) {
        a = b
        b = c
        c = a + b
        print("$c  ")
    }
}

fun fiboSum(n: Int) {
    var a = 0
    var b = 1
    var c = 0
    var sum = a + b
    for (i in 1 until n) {
        a = b
        b = c
        c = a + b
        sum = sum + c
    }
    print(sum)
}