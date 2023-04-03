package com.example.onemoretime.multithreading;

public class Company {
    int n;
    boolean f = false;

    synchronized public void produced_item(int n) {
        if (f) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        System.out.println("Produced : " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() {
        if (!f) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;

    }
}
