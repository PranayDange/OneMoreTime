package com.example.onemoretimejava.javacollection.queueInterface;

import jnr.ffi.annotations.In;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.offer(30);//this handles exception
        //add() -- inserts the specified element into the queue.if the task is successful add() return true, if not throws an exception.
        //offer() -- inserts the specified element into the queue.if the task is successful offer() return true, if not it returns false.
        //element() -- returns the head of the queue. throws the exception if queue is empty
        //peek() -- returns the head of the queue. returns null if queue is empty
        //remove() --returns and removes the head of the queue.throws an exception if queue is empty
        //poll() --returns and removes the head of the queue.returns null if queue is empty

        System.out.println(qu.peek());
        qu.poll();
    }
}
