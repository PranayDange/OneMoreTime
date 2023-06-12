package com.example.onemoretime.syncroniztion;

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();


        //create multiple thread to access the shared counter object
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.decrement();
                }

            }
        });

        //start the threads
        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Print the final count
        System.out.println("Final Count: " + counter.getCount());
    }
}
