package com.example.onemoretimejava.recursion.basic;

import jnr.ffi.annotations.In;

import java.util.Stack;

public class ReverseAStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(6);
        stack.push(4);
        stack.push(5);
        stack.push(9);

        System.out.println("Original Stack (Top to Bottom): " + stack);
        reverseStack(stack);
        System.out.println("Sorted Stack (Top to Bottom): " + stack);
    }

    static void reverseStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }

        int popped = stack.pop();
        //System.out.println(popped + "d");
        reverseStack(stack);
        insertAtBottom(stack, popped);
    }

    static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);

    }
}
