package com.example.onemoretimejava.recursion.basic;

public class  Program1 {
    public static void main(String[] args) {
        //write a function that prints hello world
        message();
        //if they say print hello world 5 times
       /* message();
        message();
        message();
        message();*/
        //or 5 sop

    }

    static void message() {
        System.out.println("Hello world!!");


        //if they say print hello world 5 times
       /* System.out.println("Hello world!!");
        System.out.println("Hello world!!");
        System.out.println("Hello world!!");
        System.out.println("Hello world!!");*/
        //or create 5 new function
        //in this case a function is calling another function
        message1();
    }

    static void message1() {
        System.out.println("Hello world!!");
        message2();
    }

    static void message2() {
        System.out.println("Hello world!!");
        message3();
    }

    static void message3() {
        System.out.println("Hello world!!");
        message4();
    }

    static void message4() {
        System.out.println("Hello world!!");
    }
}
