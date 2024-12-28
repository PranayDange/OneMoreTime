package com.example.onemoretime.ninja.linkedlist.basicpractice;

import jnr.ffi.annotations.In;

public class LinkedListPractice {
    public static void main(String[] args) {
        Node<Integer> head = createLinkedList();
        //System.out.println(lengthOfLinkedList(head));
        //printIthNode(head, 2);

        // head = firstElementInLinkedList(head);
        System.out.println(lastElementInLinkedList(head));
        printLinkedListUsingRecursion(head);

    }

    static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    static void printLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static void printLinkedListUsingRecursion(Node<Integer> head) {
        if (head == null) {
            return;
        }
        // Node<Integer> temp = head;


        System.out.print(head.data + " ");
        //temp = temp.next;
        printLinkedListUsingRecursion(head.next);
    }

    static void increment(Node<Integer> head) {
        head.data++;

    }

    static void increment2(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            temp.data++;
            temp = temp.next;
        }

    }

    static int lengthOfLinkedList(Node<Integer> head) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //find ith node
    static void printIthNode(Node<Integer> head, int i) {
        Node<Integer> temp = head;
        int position = 0;
        while (temp != null && position < i) {
            position++;
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println(temp.data);
        }
    }

    //insert in linkedlist
    static Node<Integer> insert(Node<Integer> head, int ele, int pos) {
        Node<Integer> nodeToBeCreated = new Node<Integer>(ele);

        if (pos == 0) {
            return nodeToBeCreated;
        } else {


            Node<Integer> prev = head;
            int count = 0;
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodeToBeCreated.next = prev.next;
                prev.next = nodeToBeCreated;
            }
        }
        return head;
    }

    static Node<Integer> insertRecursive(Node<Integer> head, int ele, int pos) {
        if (head == null && pos > 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(ele);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insertRecursive(head.next, ele, pos - 1);
            return head;
        }

    }

    static Node<Integer> delete(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        Node<Integer> prev = head;
        int count = 0;
        while (count < pos - 1 && prev != null) {
            prev = prev.next;
            count++;
        }
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }
        return head;
    }

    static Node<Integer> deleteRecursively(Node<Integer> head, int pos) {
        if (head == null || pos < 0) {
            return head; // Return the original head if position is invalid
        }
        if (pos == 0) {
            return head.next;
        } else {
            head.next = delete(head.next, pos - 1);
            return head;
        }

    }
//reverse a linked list best case 0 of n square

    public static Node<Integer> reverseRec(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> smallerHead = reverseRec(head.next);


        Node<Integer> tail = smallerHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        head.next = null;

        return smallerHead;

    }

    //reverse a linked list best case 0 of n
    public static Node<Integer> reverseBEst(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> smallerHead = reverseBEst(head.next);
        Node<Integer> reverseTail = head.next;
        reverseTail.next = head;
        head.next = null;
        return smallerHead;
    }

    //find the middle element of linked list
    //calculate the length of the linked list then divide by 2
    public static Node<Integer> midPoint(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;

        }
        int mid = length / 2;
        Node<Integer> current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current;
    }

    //finding midpoint using slow and fast pointer
    public static Node<Integer> midPoint2(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    //find the first element of the linked list
    public static int firstElementInLinkedList(Node<Integer> head) {
        return head.data;
    }

    //find the last element of the linked list
    public static int lastElementInLinkedList(Node<Integer> head) {
        if (head.next == null) {
            return head.data;
        }
        return lastElementInLinkedList(head.next);
    }


    //find a node in a linkedList
    public static Node<Integer> findNodeRec(Node<Integer> head, int n) {
        if (head == null) {
            return head;
        }


        Node<Integer> nodeRec = findNodeRec(head.next, n);
        if (nodeRec.data == n) {
            return head;

        }
        return head;
    }


}
