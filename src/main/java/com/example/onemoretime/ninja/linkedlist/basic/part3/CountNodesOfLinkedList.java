package com.example.onemoretime.ninja.linkedlist.basic.part3;

public class CountNodesOfLinkedList {
    public static void main(String[] args) {
        Node head = createALinkedList();
        createALinkedList();
        System.out.println(length(head));

    }

    public static Node createALinkedList() {
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        Node n4 = new Node(2);
        Node n5 = new Node(6);
        Node n6 = new Node(1);
        Node n7 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        return n1;
    }

    public static int length(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
