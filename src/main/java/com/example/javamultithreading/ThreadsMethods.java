package com.example.javamultithreading;

public class ThreadsMethods extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -priority: " + Thread.currentThread().getPriority() + " -count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            // System.out.println(i);
        }
        //System.out.println("Thread is Running...");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadsMethods t1 = new ThreadsMethods();
        t1.start();
        // t1.join();
        //System.out.println("hello");

    }
}


//1.start 2.run 3.sleep