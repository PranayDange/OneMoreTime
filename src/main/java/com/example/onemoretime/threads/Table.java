package com.example.onemoretime.threads;

public class Table {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);
        t1.start();
        t2.start();

    }

    public synchronized void display(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
