package com.example.onemoretimekotlin.kotlinbasic.coroutines

import com.jetbrains.rd.framework.util.noAwait
import kotlinx.coroutines.*

class Practice3 {
}

suspend fun main()  {
  val res=  GlobalScope.async {
        performTask()
    }

    Thread.sleep(2000)

    println("Main ends")

}

suspend fun performTask(): Int {
    println("Hey there")
    delay(1000)
    return 40 / 0  // This throws ArithmeticException
}