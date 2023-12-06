package com.example.onemoretimekotlin.arrays

import java.util.Arrays


fun main(args: Array<String>) {
    /*Input: candies = [2,3,5,1,3], extraCandies = 3
       Output: [true,true,true,false,true]*/
    val arr = intArrayOf(2, 3, 5, 1, 3)
    val n = 3
    kidsWithCandies(arr, n)
}

fun kidsWithCandies(arr: IntArray, n: Int): List<Boolean> {
    val len = arr.size
    val resArr = BooleanArray(len)
    for (i in 0 until len) {
        var ss = true
        for (j in 0 until len) {
            if (arr[i] + n < arr[j]) {
                ss = false;
                break
            }
        }
        resArr[i] = ss
    }
    println(resArr.contentToString())
    return resArr.toList()

}