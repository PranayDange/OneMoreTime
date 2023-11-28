package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    /*Input: nums = [1,2,1]
           Output: [1,2,1,1,2,1]*/
    val arr = intArrayOf(1, 2, 1)
    getConcatenation(arr)
}

fun getConcatenation(nums: IntArray): IntArray {
    val n = nums.size
    var newArr = IntArray(2 * n)
    for (i in 0 until n) {
        newArr[i] = nums[i]
        newArr[i + n] = nums[i]
    }
    println(newArr.contentToString())
    return newArr
}