package com.example.onemoretimekotlin.interview.scopefunction

class ScopeFunctionApply {
    var name: String = ""
    var age: Int = 0
}

fun main() {

    /*scope function 'apply'
   Property 1: Refer to context object by using  'this'
   Property 2:The return value is the 'context object'*/

    val person = ScopeFunctionApply()
    person.name = "Pranay"
    person.age = 26

    // val person2 = ScopeFunctionApply().apply {  }
    //or
    val person2 = ScopeFunctionApply()
    person2.apply {
        this.name = "dange"
        this.age = 27
        // age = 28
        //using this keyword is optional
    }
    println("//////////////////")
    println(person2.name)
    println(person2.age)
    println(",,,,,,,,,,,,,,,,,,,")
    with(person2) {
        println(name)
        println(age)
    }


    //also
    //modify the property of person object or perform certain operation on this person object
    person2.also {
        it.name = "pranay madhukar dange"
        println(it.name)

    }
    println("///////////////")
    println(person2.name)
}