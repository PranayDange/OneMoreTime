package com.example.onemoretimekotlin.kotlinbasic

object Basic1 {
    @JvmStatic
    fun main(args: Array<String>) {
        //initialization of array in kotlin
        val array = arrayOf(1, 2, 3, 4, 5);
        val intArray = intArrayOf();
        val floadArray = floatArrayOf()
        val stringArray: Array<String> = arrayOf("Hello", "World", "Kotlin")
        val nullableStringArray: Array<String?> = arrayOf("Hello", null, "Kotlin")
        val inttArray: Array<Int> = arrayOf(1, 2, 3, 4)
        val doubletArray: Array<Float> = arrayOf(1.0f, 2.1f)
        val intttArray: IntArray = IntArray(4)


        //kotlin Collection
        val numbers: List<Int?> = listOf(1, null, 3, 4, 5) // A list collection storing integers
        val names: Set<String> = setOf("Alice", "Bob", "Charlie") // A set collection storing strings
        val ages: Map<String, Int> = mapOf("Alice" to 25, "Bob" to 30, "Charlie" to 35) // A map collection storing key-value pairs



    }
}