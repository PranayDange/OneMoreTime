package com.example.onemoretimekotlin.arrays


fun main() {
    /*
Que...
for(i in 1..arr2.size){
for(int i=1;i<=arr.lenght();i++)
why in java we use length and in kotlin size

ANS:
ChatGPT
The difference in terminology (length in Java and size in Kotlin) is mainly due to the fact that arrays and collections are treated differently in these two languages.

In Java:
The length property is used for arrays. For example: arr.length.
The length() method is used for strings. For example: str.length().

In Kotlin:
The size property is used for both arrays and collections. For example: arr.size or list.size.
Kotlin strives for consistency, and the use of the size property for both arrays and collections makes the language more uniform and user-friendly.
It helps to have a consistent way of obtaining the size of data structures regardless of whether they are arrays or collections.

In summary, while Java uses different terms (length for arrays and length() for strings),
Kotlin opts for a more consistent approach by using size for both arrays and collections.
This is part of Kotlin's effort to improve and simplify the language syntax.*/
    val arr = arrayOf(1, 2, 3, 4, 5, 6)
    for (i in 1..arr.size) {
        //  println(i)
    }

    val arr2 = IntArray(5);
    arr[0] = 1
    arr[1] = 2
    arr[2] = 3
    arr[3] = 4
    arr[4] = 5
    for (i in 1..arr2.size) {
      //  println(i)
    }

   /* val str = arrayOf("jhon","cena","edge","brock","lesnar")
    for(i in 0 ..str.size-1){
       // for(i in str.indices){
        println(str[i])
    }*/
    val str = "hello"

// Using a range of indices
    for (i in str.indices) {
        println(str[i])
    }
            //kotlin does not have charAt fun()
}
