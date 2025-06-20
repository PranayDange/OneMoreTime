package com.example.leetcode150.linkedlist;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNodeAdd l1 = new ListNodeAdd(2);
        l1.next = new ListNodeAdd(4);
        l1.next.next = new ListNodeAdd(3);

        // Second number: 465 (represented as 5 -> 6 -> 4)
        ListNodeAdd l2 = new ListNodeAdd(5);
        l2.next = new ListNodeAdd(6);
        l2.next.next = new ListNodeAdd(4);

        AddTwoNumbers solver = new AddTwoNumbers();
        ListNodeAdd result = solver.addTwoNumbers(l1, l2);

        // Print the result linked list
        printList(result);


    }
    public static void printList(ListNodeAdd node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public ListNodeAdd addTwoNumbers(ListNodeAdd l1, ListNodeAdd l2) {
        ListNodeAdd result = new ListNodeAdd(0);
        ListNodeAdd ptr = result;
        int carry = 0;
        // while (l1 != null && l2 != null) {
        while (l1 != null || l2 != null) {

            int sum = 0 + carry;//inititalize sum
            if (l1 != null) {//use number from first list
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {//use num from 2nd list
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new ListNodeAdd(sum);
            ptr = ptr.next;

        }
        if (carry == 1) {
            ptr.next = new ListNodeAdd(1);

        }
        return result.next;
    }
}

class ListNodeAdd {
    int val;
    ListNodeAdd next;

    ListNodeAdd() {
    }

    ListNodeAdd(int val) {
        this.val = val;
    }

    ListNodeAdd(int val, ListNodeAdd next) {
        this.val = val;
        this.next = next;
    }
}

