package com.example.onemoretimekotlin.arrays

fun main(args: Array<String>) {

    val arr: ArrayList<Int> = ArrayList()
    // val arr: ArrayList<Int> = ArrayList()
    arr.add(1)
    arr.add(2)
    arr.add(3)
    arr.add(4)
    arr.add(5)
    arr.add(6)
    arr.add(7)
    arr.add(8)
    arr.add(9)
    println(arr)
    println(arr.contains(5))
    println(arr.set(0, 99))
    println(arr)
    for (i in 0 until arr.size){
       // println(arr[i])
        println(arr.get(i))
    }

    val arr2 = arrayListOf<Int>()
    arr2.add(1)
    arr2.add(2)
    arr2.add(3)
    println(arr2)

}