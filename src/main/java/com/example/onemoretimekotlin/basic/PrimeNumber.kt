package com.example.onemoretimekotlin.basic

fun main(args: Array<String>) {
    //isPrime(8);
    allPrimeNumbersTillANumber(9)
}

fun isPrime(n: Int) {
    var flag = true;
    for (i in 2 until n) {
        if (n % i == 0) {
            flag = false
            break
        }

    }
    if (flag && n > 1) {
        println("$n  is prime  number")
    } else {
        println("$n  is prime not number")

    }

}

fun allPrimeNumbersTillANumber(n: Int) {
    for (i in 2..n) {
        var flag = true
        for (j in 2 until i) {
            if (i % j == 0) {
                flag = false
                break
            }
        }
        if (flag) {
            println("$i  is prime  number")

        } else {
            println("$i  is not  prime  number")

        }
    }
}