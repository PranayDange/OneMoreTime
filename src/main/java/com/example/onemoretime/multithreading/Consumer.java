package com.example.onemoretime.multithreading;

public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }

    @Override
    public void run() {
        while (true){
            this.c.consume_item();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
