package com.example.onemoretimejava.javacollection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Collection<Integer> coll = new ArrayList<>();
        //refernce Collection<Integer>,, List<Integer> ,,,ArrayList<Integer>
        //some common methods of collection
        //add,size,remove,iterator,addAll,removeAll,clear

        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.add(40);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);

        list.add(101);
        list.add(102);

        arr.addAll(list);
        System.out.println(arr);

        arr.removeAll(list);
        System.out.println(arr);

        arr.add(1);
        arr.add(2);
        arr.add(2);

        //iterator
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());

        }

        //some more methods
        //get,set,toArray,contains
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(134);
        System.out.println(list2.get(2));
        ;

        list2.set(2, 101);
        System.out.println(list2);

    }
}
