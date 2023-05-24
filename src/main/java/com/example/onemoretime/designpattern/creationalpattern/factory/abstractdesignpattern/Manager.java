package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class Manager implements Employee {
    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        System.out.println("i am manager");
        return "MANAGER";
    }
}
