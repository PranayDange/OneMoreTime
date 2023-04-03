package com.example.onemoretime.multithreading;

public class MyThread implements Runnable {
    //creating thread using runnable interface
    @Override
    public void run() {
        //task for thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        //create a object of mythread class
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        MyAnotherThread thread1 = new MyAnotherThread();
        thread1.start();
        thread.start();
    }
}
