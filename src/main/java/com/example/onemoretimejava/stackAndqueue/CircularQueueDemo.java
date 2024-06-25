package com.example.onemoretimejava.stackAndqueue;

class CircularQueue {
    private int[] queue;
    private int front;  // Points to the front element in the queue
    private int rear;   // Points to the next insertion position
    private int size;   // Current number of elements in the queue
    private int capacity; // Total capacity of the queue

    // Constructor to initialize the circular queue with a specific capacity
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to insert an element into the queue
    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return false;
        }

        // Insert at rear and increment rear with wrap-around
        queue[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }

        int data = queue[front];
        front = (front + 1) % capacity; // Increment front with wrap-around
        size--;
        return data;
    }

    // Method to get the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return queue[front];
    }

    // Method to get the current size of the queue
    public int getSize() {
        return size;
    }
}


public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5); // Circular queue with capacity of 5

        // Test enqueue operation
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Peek: " + queue.peek()); // Outputs: Peek: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Outputs: Dequeue: 1

        queue.enqueue(5);
        queue.enqueue(6); // Now the queue is full

        // Testing full condition
        if (!queue.enqueue(7)) {
            System.out.println("Queue is full, cannot enqueue 7.");
        }

        // Emptying the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        // Testing empty condition
        try {
            queue.dequeue(); // Should throw an exception
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
