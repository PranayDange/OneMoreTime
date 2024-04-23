package com.example.onemoretimekotlin

object CollectionPractice {
    @JvmStatic
    fun main(args: Array<String>) {
        val num: Array<Int> = arrayOf(1, 2, 3, 4)
        val num2: IntArray = intArrayOf(1, 2, 3, 4)
        val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
        val numbers1 = listOf(1, 2, 3, 4, 5)
        val names: Set<String> = setOf("Alice", "Bob", "Charlie") // A set collection storing strings
        val ages: Map<String, Int> = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35) // A map collection storing key-value pairs

        val numbers3 = listOf(1, 2, 3, 4, 5, 6)
        // Filter elements based on a condition with access to both the element and its index
        val filter = numbers3.filter { it % 2 == 0 }//Use filter when you want to select only certain elements from a collection based on a condition
        val filter2 = numbers3.map { it * it }//Use map when you want to transform each element of a collection into another form.
        val filter1 = numbers3.map { it * it }.filter { it % 2 == 0 }
        val result = numbers.map { it * it }.filter { it > 25 }

        println("filter1   :   $filter1")
        numbers3.filter { number -> number % 2 == 0 }
        println("filtered numbers $filter")


        ///////////////////////////////////////////
        val immutableList: List<Int> = listOf(1, 2, 3) // Immutable list
        val mutableList: MutableList<Int> = mutableListOf(4, 5, 6) // Mutable list
        // immutableList[0] = 10//error // Error: Immutable list cannot be modified
        mutableList[0] = 10// Mutable list can be modified
        mutableList.add(7) // Add an element to the mutable list
        mutableList.removeAt(1) // Remove an element from the mutable list

        //lambda expression
        //1. Simple Lambda:
        //A lambda expression that takes no arguments and returns a constant value.
        val sayHello = { println("Hello, world!") }
        // Calling the lambda
        sayHello() // Output: Hello, world!

        //2. Lambda with Arguments:
        // A lambda expression that takes one or more arguments and returns their sum.
        val sum = { a: Int, b: Int -> a + b }
        // Calling the lambda
        val result1 = sum(3, 5) // result will be 8

        //companion object
        //Syntax:




    }
}