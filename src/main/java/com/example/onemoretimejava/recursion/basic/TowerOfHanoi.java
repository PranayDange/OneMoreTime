package com.example.onemoretimejava.recursion.basic;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int i = towerOfHanoi(3, 1, 3, 2);
        System.out.println(i);
    }

    public static int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);

            return 1;
        }
        int moves = 0;
        moves += towerOfHanoi(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);

        moves++;
        moves += towerOfHanoi(n - 1, aux, to, from);
        return moves;

    }
}
