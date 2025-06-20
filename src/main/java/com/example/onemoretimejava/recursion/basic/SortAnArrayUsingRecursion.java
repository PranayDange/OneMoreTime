package com.example.onemoretimejava.recursion.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArrayUsingRecursion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 7, 6, 4, 5, 9));

        sort(list);
        for (int num : list) {
            System.out.print(num + " ");

        }
    }

    public static void sort(List<Integer> list) {
        if (list.size() == 1) {
            return;
        }
        int temp = list.remove(list.size() - 1);
        sort(list);
        push(list, temp);
    }

    public static void push(List<Integer> list, int temp) {
        if (list.isEmpty() || list.get(list.size() - 1) <= temp) {
            list.add(temp);
            return;
        }
        int temp2 = list.remove(list.size() - 1);
        push(list, temp);
        list.add(temp2);

    }
}
