package com.example.javamultithreading;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private static final Logger log = LoggerFactory.getLogger(ReentrantExample.class);
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println(" outer method ");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("Inner method");

        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outerMethod();
    }
}
