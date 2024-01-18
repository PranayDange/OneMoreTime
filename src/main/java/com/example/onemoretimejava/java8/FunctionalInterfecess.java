package com.example.onemoretimejava.java8;

import java.util.Comparator;

public class FunctionalInterfecess {
    public static void main(String[] args) {
        //using object
        MyInterImpl sst = new MyInterImpl();
        sst.sayHello();


        //this is using anonymous class
        MyInterImpl ss = new MyInterImpl() {
            @Override
            public void sayHello() {
                System.out.println("anynomous class output");
            }
        };
        ss.sayHello();

        //using lambda
        MyFunctionalInterface ssr = () -> {
            System.out.println("this is inside lambda exp");
        };
        ssr.sayHello();


        // ExampleTwoFI ssq=(int a,int b)->{
        //or
        ExampleTwoFI ssq = (a, b) -> {
            System.out.println(a + b);
            return a + b;
        };
        ssq.sum(2, 2);

       // ExLengthIn ln=(s)->{
        //or
            ExLengthIn ln=(String s)->{
            return s.length();
        };

        System.out.println(ln.getLength("pranay madhukar"));

    }
    //Functional Interface
    //if the interface contains only one abstract method then it is called Functional interface
    // ex: Runnable,Callable,Comparable

    //to call lambda we need functional interface
    //lambda is used to implement functional interface in very short and simple manner
    // Ex.. Comparator,Runnable


}
