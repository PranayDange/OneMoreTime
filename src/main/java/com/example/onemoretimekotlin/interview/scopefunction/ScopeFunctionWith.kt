package com.example.onemoretimekotlin.interview.scopefunction

class ScopeFunctionWith {
    var name: String = "pranay"
    var age: Int = 26
}

fun main() {
    val person = ScopeFunctionWith()
    println(person.name)
    println(person.age)

    /*scope function 'with'
    Property 1: Refer to context object by using  'this'
    Property 2:The return value is the 'lambda result'*/

    //in this context object refers to with(person) person
    with(person) {
        println(this.name)
        //or
        //println(name)
        println(this.age)

    }
    val ageAfterFiveYears: String = with(person) {
        println(name)
        println(age)

        age + 5
        "danged"


    }
    println("///////////////////////////////////")
    println(person.age)
    println("age now ${ageAfterFiveYears}")
    println("age now $ageAfterFiveYears")
}