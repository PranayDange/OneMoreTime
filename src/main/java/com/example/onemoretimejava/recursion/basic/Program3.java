package com.example.onemoretimejava.recursion.basic;

public class Program3 {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        //in recursion we need to add check condition to end last function
        //this is also called base condition
        //this is a condition will stop making new calls

        //base condition
        if (n == 5) {
            System.out.println(5);
            return;
        }
        //body
        System.out.println(n);
        //recursive call
        //this is the last statement in the function call
        //this is also called tail recursion
        print(n + 1);
    }
}
