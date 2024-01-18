package com.example.onemoretimejava.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry",
                "Fig", "Grapefruit", "Honeydew", "Icaco", "Jackfruit", "Ants");
        //filter(predicate)
        //filter takes a predicate
        //predicate is a boolean values function
        //on this true or false this will filter the elements

        //name starts with a filter that

        List<String> collect = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        List<String> collect1 = names.stream().filter(e -> e.length() == 5).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);


        //map
        //we can perform operation on each element
        //if there is not condition then use map
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> collect2 = num.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect2);


        //sorted
        List<Integer> num2 = List.of(5, 2, 8, 1, 7, 3, 10, 6, 4, 9);
        List<Integer> collect3 = num.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted elements " + collect3);
        //or
        num2.stream().sorted().forEach(System.out::print);

        //min
        Integer minNUmber = num2.stream().min((x, y) -> x.compareTo(y)).get();
        //(x, y) -> x.compareTo(y)   -->  this is called comparators
        System.out.println();
        System.out.println("min num " + minNUmber);


        //max
        Integer maxNum = num2.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxNum);


    }
}
