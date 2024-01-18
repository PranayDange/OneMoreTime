package com.example.onemoretimejava.multithreading;

public class MyThread implements Runnable {
    //creating thread  using Runnable interface
    public static void main(String[] args) {
        //create object of my thread class
        MyThread t1 = new MyThread();
        Thread thr = new Thread(t1);
        thr.start();


        //object of another thread class
        AnotherThread an = new AnotherThread();
        an.start();

    }

    @Override
    public void run() {
//task for thread
        for (int i = 0; i < 10; i++) {
            System.out.println("value of i" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
