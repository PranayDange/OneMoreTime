package com.example.onemoretimejava.lambdaandstreams.example1;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        //older way
        // Walkable ff = new WalkFast();
        //ff.walk(2);

       /* Walkable obj = new Walkable() {
            @Override
            public int walk(int steps) {
                return 0;
            }
        };*/

       /* Walkable obj = (int steps) -> {
            System.out.println("walking fast " + steps * 2 + " counted");
            return 2 * steps;
        };*/
       /* Walkable obj = (int steps,boolean isEnabled) -> {
            System.out.println("walking fast " + steps * 2 + " counted");
            return 2 * steps;
        };*/

        /*Walkable obj = (steps, isEnabled) -> {
            System.out.println("walking fast " + steps * 2 + " counted");
            return 2 * steps;
        };*/
        Walkable obj2 = (steps, isEnabled) -> 2 * steps;
        obj2.walk(4, true);

        //stream
        List<String> ll = List.of("banana", "apple", "pineapple", "grapes","kivis");
        //  Stream<String> stream = ll.stream();
        //or you can directly use
        //  ll.stream().forEach(fruits-> System.out.println("fruits"));
        /*stream.sorted().forEach(fruits -> {
            System.out.println(fruits);
        });*/
       /* stream
                .sorted()
                .map(fruit ->fruit.length()).forEach(fruits -> {
            System.out.println(fruits);
        });*/


        //we cannot use two stream's at a time this will give
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

      /*  stream
                .filter(fruit -> fruit.length() < 6)
                .sorted()
                // .map(fruit ->fruit.length()).forEach(fruits -> {
                //   System.out.println(fruits);
                //})
                .forEach(fruit -> {
                    System.out.println(fruit);
                });*/
        //there are multiple type of cokkectors like you want to collect list map or set
        /*List<Integer> collect = ll.stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());
        System.out.println(collect);*/

        /*Set<Integer> collect = ll.stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toSet());
        System.out.println(collect);*///set is used to remove all duplicate it do not store duplicate value

        Map<String,Integer> collect = ll.stream()
//                .map(fruit -> fruit.length())
                .collect(Collectors.toMap(
                        llC->llC,
                        llC->llC.length()
                ));
        System.out.println(collect);
        ;
    }
}


class WalkFast implements Walkable {

    @Override
    public int walk(int steps, boolean isEnabled) {
        System.out.println("walking fast " + steps * 2 + " counted");
        return 2 * steps;
    }

    //lambda
    //it is a way to create  anonymous instances of functional interfaces


}

//functional interface is  a interface which contains only one method
interface Walkable {
    int walk(int steps, boolean isEnabled);
}

