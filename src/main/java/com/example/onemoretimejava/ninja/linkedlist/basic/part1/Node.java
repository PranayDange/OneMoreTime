package com.example.onemoretimejava.ninja.linkedlist.basic.part1;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        //next=null;//this statement is not required because default value of any reference in an object is null
    }
}
