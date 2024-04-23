package com.example.onemoretimekotlin.interview

enum class Color {
    RED, GREEN, BLUE
}

enum class Color2(val enums: String) {
    RED("lightred"),
    GREEN("lightgreen"),
    BLUE("lightblue")
    // BLUE(val enums: String)//in enum it is not allowed to do so because enum only stores constant values
    //it cannot hold any dynamic objects or any kind of variables whose values can change in future
    //to overcome this restriction we have sealed class in kotlin
    //sealed means(restrictions)//some kind of restriction to your class
    //but ofcouse it is more flexible than enum class
    //class  >  sealed class  > enum class
}