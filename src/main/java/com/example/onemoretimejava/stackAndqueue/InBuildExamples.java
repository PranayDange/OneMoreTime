package com.example.onemoretimejava.stackAndqueue;

import java.util.*;

public class InBuildExamples {
    public static void main(String[] args) {
        // Stack<Integer> stackkk = new Stack<>();
        //this will be in heap memory (new Stack<>())
        //this will be in stack memory (stackkk)

       /* stackkk.push(34);
        stackkk.push(45);
        stackkk.push(2);
        stackkk.push(9);
        stackkk.push(18);

        System.out.println(stackkk.pop());
        System.out.println(stackkk.pop());
        System.out.println(stackkk.pop());
        System.out.println(stackkk.pop());
        System.out.println(stackkk.pop());*/
        //System.out.println(stackkk.pop());

        // Queue<Integer> queue=new Queue//this is not possible because queue is an interface//so we cannot make
        // Queue<Integer> queue = new LinkedList<>();
        //stack is a class
        //queue is an interface
        //interface --it tells us what to do not how to do it

       /* That's correct. In Java, you cannot create instances of interfaces directly because interfaces are abstract blueprints that define methods but do not provide implementations.
        The purpose of an interface is to define a contract that classes must follow, not to create objects.*/


        /*queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);
        System.out.println(queue.peek());//peek just gets the item but does not remove the item..the head of this queue
        System.out.println(queue.remove());//here first element is removed
        System.out.println(queue.remove());*/

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(3);
        deque.addFirst(4);
        deque.addLast(45);
        deque.removeFirst();
        deque.removeLast();


    }
}
