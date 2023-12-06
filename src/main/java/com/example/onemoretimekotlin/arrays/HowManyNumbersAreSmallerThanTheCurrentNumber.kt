package com.example.onemoretimekotlin.arrays


fun main(args: Array<String>) {
    /*Input: nums = [8,1,2,2,3]
  Output: [4,0,1,1,3]*/
    val arr = intArrayOf(8, 1, 2, 2, 3)
    smallerNumbersThanCurrent(arr)
}

fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
    val n = nums.size
    val resArr = IntArray(n);
    for (i in 0 until n) {
        var ans = 0
        for (j in 0 until n) {
            if (j != i && nums[j] < nums[i]) {
                ans++;
            }
        }
        resArr[i] = ans

    }
    println(resArr.contentToString())
    return resArr;
}