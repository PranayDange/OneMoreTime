package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {
    /* Input: nums = [2,5,1,3,4,7], n = 3
       Output: [2,3,5,4,1,7]
       Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/
    val nums = intArrayOf(2, 5, 1, 3, 4, 7)
    val n = 3
    shuffle(nums, n)

}

fun shuffle(nums: IntArray, n: Int): IntArray {
    val ans = IntArray(2 * n)
    val len = ans.size
    var j = 0
    for (i in 0 until len step 2) {
        ans[i] = nums[j]
        ans[i + 1] = nums[j + n]
        j++
    }
    println(ans.contentToString())
    return ans
}