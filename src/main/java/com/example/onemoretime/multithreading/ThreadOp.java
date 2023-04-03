package com.example.onemoretime.multithreading;

class UserThread extends Thread {
    @Override
    public void run() {
        //task for thread
        System.out.println("this is user defined thread!!");
    }
}

public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("program started !!!");
        int x = 56 + 34;
        System.out.println("sum of x is : " + x);
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        System.out.println("current running thread is " + threadName);

        //set name for thread
        thread.setName("myMain");
        System.out.println(thread.getName());
        // System.out.println("current running thread is " + threadName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread.getId());


        //going to start user defined thread
        UserThread thread1 = new UserThread();
        thread1.start();


        System.out.println("program ended !!!");
    }
}
