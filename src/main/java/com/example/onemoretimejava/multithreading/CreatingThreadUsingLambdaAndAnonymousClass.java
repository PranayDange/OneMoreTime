package com.example.onemoretimejava.multithreading;

public class CreatingThreadUsingLambdaAndAnonymousClass {
    public static void main(String[] args) {
        System.out.println("Creating thread in java");
        System.out.println(Thread.currentThread().getName());
        CreatingThreadUsingLAndAMain ss = new CreatingThreadUsingLAndAMain();
        Thread t1 = new Thread(ss);
        t1.start();


        //anonymous class
        //a class which does not have any name
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am " + Thread.currentThread().getName());
            }
        };
        Thread t3 = new Thread(t2);
        t3.start();

        //Lambda for creating threads
        Runnable t5 = () -> {
            System.out.println("this is thread " + Thread.currentThread().getName());
        };
        Thread t6 = new Thread(t5);
        t6.start();

    }
}
