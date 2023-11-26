package com.example.onemoretimekotlin.basic

fun main(args: Array<String>) {
    println("Hello, world!")

    isPalindrome(131)
}

fun isPalindrome(num: Int) {
    var sum = 0
    var numCopy = num
    while (numCopy != 0) {
        val n = numCopy % 10
        sum = sum * 10 + n
        numCopy /= 10

    }
    if (num == sum) {
        println("is palindrome")
    } else {
        println("is not palindrome")
    }
}