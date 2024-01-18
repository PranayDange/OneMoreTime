package com.example.onemoretimejava.java8;

public class ThreadDemo {
    public static void main(String[] args) {
        //first thread : THread :Jhon
        Runnable thread1 = () -> {
//this is the body of the thread
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(thread1);
        t1.setName("jhon");
        t1.start();
    }
}
