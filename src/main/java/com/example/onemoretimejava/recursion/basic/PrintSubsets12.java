package com.example.onemoretimejava.recursion.basic;

public class PrintSubsets12 {
    public static void main(String[] args) {
        solve("ab", "");
    }

    static void solve(String ip, String op) {
        if (ip.isEmpty()) {
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op2 += ip.charAt(0);
        ip = ip.substring(1);
       // System.out.println(ip);

        solve(ip, op1);
        solve(ip, op2);

        // Include the first character
        //solve(ip.substring(1), op + ip.charAt(0));

        // Exclude the first character
        //solve(ip.substring(1), op);
    }
}
