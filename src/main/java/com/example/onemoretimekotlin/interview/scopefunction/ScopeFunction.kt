package com.example.onemoretimekotlin.interview.scopefunction

class Person {
    var name: String? = null
    var age: Int? = null
}

fun main(args: Array<String>) {
    val person = Person()
    person.name = "Pranay"//ordinary Code
    person.age = 24//ordinary Code


    //but by using scope functions
    val person1 = Person().apply {
        //apply is a scope function which is basically a higher order function
        name = "pranay"
        age = 24
    }

    //how to distinguish between scope function
    //there are two main difference between scope function
    //1.the way to refer a context object (either this or it)
    //2.The return value either context object or the lambda result

    //with -->return lambda result context object:this
    //
}