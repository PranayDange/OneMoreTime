package com.example.java8features.lambdaexpression;

import jnr.ffi.annotations.In;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainLambdaExample {
    public static void main(String[] args) {
        Employee ee = () -> {
            return "pranay";
        };
        Employee ee2 = () -> {
            return "samer";
        };
        System.out.println(ee.sayHello());
        System.out.println(ee2.sayHello());

        Runnable runnable = () -> {
            for (int i = 1; i < 10; i++) {
                System.out.println("hello " + i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();

        //Comparator Example
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(1);
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
    }
}
