package com.example.onemoretimejava.ninja.linkedlist.basic.part2;

import jnr.ffi.annotations.In;

public class FindElementAtPosition {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        printIthNode(head, 20);
    }

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1;//this will only create a reference
        n1 = new Node<>(10);//this will create a new object/node
        //Node<Integer> n1; //this will only create a reference
        //n1=new Node<>(10); //this will create a new node
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        //Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        //System.out.println("n1 " + n1 + "data " + n1.data + "next " + n1.next);
        n2.next = n3;
        //n3.next = n4;
        return n1;//return first node of the list
    }

    public static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int position = 0;
        while (temp != null && position < i) {
            temp = temp.next;
            position++;

        }
        if (temp != null) {
            System.out.println(temp.data);

        }
    }

}
