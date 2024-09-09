package com.example.onemoretimejava;

public class Practice2 {
    public static void main(String[] args) {
        String ss = "   pranay's    ";
        System.out.println(reverse(ss));
    }

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr).trim();
    }

}
