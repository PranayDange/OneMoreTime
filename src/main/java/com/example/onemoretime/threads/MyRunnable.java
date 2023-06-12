package com.example.onemoretime.threads;

public class MyRunnable implements Runnable {
    private TableByRunnable table;
    private int value;

    public MyRunnable(TableByRunnable table, int value) {
        this.table = table;
        this.value = value;
    }

    @Override
    public void run() {
        table.display(value);
    }
   /* public void run(){
        table.display(value);
    }*/
}
