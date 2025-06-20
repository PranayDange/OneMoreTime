package com.example.onemoretimejava.recursion.basic;

import com.example.onemoretimejava.ninja.linkedlist.basic.part3.Node;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        // Build the tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Call the method and print the result
        System.out.println("Height of tree: " + heightOfTree(root));

    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }


    static int heightOfTree(Node root) {
        if (root == null) {
            return 0;

        }

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return 1 + Math.max(lh, rh);
    }
}
