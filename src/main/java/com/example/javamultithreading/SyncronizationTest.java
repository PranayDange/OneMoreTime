package com.example.javamultithreading;

public class SyncronizationTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadSycronization t1 = new MyThreadSycronization(counter);
        MyThreadSycronization t2 = new MyThreadSycronization(counter);
        //one object(here..counter) is shared between multiple threads(t1 and t2)
        t1.start();
        t2.start();
        try {
            t1.join();
            //join isiliye karana pada kyu ki jb ye dono finish ho jaye tb hmm print kare
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount());


    }
}
