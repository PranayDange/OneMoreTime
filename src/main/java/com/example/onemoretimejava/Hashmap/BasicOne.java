package com.example.onemoretimejava.Hashmap;

import jnr.ffi.annotations.In;

import java.util.HashMap;
import java.util.HashSet;

public class BasicOne {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("pranay", 34);
        map.put("prajwal", 35);
        map.put("prabhat", 36);
        map.put("pankaj", 37);
      /*  System.out.println(map.get("prabhat"));
        System.out.println(map.getOrDefault("stan", 55));
        System.out.println(map.containsKey("stan"));
        System.out.println(map.containsKey("pranay"));*/


        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(57);
        set.add(51);//if we add duplicate it won't add
        set.add(59);
        set.add(51);
        System.out.println(set);
    }


}
