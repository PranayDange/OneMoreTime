package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 1, 1, 3);
    numIdenticalPairs(arr)

}

fun numIdenticalPairs(arr: IntArray): Int {
    val n = arr.size
    var ans = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (arr[i] == arr[j] && i < j) {
                ans++;
            }
        }
    }
    println(ans)
    return ans
}