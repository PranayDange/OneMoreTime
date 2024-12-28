package com.example.java8features.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //predicates are boolean valued function

        //example 1
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        for (Integer i : list) {
            //  System.out.println(isEven.test(i));
        }

        //example 2
        Predicate<String> predicateStartsWithV = x -> x.toLowerCase().charAt(0) == 'v';
        // System.out.println(predicateStartsWithV.test("pranay"));


        //example 3
        Predicate<String> predicateEndsWithL = x -> x.toLowerCase().charAt(x.length() - 1) == 'l';
        Predicate<String> and = predicateStartsWithV.and(predicateEndsWithL);
        Predicate<String> or = predicateStartsWithV.or(predicateEndsWithL);//or --dono meh se ek condtion true honi cahiye
        boolean ss = and.test("vipulllj");
        boolean ss2 = or.test("vipulllj");
        System.out.println(ss);
        System.out.println(ss2);

    }
}
