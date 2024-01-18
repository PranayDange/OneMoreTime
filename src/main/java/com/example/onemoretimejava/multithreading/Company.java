package com.example.onemoretimejava.multithreading;

public class Company {


    int n;
    boolean flag = false;
    //f=false : chance : producer
    //flag=true chance :Consumer


    //synchronized is done so that while working on this method/thread no other task is done
    //other task can be performed ofter this task is completed
    synchronized public void produced_item(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        this.n = n;
        System.out.println("produced : " + this.n);
        flag = true;
        notify();
    }

    synchronized public int consume_item() {
        //this will wait until last process is not completed
        //this is called as inter process communication
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("comsumed item " + this.n);
        flag = false;
        notify();
        return this.n;
    }
}
