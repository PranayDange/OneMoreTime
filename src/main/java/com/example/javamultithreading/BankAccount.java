package com.example.javamultithreading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private static final Logger log = LoggerFactory.getLogger(BankAccount.class);
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    //synchronized --automatic locks
   /* public synchronized void withDraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " Proceeding with withdraw ");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed balance. Remainging balance " + balance);


        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance ");

        }
    }*/

    public void withDraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {

            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal ");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Efficient balance ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock,will try later");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();

        }
    }
}
