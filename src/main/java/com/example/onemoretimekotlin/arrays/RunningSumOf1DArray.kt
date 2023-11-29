package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    /* Input: nums = [1,2,3,4]
       Output: [1,3,6,10]*/
    val arr = intArrayOf(1, 2, 3, 4)
    runningSum(arr)

}

fun runningSum(nums: IntArray): IntArray {
    val n = nums.size
    var newArr = IntArray(n)
    var sum = 0
    for (i in 0 until n) {
        sum += nums[i]
        newArr[i] += sum
    }
    println(newArr.contentToString())
    return newArr
}