package com.example.onemoretimejava.recursion.basic;

import java.util.Stack;

public class DeleteMiddleElementOfAStack {
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
        deleteMid(stack);
        System.out.println("Sorted Stack (Top to Bottom): " + stack);


    }

    static void deleteMid(Stack<Integer> stack) {
        //  Stack<Integer> inte = new Stack<>();

        int mid = (stack.size() / 2) + 1;

        deleteKthElement(stack, mid);

    }

    static void deleteKthElement(Stack<Integer> stack, int k) {
        if (k == 1) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteKthElement(stack, k - 1);
        stack.push(temp);

    }
}
