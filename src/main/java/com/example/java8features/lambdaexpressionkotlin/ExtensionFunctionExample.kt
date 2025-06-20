package com.example.java8features.lambdaexpressionkotlin

import java.util.*

fun main() {
    // println("Hello Pranay".formattedString())
    //println("".formattedString2("Hello Pranay"))

    var name: String? = null
    name?.let {
        println(name)
    }

    val res = "name".run {
        uppercase(Locale.getDefault())
    }
    println(res)

    val list = mutableListOf("A", "B", "C")
    with(list) {
        add("D")
        remove("B")
    }
    println(list)
    println("$$$$$$$$$$$$$$$$$$$$$$$$$$")

    val userrr = User().apply {
        name = "John"
        age = 30
    }
    println(userrr)

    val doooo: String? = null
    val length: Int = doooo?.length ?: 0
    println(length)


    val calculation:Int by lazy {
        println("performaing complex calculation")
        (1..1000).sum()
    }

}

data class User(var name: String = "", var age: Int = 0)


fun String.formattedString(): String {
    return "------------\n$this\n------------";
}

fun String.formattedString2(msg: String): String {
    return "------------\n$msg\n------------";
}

