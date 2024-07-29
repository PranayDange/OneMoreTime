package com.example.onemoretimejava.javacollection.queueInterface;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //the queue interface of the java collections framework provides the functionality of the queue data structure ..it extends the collection interface
        //Linked-list implementation of queue
        Queue<String> animal = new LinkedList<>();

        //Array implementation of queue
        Queue<String> animal2 = new ArrayDeque<>();
        //priority implementation of queue
        Queue<String> animal3 = new PriorityQueue<>();
    }
}
