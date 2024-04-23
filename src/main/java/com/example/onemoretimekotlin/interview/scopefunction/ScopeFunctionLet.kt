package com.example.onemoretimekotlin.interview.scopefunction

class ScopeFunctionLet {
}

fun main() {
    /*scope function 'let'
  Property 1: Refer to context object by using  'it'
  Property 2:The return value is the 'lambda result'*/

    //use let to avoid null pointer exception
    val name: String? = null
    name?.let {
        println(it.reversed())
        println(it.capitalize())
        println(it.length)
    }

    //this will get nullpointerexception as null cannot be reversed
    /*println(name!!.reversed())
    println(name.capitalize())
    println(name.length)*/
}