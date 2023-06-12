package com.example.onemoretime.oops;

public class StaticClass {
    static private int counter;


  /*  first static block is called or main method in java??
   ans - : After the static blocks have completed execution, the main method is called.
    The code inside the main method is executed.*/

    static {
        counter = 5;
        System.out.println("inside static");

    }

    public static void main(String[] args) {
        System.out.println("inside main");


        System.out.println("value of counter is : " + counter);

    }
}
