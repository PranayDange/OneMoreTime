package com.example.onemoretime.recursion.kkreucrsionbasic;

public class NumbersExample {
    public static void main(String[] args) {
        //write a function that takes a number and print it
        //take first 5 numbers :1 2 3 4 5
        print1(1);
    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
        //function calling another function
        //i.,e funtion print1 is calling print2

        //also
        //they have one thing in common the body and definition of the function is same only name is different
        // and they perform same task
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    //function body here is changed
    static void print5(int n){
        System.out.println(n);
    }
}
