package com.example.onemoretimejava.recursion.basic;

import java.util.Stack;

public class SortAStack {
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
        sortStack(stack);
        System.out.println("Sorted Stack (Top to Bottom): " + stack);


    }

    static void sortStack(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int top = stack.pop();
        sortStack(stack);
        insertInSortedStack(stack, top);

    }

    static void insertInSortedStack(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int top = stack.pop();
        insertInSortedStack(stack, temp);
        stack.push(top);
    }
}
