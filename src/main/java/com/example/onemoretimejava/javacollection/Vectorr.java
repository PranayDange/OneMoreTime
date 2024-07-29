package com.example.onemoretimejava.javacollection;

public class Vectorr {
    public static void main(String[] args) {
      /*  the vector class is implementation of list interface that allows us to create resizable - arrays similar to the Arraylist class
        the vector class synchronizes each individual operation. This means  whenever we want to perform some operation on vectors, the vector class automatically
        applies a lock to  that operation

        it is because when one thread is accessing  a vector and at the same time another thread tries to access it , an exception called
        concurrentModificationException is generated..hence continuous use of lock for each operation makes vectors less efficient.*/

/*        for example  lets say single instance of time pe do wektti same value change  karne ki koshish kr rahe hai..this is also called race condition
        same instance of time pe do diff/multiple users same value ko modify karne ki koshish kr raha hai..(race condition)*/


    }
}
