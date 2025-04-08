package com.example.onemoretimejava.ninja.linkedlist.basic.part4;

import java.util.LinkedList;

public class InBuildLinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> n1 = new LinkedList<>();
        n1.add(1);
        n1.add(2);
        n1.add(3);
        n1.add(4);

        //for printing linked list
        System.out.println(n1);

        for (int i = 0; i < n1.size(); i++) {
            System.out.println(n1.get(i) + " ");
        }

        for (int list : n1) {
            System.out.println(list + " ");

        }

        //add element
        n1.add(4, 5);
        System.out.println("////////////////");
        System.out.println(n1);
        n1.addFirst(6);
        n1.addLast(7);

        //remove element
        // n1.remove();
        //n1.remove(1);
        // n1.remove(2);
        //n1.removeFirst();
        //n1.removeLast();

        System.out.println(n1.size());
        System.out.println(n1.contains(3)); // true
        //n1.clear();
        //System.out.println(n1.isEmpty()); // true


    }
}
