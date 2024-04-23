package com.example.onemoretimekotlin.interview.scopefunction

class ScopeFunctionRun {
    var name: String = "pranay"
    var age: Int = 26
}

fun main() {
    //run function is the combination of let and with
    /*scope function 'run'
 Property 1: Refer to context object by using  'this'
 Property 2:The return value is the 'lambda result'*/
    //if you want to operate on a nullable object and avoid nullpointerexception then use "run"
    // val person: ScopeFunctionRun? = null
    val person: ScopeFunctionRun? = ScopeFunctionRun()
    val bio = person?.run {
        println(name)
        println(age)
        age + 5
        "He is a freak"
    }
    println(bio)


}