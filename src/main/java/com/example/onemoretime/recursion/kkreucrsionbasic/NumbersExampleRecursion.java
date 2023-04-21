package com.example.onemoretime.recursion.kkreucrsionbasic;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes a number and print it
        //take first 5 numbers :1 2 3 4 5
        print(1);
    }

    static void print(int n) {
        //this is base condition (in recursion)
        //it is a condition where recursion will stoping making new calls
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        //when you have the last statement in a function call it is called as tail recursion
      //  this is last function call
        print(n + 1);//this function is calling itself

        //if you are calling function again and again , you can treat it as a separate call in the stack
        //as many times as you call a function it will take memory separately


        //if there is no base condition function call will keep on happening
        //stack will be keep getting filled again and again
        //and we know that every call of a function will take memory
        //after some time memory will exceed the limit ---this is going to give StackOverFlow


    }

}
