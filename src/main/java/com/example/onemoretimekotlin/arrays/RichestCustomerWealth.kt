package com.example.onemoretimekotlin.arrays

import kotlin.math.max

fun main(args: Array<String>) {
    /* Input: accounts = [[1,2,3],[3,2,1]]
           Output: 6*/
    val accounts: Array<IntArray> = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 2, 1),
            intArrayOf(4, 5, 6)
    )
    maximumWealth(accounts)

}

fun maximumWealth(accounts: Array<IntArray>): Int {
    val n = accounts.size;
    var max = Int.MIN_VALUE
    for (i in 0 until n) {
        var sum = 0
        for (j in 0 until accounts[i].size) {
            sum += accounts[i][j]
        }
        max = max(max, sum)
    }
    println(max)
    return max
}