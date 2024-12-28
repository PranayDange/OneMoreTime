package com.example.javamultithreading;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        //if you do not want to synchronize whole function then you can use synchronized block
       /* synchronized (this) {
            count++;
        }*/
        count++;//this part of code is also called critical section
    }

    public int getCount() {
        return count;
    }
}
