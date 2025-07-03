package com.example.onemoretimekotlin.kotlinbasic.coroutines

import kotlinx.coroutines.*

class Practice1 {


}

fun main() {
    suspend fun performTask(): Int {
        println("Hello Pranay | Thread: ${Thread.currentThread().name}")
        delay(1000)
        return 42
    }

    suspend fun performTaskCall() {
        performTask()
    }

    val res = runBlocking {
        launch {
            performTask() //this returns a job in return
        }
    }
    val res2 = runBlocking {
        performTask() //this returns a result
    }
    val res3 = runBlocking {
        val defferred = async {
            performTask()
        }
        defferred.await()
    }

    val res4 = runBlocking {
        withContext(Dispatchers.Main) {
            performTask()
        }
    }
    println("res $res")
    println("res2 $res2")
    println("res3 $res3")
    println("res4 ➤ $res4")
}