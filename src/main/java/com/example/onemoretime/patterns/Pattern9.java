package com.example.onemoretime.patterns;

public class Pattern9 {
            /*1 2  3  4  5
            2 4  6  8  10
            3 6  9  12 15
            4 8  12 16 20
            5 10 15 20 25*/
    public static void main(String[] args) {
        print(5);

    }
    static void print(int n){
        for(int row = 1;row<=n;row++){
            for(int col =1;col<=n;col++){
                System.out.print(" "+(row*col));
            }
            System.out.println();
        }
    }
}
