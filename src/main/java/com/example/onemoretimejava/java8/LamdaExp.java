package com.example.onemoretimejava.java8;

public class LamdaExp {
    public static void main(String[] args) {

    }

   /* what is lambda expression?
    a function with no name,no modifier,no return type
    lambda expression can we used only in functional interfaces only
    */

    /*
    ()->{
            System.out.println("hello");
        }
    */
    public void m1() {
        System.out.println("hello");

    }

    public int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
   /*
    (int a,int b)->{
        System.out.println(a+b);
        return (a+b);
    }
    //or
    ( a, b)->{F
        System.out.println(a+b);
        return (a+b);
    }
    */
}
