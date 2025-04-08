package com.example.leetcode150.linkedlist;


import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //Create the cycle (pos = 1 means tail connects to node2)
        node4.next = node2;
        LinkedListCycle solution = new LinkedListCycle();
        boolean result = solution.hasCycle(node1);
        System.out.println("Ans is:- " + result);
    }

    //Input: head = [3,2,0,-4], pos = 1
/*
    Time Complexity:
    O(n) — You visit each node once at most.contains() and .add() in a HashSet are O(1) on average.
    So overall time = O(n), where n is the number of nodes.

    Space Complexity:
    O(n) — You store up to n node references in the HashSet in the worst case (no cycle).*/
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return true;

            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }


  /*  Time Complexity:
    O(n) — In the worst case, fast and slow pointers will meet after at most n steps.
    Fast moves 2 steps, slow moves 1 step — they either meet or reach the end.

    Space Complexity:
    O(1) — Only two pointers (slowPointer and fastPointer) are used, no extra data structures.*/

    public boolean hasCycle2(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


