package com.example.onemoretimejava.ninja.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        //Que Maximum number of a character in a string
        //MAx --256 character

        //Given a string find the maximum occurring word

        //to add value
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 1);
        map.put("def", 2);

        System.out.println("size : " + map.size());
        //check key is present
        if (map.containsKey("abc")) {
            System.out.println("has abc");

        }
        if (map.containsKey("abc1")) {
          System.out.println("has abc1");
        }

        //get value corresponding to key
        int v = map.get("abc");
        System.out.println(v);

      //  int v1 = map.get("abc1");///what get does is if key is not there then it will return null ...which will throw nullpointerexception
      //  System.out.println(v1);

        //to avoid this we can do this way
        int v2 = 0;
        if (map.containsKey("abc1")) {
            v2 = map.get("abc");
        }
        System.out.println(v2);


        //remove
        int s = map.remove("abc");
        System.out.println(s);


        //to to operations on value but this task will be done in o(n)
        if (map.containsValue(2)) {
            System.out.println("has 2 as a value");
        }


        //iterate over map
        Set<String> keys = map.keySet();
        for (String str : keys) {
            System.out.println(str);//it can be in any order
        }
        //the way we have keyset we have value set also

    }
}
