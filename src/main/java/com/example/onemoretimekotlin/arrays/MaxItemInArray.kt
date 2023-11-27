package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    val arr = arrayOf(4, 99, 22, 455, 654, 1)
    maxItem(arr)
}

fun maxItem(arrItem: Array<Int>) {
    var maxNum = arrItem[0]
    for (i in 0 until arrItem.size) {
   // for (i in arrItem.indices) {
        if (arrItem[i] > maxNum) {
            maxNum = arrItem[i]
        }

    }
    println(maxNum)
}