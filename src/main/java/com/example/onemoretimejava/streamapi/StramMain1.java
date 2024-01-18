package com.example.onemoretimejava.streamapi;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StramMain1 {
    public static void main(String[] args) {
        //create a list and filter all even numbers from the list

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 55, 56, 59, 87, 112);
        System.out.println(list1);
        //this list1 has immutable object you cannot add anything to it it will give exception
        //you cannot change the list
        // list1.add(24);//this will give excetion//UnsupportedOperationException

        List<Integer> list2 = new ArrayList<>();
        //can list contain duplicate elements yes
        //if you do not want duplicate then use set ex.hashset set treeset
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(7);
        System.out.println(list2);

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 5);
        System.out.println(list3);
        //this list3 is also  has immutable object you cannot add anything to it it will give exception

        //without stream
        List<Integer> ss = new ArrayList<>();
        for (int i = 1; i <= list1.size(); i++) {
            if (i % 2 == 0) {
                ss.add(i);
            }

        }
       /* for(int insert :list1){
            if (insert % 2 == 0) {
                ss.add(insert);
            }
        }*/
        System.out.println(ss);

        //using stream api
        // Stream<Integer> stream = list1.stream();
        // List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());


        List<Integer> collect1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("stream " + collect1);

        //it this i -> i % 2 == 0 returns true then only it will collect that element
        //boolean value function --> which is also called predicate
        //if it is true then it will filter if false then it won't

        //give number which are greater than 50
        List<Integer> collect = list1.stream().filter(i -> i >= 50).collect(Collectors.toList());
        System.out.println("greater than 50 "+collect);
    }
}
