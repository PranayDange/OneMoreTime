package com.example.onemoretimekotlin.arrays

import java.util.*

fun main(args: Array<String>) {
    val arr1 = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
    )
    val arr2 = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
    )
    for (i in 0 until arr1.size) {
        for (j in 0 until arr1.size) {
           // print(arr1[i][j])
        }
        println()
    }
    // println(Arrays.toString(arr1))

    val arr3 = Array(3) { IntArray(3) }
    arr3[0][0] = 1
    arr3[0][1] = 2
    arr3[0][2] = 3
    arr3[1][0] = 4
    arr3[1][1] = 5
    arr3[1][2] = 6
    arr3[2][0] = 7
    arr3[2][1] = 8
    arr3[2][2] = 9
    for (i in 0 until arr3.size) {
        for (j in 0 until arr3.size) {
            print(" " + arr3[i][j])
        }
        println()
    }
}