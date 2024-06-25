package com.example.onemoretimekotlin.kotlinbasic.coroutines

object Renameme {
    //ONE
    @JvmStatic
    fun main(args: Array<String>) {
        //Coroutine
        //1)
        //program is a set of instructions
        //process(Actual instance of your program)
        //--process consists of
        //process id
        //state
        //memory
        //Handling for networking ,file system etc
        //Thread(i.e., that is thread of execution)
        //ek program hai---use run karte hai toh---ek process create hota hai--our ye program ke ander jo instructions execute hori hai vo ek thread ke ander hori hai


        //2)
        //Sequential execution
        //process ke ander--instruction one by one execute hote...
        //problem with this is that ...if any instruction gets hold then other instruction are in problem
        //which will hamper the the execution
        //so to avoid this
        //we can run that instruction in diff thread

       // explain coroutine
        //suppose we have one task--and we need to execute that
        //so we ask thread pool to give us thread --task has started executing
        // suppose we are doing io operation...till the response comes this thread can perform another operation


        //Coroutines are executed inside a thread
        //one thread can have many coroutines
        //co--coating routines--functions
        //task are coprated so that there is minimum use of threads
        val list = listOf("")
        var arr: Array<Int> = arrayOf(1,2,3)
        var name:IntArray=IntArray(1)

        var listPair= listOf(Pair(1 to 1,"pranay"),Pair(2,"rajura"),Pair("pranay",1))
        println(listPair.first())
        println(listPair[1])
        var listTriple= listOf(Triple(1,2,3),Pair(2,"rajura"))
        println(listTriple.first())

        var listt= listOf(Pair(1,2),Pair(2,"Pranay"))

    }
}