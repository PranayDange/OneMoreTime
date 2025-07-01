package com.example.onemoretimekotlin

import java.util.*


fun main() {
    //scope functions
    //let --for null checks
    val name: String? = "pranay"
    name?.let {
        println(it)
    }

    //run --> to run block of code .run executes the block **and returns the last expression inside it.
    val name2 = "prnay".run {
        uppercase()
    }
    // println(name2)

    //with --> to run multiple block of code
    val list = mutableListOf("A", "B", "C")
    with(list) {
        add("D")
        remove("B")
    }
    println(list)

    //apply -->"We use apply to configure an object right after it's created, while still returning the object itself."
    val list2 = mutableListOf<String>().apply {
        add("pranay")
        add("sam")
        add("jhon")

    }
    println(list2)
    //also -->"We use also when we want to perform extra actions (like logging or debugging) without changing the original object."
    val list3 = mutableListOf<String>("A", "B", "G")
    list3.also {
        println("before changes $it")
    }


    //Null safety and elvis operator
    val place: String? = "rajura"
    val len = place?.length ?: 10
    println("len $len")


    //Map Pair Triple
    val map = mutableMapOf(1 to 10, 2 to 20, 3 to 30, 3 to 40)
    println(map)//op-->{1=10, 2=20, 3=40}
    val map2 = mutableMapOf<Int, MutableList<Int>>()
    fun put(key: Int, value: Int) {
        map2.getOrPut(key) { mutableListOf() }.add(value)
    }
    put(1, 30)
    put(1, 30)
    put(1, 30)
    println(map2)

    //Pair
    val map4 = mapOf(1 to Pair("alice", 4.0), 2 to Pair("jack", 4.3))
    for ((id, height) in map4) {
        println("key:  $id     value: $height")
    }


}