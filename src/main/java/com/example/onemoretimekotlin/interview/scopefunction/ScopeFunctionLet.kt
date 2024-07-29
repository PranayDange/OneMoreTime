package com.example.onemoretimekotlin.interview.scopefunction

class ScopeFunctionLet {
}

fun main() {
    /*scope function 'let'
  Property 1: Refer to context object by using  'it'
  Property 2:The return value is the 'lambda result'*/

    //use let to avoid null pointer exception
    var name: String? = "pranay"
    val name2: String = "example"


    name?.let {
       // println(this.reversed())
        name=it.reversed()
        println("$name")
       // println(it.capitalize())
        //println(it.length)
    }

    println(name+"zzz")

    //this will get nullpointerexception as null cannot be reversed
    /*println(name!!.reversed())
    println(name.capitalize())
    println(name.length)*/

    val reversedName = name2.let {
        it.reversed()
    }
    println(name2) // Prints: example
    println(reversedName) // Prints: elpmaxe
}