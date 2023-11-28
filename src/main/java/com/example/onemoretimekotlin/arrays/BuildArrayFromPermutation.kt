package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    /*  Input: nums = [0,2,1,5,3,4]
       Output: [0,1,2,4,5,3]*/
    val arr = intArrayOf(0, 2, 1, 5, 3, 4)
    val arrr = arrayOf(0, 2, 1, 5, 3, 4)
    buildArray(arr)
    buildArray1(arrr)
}

fun buildArray(nums: IntArray): IntArray {
    val n = nums.size
    var newArr = IntArray(n)
    for (i in 0 until n) {
        newArr[i] = nums[nums[i]];
    }
    println(nums.contentToString())
    return newArr
}

fun buildArray1(nums: Array<Int>): Array<Int> {
    val n = nums.size
    var newArr = Array(n) { 0 }
    for (i in 0 until n) {
        newArr[i] = nums[nums[i]];
    }
    println(nums.contentToString())
    return newArr
}