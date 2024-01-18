package com.example.onemoretimejava.multithreading;

public class ThreadsOperations {
    public static void main(String[] args) {
        System.out.println("Program started");
        int x = 23 + 24;
        System.out.println("sum is " + x);

        Thread thread = Thread.currentThread();
        String tname = thread.getName();
        System.out.println("current thread name  " + tname);


        System.out.println("Program terminated");
    }
}
