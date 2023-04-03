package com.example.onemoretime.multithreading;

public class MyAnotherThread extends Thread {
    //crating thread using thread class

    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("value of i in reverse order " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyAnotherThread thread = new MyAnotherThread();
        thread.start();
    }
}
