package com.example.javaCollection;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.remove(Integer.valueOf(11));
        System.out.println(list);
    }
}
