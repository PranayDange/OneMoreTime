package com.example.onemoretimejava.multithreading;

public class AnotherThread extends Thread {
    public static void main(String[] args) {
        //creating thread using Thread class
    }

    public void run() {
        //task for thread
        for (int i = 10; i > 0; i--) {
            System.out.println("another thread  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
