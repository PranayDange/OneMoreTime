package com.example.onemoretimekotlin.interview.scopefunction

class ScopeFunctionAlso {

}

fun main() {
    /*scope function 'also'
      Property 1: Refer to context object by using  'it'
      Property 2:The return value is the 'context object'*/

    val numberList: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    println("numberList $numberList")
    val intMutableList = numberList.also {
        it.add(5)
        // println("updated lisr: $numberList")
        println("updated list: $it")
        it.remove(3)
        println("updated list: $it")
    }
    println("numberList : $numberList")
    println("intMutableList : $intMutableList")


}