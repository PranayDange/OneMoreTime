package com.example.onemoretime.syncroniztion;

public class Counter {
    private int count;

    public Counter() {
        int count = 0;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }


}
