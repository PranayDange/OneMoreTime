package com.example.onemoretimejava.recursion.basic;

public class Program2 {
    public static void main(String[] args) {
        //write a function that takes in the number and prints it
        //print first 5 numbers :1,2,3,4,5
        print1(1);

       /* print1(2);
        print1(3);
        print1(4);
        print1(5);*/
    }

    static void print1(int n) {
        System.out.println(n);
        //the function calling another function
        //all this function have one thing in common
        //the body and the definition of the function is same
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    //here function body changes
    //because this is not calling anything
    static void print5(int n) {

        System.out.println(n);
    }

}
