package com.example.onemoretimekotlin.basic

fun main(args: Array<String>) {
    val num1 = 12
    val num2 = 18
    val hcf = findHcf(num1, num2)
    val lcm = findLcm(num1, num2)
    println("hcf: $hcf")
    println("lcm: $lcm")
}

fun findHcf(a: Int, b: Int): Int {
    var gcd = 1;
    val max = Math.max(a, b)
    for (i in 1..max) {
        if (a % i == 0 && b % i == 0) {
            gcd = i
        }

    }

    return gcd
}

fun findLcm(a: Int, b: Int): Int {
    var lcm = 1
    lcm = a * b / findHcf(a, b)

    return lcm
}