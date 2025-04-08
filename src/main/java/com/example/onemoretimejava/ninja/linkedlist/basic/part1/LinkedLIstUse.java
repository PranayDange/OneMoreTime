package com.example.onemoretimejava.ninja.linkedlist.basic.part1;

public class LinkedLIstUse {
    public static void main(String[] args) {
        // Node n1;//this is a reference
        // Node n1 =new Node(3);//this is a object

        //create a object
        Node<Integer> n1 = new Node<>(10);
        //System.out.println(n1);
        //System.out.println(n1.data);
        // System.out.println(n1.next);

        Node<Integer> head = createLinkedList();
        System.out.println("head " + head);
        printLinkedList(head);
    }

    public static Node<Integer> createLinkedList() {
        Node<Integer> n1;//this will only create a reference
        n1 = new Node<>(10);//this will create a new object/node
        //Node<Integer> n1; //this will only create a reference
        //n1=new Node<>(10); //this will create a new node
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        //System.out.println("n1 " + n1 + "data " + n1.data + "next " + n1.next);
        n2.next = n3;
        n3.next = n4;
        return n1;//return first node of the list
    }

    public static void printLinkedList(Node<Integer> head) {
        System.out.println("head " + head);
        System.out.println(head.data);//10
        System.out.println(head.next);
        System.out.println(head.next.data);//20
        System.out.println(head.next.next.data);//30
        System.out.println(head.next.next.next.data);//40

    }
}
