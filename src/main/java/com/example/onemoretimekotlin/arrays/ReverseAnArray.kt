package com.example.onemoretimekotlin.arrays

import java.util.Arrays

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5)
    reverse(arr)
}

fun reverse(arr: Array<Int>) {
    var start = 0
    var end = arr.size - 1
    while (start < end) {
        swapp(arr, start, end)
        start++
        end--
    }
    println(Arrays.toString(arr))
    println(arr.contentToString())
}

fun swapp(arr: Array<Int>, start: Int, end: Int) {
    val temp =arr[start]
    arr[start]=arr[end]
    arr[end]=temp
}