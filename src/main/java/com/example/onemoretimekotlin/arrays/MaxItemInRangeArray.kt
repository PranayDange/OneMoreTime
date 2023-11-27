package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 17, 1, 5, 4, 44, 55, 33, 76, 34)
    maxItemInRange(arr, 2, 9)
}

fun maxItemInRange(arrList: Array<Int>, start: Int, end: Int) {
    var maxValue = arrList[start]
    for (i in start..end) {
        if (arrList[i] > maxValue) {
            maxValue = arrList[i]
        }
    }
    println(maxValue)
}