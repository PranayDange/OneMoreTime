package com.example.onemoretime;

public class ConditionsAndLoops {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        // 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
        byte b = 50;
        // b =  b * 50; //this cannot be done as as byte can store only upto 128 only so have to cast it
        b = (byte) (b * 50); //-60
        /*int result  =b*50;
        b=(byte) result;*/
        // b = (int) (b * 50);
//        System.out.println(b);


        double c = 6 / 4;//as both operands are integer it will give output as 1.0
        double f = 6.0 / 4.0;////as both operands are integer it will give output as 1.5
        int d = 6 / 4;//1
        double e = c + d;//2.0
       /* System.out.println(c);
        System.out.println(f);
        System.out.println(d);
        System.out.println(e);*/


        double g = 55.5;
        int h = 55;
        //g = (int) g % 10;//5.0
        g = g % 10;//5.5
        h = h % 10;
        System.out.println(g + " " + h);


    }
}
