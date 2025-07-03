package com.example.onemoretimekotlin.kotlinbasic.coroutines

import kotlinx.coroutines.*


class Practice2 {
}

fun main() = runBlocking {
    val user = withContext(Dispatchers.IO) {
        println("Fetching user...")
        delay(1000)
        "John"
    }

    val posts = withContext(Dispatchers.IO) {
        println("Fetching posts...")
        delay(1000)
        "Posts"
    }

    println("User  --> $user - $posts")




    val userDeferred = async(Dispatchers.IO) {
        println("Fetching user...")
        delay(1000)
        "John"
    }

    val postsDeferred = async(Dispatchers.IO) {
        println("Fetching posts...")
        delay(1000)
        "Posts"
    }

    val user2 = userDeferred.await()
    val posts2 = postsDeferred.await()
    println("user2   --> $user2 - $posts2")

}