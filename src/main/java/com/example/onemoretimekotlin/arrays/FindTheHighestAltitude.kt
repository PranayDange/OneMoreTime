package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    val arr = intArrayOf(-5, 1, 5, 0, -7)
    largestAltitude(arr)

}

fun largestAltitude(gain: IntArray): Int {
    var ans = 0;
    var res = 0;
    for (i in 0 until gain.size) {
        ans += gain[i];
        res = Math.max(res, ans)
    }
    println(res)
    return res
}