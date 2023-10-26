package com.example.onemoretimekotlin.basic


  /*  fun main() {
        evenOrOdd(15)
    }*/
  fun main(args: Array<String>) {
      println("Hello, world!")
      evenOrOdd(15)
  }

    fun evenOrOdd(n: Int) {
        if (n % 2 == 0) {
            println("number is even")
        } else {
            println("number is odd")
        }
    }

