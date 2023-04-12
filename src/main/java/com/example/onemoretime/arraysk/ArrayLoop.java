package com.example.onemoretime.arraysk;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] att = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        print(att);
        System.out.println("****************************************************************");
        print1(att);
        System.out.println("****************************************************************");
        print2(att);

    }

    static void print(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(" value of  i is " + i);
        }
    }


    static void print1(int[] arr) {
        for (int i = 1; i <= arr.length; i = i + 1) {
            System.out.println(" value of  i is " + i);
        }
    }

    static void print2(int[] arr) {
        for (int i = 1; i <= arr.length; i = i + 2) {
            System.out.println(" value of  i is " + i);
        }
    }
}
