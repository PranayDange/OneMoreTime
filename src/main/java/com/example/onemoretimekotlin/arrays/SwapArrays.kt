package com.example.onemoretimekotlin.arrays

import java.util.*

fun main(args: Array<String>) {
    val arr= arrayOf(1,2,3,4,5)
  //  val arrr= intArrayOf(1,2,3,4,5) //then in parameter you have to take IntArray
    swap(arr,0,4)
}
fun swap(arr: Array<Int>, index1:Int, index2:Int){
    val temp=arr[index1]
    arr[index1]=arr[index2]
    arr[index2]=temp
    println(Arrays.toString(arr))
    println(arr.contentToString())
}