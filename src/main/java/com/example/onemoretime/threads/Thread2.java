package com.example.onemoretime.threads;

public class Thread2 extends Thread {
    Table t;

    public Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.display(6);
    }
}
