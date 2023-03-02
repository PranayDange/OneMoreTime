package com.example.onemoretime.basic;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    /* Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
     you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
     Input Format :3 integers - S, E and W respectively*/
  /*  o/p=        0   -17
                20  -6
                 40  4
                60  15
                80  26
                100 37*/
    public static void main(String[] args) {
        System.out.println("Fahrenheit To Celsius Table");
        System.out.println("enter temperature");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        while (S <= E) {
            int cel = ((S - 32) * 5) / 9;
            System.out.println(S + " " + cel);
            S = S + W;
        }

    }
}
