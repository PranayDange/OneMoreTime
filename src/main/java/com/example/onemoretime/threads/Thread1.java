package com.example.onemoretime.threads;

public class Thread1 extends Thread {
    Table t;

    public Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.display(5);
    }
}
