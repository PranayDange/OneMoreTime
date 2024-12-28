package com.example.onemoretime.ninja.trees.basic01;

public class BinaryTreeNode<T> {
    //keeping BinaryTreeNode class as generic because our node can have any type of data

    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
