package com.example.java8features;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        //Example 1
        /*List<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(12);
        list.add(18);
        list.add(4);
        list.add(1);
        list.add(7);
        //Collections.sort(list);
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);*/

        //Example 2
        Set<Integer> s = new TreeSet<>();
        //set is the interface
        //hashset // order is ramdom
        // treeset --to keep things in order use tree set
        s.add(22);
        s.add(1);
        s.add(13);
        //System.out.println("Before manual sorting" + s);
        Set<Integer> ss = new TreeSet<>((a, b) -> b - a);
        ss.add(22);
        ss.add(1);
        ss.add(13);
        // System.out.println("after manual sorting desc: " + ss);

        Map<Integer, String> m = new TreeMap<>();
        m.put(2, "z");
        m.put(3, "f");
        m.put(1, "y");
        System.out.println("Before sorting:" + m);
        Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
        mm.put(2, "z");
        mm.put(3, "f");
        mm.put(1, "y");
        System.out.println("After manual sorting: " + mm);


    }
}
