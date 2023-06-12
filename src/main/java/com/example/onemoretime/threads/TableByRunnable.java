package com.example.onemoretime.threads;

public class TableByRunnable {
    public static void main(String[] args) {

        TableByRunnable table = new TableByRunnable();
        MyRunnable run1 = new MyRunnable(table, 5);
        MyRunnable run2 = new MyRunnable(table, 6);
        run1.run();
        run2.run();
    }

    public synchronized void display(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
