package com.example.javamultithreading;

public class MyThreadSycronization extends Thread {
    private Counter counter;

    public MyThreadSycronization(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
