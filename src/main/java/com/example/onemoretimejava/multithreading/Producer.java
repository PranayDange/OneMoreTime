package com.example.onemoretimejava.multithreading;

public class Producer extends Thread {
    Company c;

    public Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            this.c.produced_item(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
