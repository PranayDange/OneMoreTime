package com.example.onemoretimejava.strings;

public class Comparison {
    public static void main(String[] args) {
        String a="pranay";
        String b="pranay";
        if(a==b){//check weather reference variable points to same object
            System.out.println("goooo");
        } else if (a.equals(b)) {//when you need to check only values use .equals
            System.out.println("suuuuuuu");
        }else {
            System.out.println("ddddudududududud");
        }
    }
}
