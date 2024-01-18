package com.example.onemoretimejava.streamapi;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //stream api  -->collection process
        //collection //group of object

        String[] names = {"pranay", "jhon", "cena", "brock", "edgd", "randy"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });


    }
}
