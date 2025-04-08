package com.example.onemoretimejava.ninja.linkedlist.basic.part2;

import jnr.ffi.annotations.In;

import java.util.Scanner;

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
        //Node<Integer> head = takeInput();
        // head = insert(head, 80, 0);
        head = delete(head, 1);
        //System.out.println("head " + head);
        printLinkedList(head);
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

    public static void printLinkedList(Node<Integer> head) {
        System.out.println("head " + head);
        Node<Integer> temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;//just like to move forward in array we write i++
            //in linked list we write head = head.next;

        }        /*System.out.println(head.data);//10
        System.out.println(head.next);
        System.out.println(head.next.data);//20
        System.out.println(head.next.next.data);//30
        System.out.println(head.next.next.next.data);//40*/

    }

    public static Node<Integer> insert(Node<Integer> head, int ele, int pos) {
        Node<Integer> nodeToBeInserted = new Node<>(ele);

        if (pos == 0) {
            nodeToBeInserted.next = head;
            // head = nodeToBeInserted;
            return nodeToBeInserted;
        } else {
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }
        }
        // printLinkedList(head);
        return head;

    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {

        // Node<Integer> nodeToBeInserted = new Node<>(ele);

        if (head == null) {
            //nodeToBeInserted.next = head;
            // head = nodeToBeInserted;
            return head;
        }

        if (pos == 0) {
            return head.next; // Move head to the next node
        }

        // else {
        int count = 0;
        Node<Integer> prev = head;
        while (count < pos - 1 && prev != null) {

            prev = prev.next;
            count++;
        }
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next; // Skip the node at position `pos`
        }
        // }
        // printLinkedList(head);
        return head;

    }

    public static Node<Integer> delete2(Node<Integer> head, int pos) {

        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        Node<Integer> current=head;

        for(int i=0;i<pos-1 && current !=null;i++){
            current=current.next;
        }

        if(current==null || current.next==null){
            return head;
        }

        Node<Integer> temp=current.next;
        current.next=temp.next;
        temp=null;
        return head;
    }



    //take input for linked list then return the linked list
    static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;

                }
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
}
